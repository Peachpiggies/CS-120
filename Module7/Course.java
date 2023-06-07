public class Course {

    private String name;

    private int grade;

    private int totalEnrolled;

    public Course ( String name, int grade, int totalEnrolled ) {

        this.name = name;

        this.grade = grade;

        this.totalEnrolled = totalEnrolled;
        
    }

    public Course ( String name, int grade ) {

        this.name = name;

        this.grade = grade;

    }

    public String getName() {

        return name;

    }

    public int getGrade() {

        return grade;

    }

    public int getTotalEnrolled() {

        return totalEnrolled;

    }

    public void setGrade( int grade ) {

        this.grade = grade;

    }

    public void setTotalEnrolled( int totalEnrolled ) {

        this.totalEnrolled = totalEnrolled;

    }

    public String toString() {

        return "Course: " + name + ", Grade: " + grade + ", Total Enrolled: " + totalEnrolled;
        
    }
}