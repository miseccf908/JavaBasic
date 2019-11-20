package cleanCode.com.epam.engx;

import cleanCode.com.epam.engx.thirdpartyjar.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserAccount {

    private static final long EPOCH_TIMESTAMP = 0;
    Balance balance;
    List<Date> paymentDates;
    private List<Service> services;
    private CalculationHistoryService calculationHistoryService;
    public static final double UNIT_RATE = 0.8;

    public void recalculateBalance() {
        for (Service service : services) {
            recalculateService(service);
        }
    }

    private void recalculateService(Service service) {
        History history = calculationHistoryService.retrieveHistory(service);
        payTariff(history, getHighestTariff(service, history));
    }

    private void payTariff(History history, Double highestTariff) {
        history.applyRecalculation(highestTariff, UNIT_RATE);
        balance.updateBalance(highestTariff);
    }

    private Double getHighestTariff(Service service, History history) {
        List<Tariff> tariffs = service.getTariffs();
        Double highestTariff = 0.0;
        for (Tariff tariff : tariffs) {
            highestTariff = Math.max(highestTariff, calculateUnapplied(tariff, history.getAllFees(tariff, service)));
        }
        return highestTariff;
    }

    private Double calculateUnapplied(Tariff tariff, Map<Date, Double> fees) {
        Double sum = 0.0;
        for (Date date : fees.keySet()) {
            if (date.after(getLastCalculationDate()))
                sum += fees.get(date) * getRate(tariff) + tariff.getAdditionalFee();
        }
        return sum;
    }

    private Date getLastCalculationDate() {
        long latest = EPOCH_TIMESTAMP;
        for (Date p : paymentDates)
            latest = Math.max(p.getTime(), latest);
        return new Date(latest);
    }

    private double getRate(Tariff tariff) {
        return (tariff.getType().isUnitBased()) ? UNIT_RATE : 1;
    }

    public void setCalculationHistoryService(CalculationHistoryService calculationHistoryService) {
        this.calculationHistoryService = calculationHistoryService;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public void setPaymentDates(List<Date> paymentDates) {
        this.paymentDates = paymentDates;
    }
}
