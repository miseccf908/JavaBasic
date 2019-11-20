package cleanCode.com.epam.engx.thirdpartyjar;

import java.util.Date;
import java.util.Map;

public interface History {

    Map<Date,Double> getAllFees(Tariff tariff, Service service);

    void applyRecalculation(Double value, double unitRate);

}