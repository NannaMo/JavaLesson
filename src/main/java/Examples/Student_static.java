package Examples;

public class Student_static {
    int rollno;
    String name;
    static String collage = "ITIS";

    static void change(){
        collage = "BITIS";
    }

    Student_static(int r, String n){
        rollno = r;
        name = n;
    }

    void display(){
        System.out.println(rollno + " " + name + " " + collage);
    }

    public static void main(String[] args) {
        Student_static.change();
        Student_static st1 = new Student_static(2,"Anna");
        Student_static st2 = new Student_static(3, "Petro");

        st1.display();
        st2.display();
    }
}
