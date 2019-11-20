package designPattern.statePattern;

import  org.junit.*;

/****
 *   Created by Feng Chen on 11/19/2019
 */
public class RoomStateTest {

    @Test
    public void testStates(){
        Room[] rooms = new Room[2];
        for(int i=0;i<rooms.length;i++)
        {
            rooms[i] = new Room();
        }

        rooms[0].bookRoom();
        rooms[0].checkInRoom();
        //rooms[0].bookRoom();
        System.out.println(rooms[0]);
        System.out.println("-------------");

        rooms[1].checkInRoom();
        rooms[1].bookRoom();
        rooms[1].checkOutRoom();
        rooms[1].bookRoom();
        System.out.println(rooms[1]);
    }

}
