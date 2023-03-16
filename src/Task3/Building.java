package Task3;

import java.util.ArrayList;
//// 3.d
public class Building {

    final ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;
        //// 3.e
        Building(ArrayList tmpRooms, int tmpnumberOfBathRooms, int tmpnumberOfFloors, boolean tmpisOfficeBuilding){
           rooms = tmpRooms;
           numberOfBathrooms = tmpnumberOfBathRooms;
           numberOfFloors = tmpnumberOfFloors;
           isOfficeBuilding = tmpisOfficeBuilding;
        }
    //// 3.f
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
