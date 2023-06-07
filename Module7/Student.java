import java.util.ArrayList;

public class Student {

    private String name;
    private String phoneNumber;
    private String email;
    private ArrayList<Course> enrolledList;

    public Student(String name, String phoneNumber, String email) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.enrolledList = new ArrayList<Course>();

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getPhoneNumber() {

        return phoneNumber;

    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;

    }

    public void enrollStudent(Course courseIn) {

        enrolledList.add(courseIn);
        courseIn.setTotalEnrolled(courseIn.getTotalEnrolled() + 1);

    }

    public void printCourses() {

        for (Course course : enrolledList) {

            System.out.println(course);

        }

    }

    public String toString() {

        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Email: " + email;

    }
    
}