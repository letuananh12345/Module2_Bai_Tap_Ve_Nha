package Bai_Tap_Ve_Nha_1;

public class Main {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        managerStudent.addStudent(new Student(1, "anh", "nam", 23, "c03"));
        managerStudent.addStudent(new Student(2, "tuan", "nam", 21, "c03"));
        managerStudent.addStudent(new Student(3, "hanh", "nam", 18, "c03"));
        managerStudent.addStudent(new Student(4, "quan", "nam", 32, "c03"));
        managerStudent.addStudent(new Student(5, "tien", "nam", 28, "c03"));
        managerStudent.addStudent(new Student(6, "hieu", "nam", 19, "c03"));
        managerStudent.show();
        managerStudent.start();
    }

}
