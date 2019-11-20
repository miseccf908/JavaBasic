package designPattern.statePattern;

/****
 *   Created by Feng Chen on 11/8/2019
 */
public class CheckInState implements State {

    private Room hotelManagement;

    public CheckInState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("This room has been subscribed, can not be booked.");
    }

    @Override
    public void unsubscribeRoom() {

    }

    @Override
    public void checkInRoom() {
        System.out.println("This room has been subscribed, can not be checked in again");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("Succeed to check out.");
        hotelManagement.setState(hotelManagement.getFreeTimeState());
    }
}
