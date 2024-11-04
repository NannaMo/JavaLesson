package Examples;

public class Student_this {
    int rollno;
    String name;
    float fee;

    Student_this(int rollno, String name, float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display(){
        System.out.println(rollno + " " + name + " " + fee);
    }

    public static void main(String[] args) {
        Student_this st1 = new Student_this(2,"Anna", 85.6f);
        Student_this st2 = new Student_this(3,"Petra", 96.3f);

        st1.display();
        st2.display();

    }
}
