package designPattern.statePattern;

/****
 *   Created by Feng Chen on 11/8/2019
 */
public interface State {
    void bookRoom();
    void unsubscribeRoom();
    void checkInRoom();
    void checkOutRoom();
}
