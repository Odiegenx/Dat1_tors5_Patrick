package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        //// 3.g
        Room room1 = new Room(2,4,6);
        Room room2 = new Room(1,1,0);
        Room room3 = new Room(1,2,2);
        //// 3.h
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        //// 3.i
        Building building1 = new Building(rooms,1,1,false);
        System.out.println(countLampsInBuilding(building1));
        System.out.println(isNormal(building1));
    }
    //// 3.j
    static int countLampsInBuilding(Building tmpBuilding){

        ArrayList<Room> roomsInBuilding = tmpBuilding.getRooms();
        int totalLamps=0;
        for(Room r: roomsInBuilding){
            totalLamps += r.getNumberOfLamps();
        }
        return totalLamps;
    }
    //// 3.k
    static boolean isNormal(Building tmpBuilding){
        if(tmpBuilding.getNumberOfFloors() > tmpBuilding.getRooms().size()){
            return true;
        }

        System.out.println("This is an odd building");
        return false;
    }
}
