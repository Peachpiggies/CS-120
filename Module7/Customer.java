public class Customer {

    private int ID = 294;

    private String name = "Natthanan Rungjarudnon";

    private char gender = 'm';

    public Customer ( int id, String name, char gender ) {}

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
