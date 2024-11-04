package Examples;

public class Student_constructor {
    int rollno;
    String name;
    String course;
    float fee;

    Student_constructor(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    Student_constructor(int rollno, String name, String course, float fee){
        this(rollno,name,course);
        this.fee = fee;

    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }

    public static void main(String[] args) {
        Student_constructor st1 = new Student_constructor(2, "Anton","finance", 85.6f);
        Student_constructor st2 = new Student_constructor(4,"Petra", "IT");

        st1.display();
        st2.display();
    }
}
