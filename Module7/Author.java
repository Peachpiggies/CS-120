/*

 * A class called Author (as shown in the class diagram) is designed to model a book's author. It contains:
    •	Three private instance variables: name (String), email (String), and gender (char of either 'm', 'f', or 'o');
    •	One constructor to initialize the name, email and gender with the given values;

 * (There is no default constructor for Author, as there are no defaults for name, email and gender.)
    •	public getters/setters: getName(), getEmail(), setEmail(), and getGender();
   (There are no setters for name and gender, as these attributes cannot be changed.)
    •	A toString() method that returns "Author[name=?,email=?,gender=?]", e.g., "Author[name=Tan Ah Teck,email=ahTeck@somewhere.com,gender=m]".
   Write the Author class. Also write a test driver called TestAuthor to test all the public methods, e.g.,

 * I'll do as follows from above and make another file as TestAuthor.

*/

public class Author {

    private String name = "Natthanan Rungjarudnon";

    private String email = "Peachpiggies@gmail.com";

    private char gender = 'm';

    public Author(String name, String email) {

        this.name = name;
        this.email = email;

    }

    public Author(String string, String string2, char c) {
    }

    public String getName() {

        return name;

    }

    public String getEmail() {

        return email;

    }

    public char getGender() {

        return gender;

    }

    public String toString() {

        return "Name : " + name + ", Email : " + email + ", Gender : " + gender;

    }

}