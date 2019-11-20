package designPattern.statePattern;
import lombok.*;

/****
 *   Created by Feng Chen on 11/8/2019
 */
@Data
public class Room {
    State freeTimeState;    //空闲状态
    State checkInState;     //入住状态
    State bookedState;      //预订状态

    State state;

    public Room(){
        freeTimeState = new FreeTimeState(this);
        checkInState = new CheckInState(this);
        bookedState = new BookedState(this);

        state = freeTimeState ;  //initial state -> free
    }

    public void bookRoom(){
        state.bookRoom();
    }

    public void unsubscribeRoom(){
        state.unsubscribeRoom();
    }

    public void checkInRoom(){
        state.checkInRoom();
    }

    public void checkOutRoom(){
        state.checkOutRoom();
    }

    public String toString(){
        return "The state of room is:"+getState().getClass().getName();
    }

}
