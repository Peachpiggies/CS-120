public class TestBook {

    public static void main(String[] args) {

        Author a1 = new Author("Natthanan", "Peachpiggies@gmail.com", 'm');
        System.out.println(a1);

        Book b1 = new Book ( "Minecraft Guide", a1, 19.95, 99 );
        System.out.println(b1);  
        
        b1.setPrice(29.95);
        b1.setQty(28);
        System.out.println( "Name is : " + b1.getName() );
        System.out.println( "Price is : " + b1.getPrice() );
        System.out.println( "Quantity is : " + b1.getQty() );
        System.out.println( "Author is : " + b1.getAuthor() );
        System.out.println( "Author's name is : " + b1.getAuthor().getName() );
        System.out.println( "Author's email is : " + b1.getAuthor().getEmail() );

        Book b2 = new Book ( "Basic Japanese", new Author("Kirattinun Rungjarudnon", "PearThePuppies@gmail.com", 'f' ), 29.95 );
        System.out.println(b2);  

    }
    
}
