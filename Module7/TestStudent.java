public class TestStudent {

    public static void main(String[] args) {

        Course course1 = new Course("Math", 90);
        Course course2 = new Course("Science", 85);
        Course course3 = new Course("English", 95);

        Student student1 = new Student( "Peach", "+66 82 198 9499", "Peachpiggies@gmail.com" );
        student1.enrollStudent(course1);
        student1.enrollStudent(course2);

        Student student2 = new Student( "Pear", "+66 98 247 6654", "PearThePuppies@gmail.com" );
        student2.enrollStudent(course2);
        student2.enrollStudent(course3);

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("Courses enrolled by student1:");
        student1.printCourses();

        System.out.println("Courses enrolled by student2:");
        student2.printCourses();

    }

}