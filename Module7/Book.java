/*
 * A class called Book is designed (as shown in the class diagram) to model a book written by one author. It contains:
    •	Four private instance variables: name (String), author (of the class Author you have just created, assume that a book has one and only one author), price (double), and qty (int);
    •	Two constructors:
        •	public Book (String name, Author author, double price) { ...... }
            public Book (String name, Author author, double price, int qty) { ...... }
    •	public methods getName(), getAuthor(), getPrice(), setPrice(), getQty(), setQty().
    •	A toString() that returns "Book[name=?,Author[name=?,email=?,gender=?],price=?,qty=?".  You should reuse Author’s toString().
Write the Book class (which uses the Author class written earlier). Also write a test driver called TestBook to test all the public methods in the class Book. Take Note that you have to construct an instance of Author before you can construct an instance of Book. E.g.,

*/

public class Book {

    private String name = "Minecraft Guide";

    private Author author;

    private double price = 19.95;

    private int qty = 99;

    public Book ( String name, Author author, double price ) {}

    public Book ( String name, Author author, double price, int qty ) {}

    public String getName() {
        
        return name; 
    
    }

    public Author getAuthor() {

        return author;

    }

    public double getPrice() {

        return price;

    }

    public void setPrice ( double price ) {

        this.price = price;

    }

    public int getQty() {

        return qty;

    }

    public void setQty ( int qty ) {

        this.qty = qty;

    }

    public String toString() {

        return "Book's name : " + name + " Author's info : " + author + " Book price : " + price + " Book quantity : " + qty;

    }
    
}
