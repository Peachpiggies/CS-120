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

    private String name;

    private Author author;

    private double price;

    private int qty;
    
}
