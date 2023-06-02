public class TestAuthor {

    public static void main(String[] args) {

        Author a1 = new Author("Natthanan Rungjarudnon", "Peachpiggies@gmail.com", 'm');

        System.out.println("The author name is : " + a1.getName());
        System.out.println("The author email is : " + a1.getEmail());
        System.out.println("The author gender is : " + a1.getGender());

    }
    
}