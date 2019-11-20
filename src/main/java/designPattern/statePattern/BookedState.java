package designPattern.statePattern;

/****
 *   Created by Feng Chen on 11/8/2019
 */
public class BookedState implements State{

    Room hotelManagement;

    public BookedState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("Room has been booked");
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("succeed to unsubscribe...");
        hotelManagement.setState(hotelManagement.getCheckInState());
    }

    @Override
    public void checkInRoom() {
        System.out.println("Succeed to check in.");
    }

    public void checkOutRoom(){
//        state.checkOutRoom();
    }
}
