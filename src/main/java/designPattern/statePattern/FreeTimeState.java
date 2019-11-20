package designPattern.statePattern;

/****
 *   Created by Feng Chen on 11/19/2019
 */
public class FreeTimeState implements State {

    private Room hotelManagement;

    public FreeTimeState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("Succeed to book.");
        hotelManagement.setState(hotelManagement.getBookedState());
    }

    @Override
    public void unsubscribeRoom() {

    }

    @Override
    public void checkInRoom() {
        System.out.println("Succeed to check in.");
        hotelManagement.setState(hotelManagement.getCheckInState());
    }

    @Override
    public void checkOutRoom() {

    }
}
