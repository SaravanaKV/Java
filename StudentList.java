public class StudentList {
    String Name;
    int Age, RollNo;

    public void disp() {
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(RollNo);
    }

    public void setvalues(String name, int age, int rollno) {
        Name = name;
        RollNo = rollno;
        Age = age;
    }
}
class Main {
    public static void main(String[] args) {
        StudentList student1 = new StudentList();
        StudentList student2 = new StudentList();
        StudentList student3 = new StudentList();
        student1.Name = "Saro";
        student2.Name = "Uva";
        student1.RollNo = 007;
        student1.Age = 21;
        student2.RollNo = 020;
        student2.Age = 20;
        student3.setvalues("Deeran", 15, 005);
        student1.disp();
        student2.disp();
        student3.disp();
    }
}
