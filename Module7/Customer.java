public class Customer {

    private int ID;

    private String name;

    private char gender;

    public Customer ( String name, int id ) {}

    public int getId() {

        return ID;

    }

    public String getName() {

        return name;

    }

    public char getGender() {

        return gender;

    }

    public String toString() {

        return "Name : " + name + " ID : " + ID + " gender : " + gender;

    }
    
}
