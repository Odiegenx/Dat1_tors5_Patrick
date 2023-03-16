package Task3;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
//// 3.I
class MainTest {

    @org.junit.jupiter.api.Test
    void countLampsInBuilding() {
        Room room1 = new Room(2,4,6);
        Room room2 = new Room(1,1,0);
        Room room3 = new Room(1,2,2);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building building1 = new Building(rooms,1,1,false);

        assertEquals(7,Main.countLampsInBuilding(building1));

    }

    @org.junit.jupiter.api.Test
    void isNormal() {
        Room room1 = new Room(2,4,6);
        Room room2 = new Room(1,1,0);
        Room room3 = new Room(1,2,2);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building building1 = new Building(rooms,1,1,false);
        assertEquals(false, Main.isNormal(building1));
    }
}