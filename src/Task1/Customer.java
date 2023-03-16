package Task1;

public class Customer {
    //// 1.a
    private String name;
    private String lastName = "";
    private String userName;
    private int id;

    static int idCounter = 0;
    //// 1.b
        Customer(String tmpName, String tmpUserName){
            idCounter++;
            name = tmpName;
            userName = tmpUserName;
            id = idCounter;
        }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        System.out.println("Kundens navn: "+getName()+" "+getLastName());
        System.out.println("Kundens username: "+getUserName());
        System.out.println("kundens ID: "+getId());
        return super.toString();
    }
}
