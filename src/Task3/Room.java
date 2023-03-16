package Task3;

public class Room {
    //// 3.a
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;
    //// 3.b
        Room(int tmpnumberOfdoors,int tmpnumberOfLamps,int tmpnumberOfwindows){
        numberOfDoors = tmpnumberOfdoors;
        numberOfLamps = tmpnumberOfLamps;
        numberOfWindows = tmpnumberOfwindows;
        }
    //// 3.c
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
