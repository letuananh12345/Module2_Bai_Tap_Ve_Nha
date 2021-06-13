package Bai_Tap_Ve_Nha_1;

import java.util.Scanner;

public class ManagerStudent {
    Student[] list = new Student[1000];
    int size = 0;
    Scanner sc = new Scanner(System.in);

    public ManagerStudent() {
    }

    void addStudent(Student student) {
        list[size] = student;
        size++;

    }

    Student creatStudent() {
        System.out.println("Nhập id :");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập name :");
        String name = sc.nextLine();
        System.out.println("Nhập gender :");
        String gender = sc.nextLine();
        System.out.println("Nhập age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập lớp: ");
        String lop = sc.nextLine();
        Student student = new Student(id, name, gender, age, lop);
        return student;
    }

    void addStudet() {
        list[size] = creatStudent();
        size++;
    }

    void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
        System.out.println();
    }

    public int searchByName(int id) {
        for (int i = 0; i < size; i++) {
            if (list[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void editStudent() {
        System.out.println("Nhập id cần tìm  : ");
        int id = sc.nextInt();
        if (searchByName(id) != -1) {
            System.out.println("Student hiện tại muốn sửa là: " + list[searchByName(id)]);
            list[searchByName(id)] = creatStudent();
        } else {
            System.out.println(" No id :");
        }
//      list[searchByName(name)]=student;
        show();
    }

    public void deleteStudent() {

        System.out.println("Nhập id cần xóa : ");
        int  id = sc.nextInt();
        int index = searchByName(id);
        if (index != -1) {
            for (int i = index; i < size; i++) {
                list[i] = list[i + 1];
            }
            size--;
            show();

        } else {
            System.out.println(" Không có id cần tìm");
        }

    }

    void menu() {
        System.out.println("Menu : ");
        System.out.printf("%-12s%-12s%s\n", "1.Thêm", "2.Sửa", "3.Xóa");
        System.out.printf("%-12s%-12s%s\n", "0.Exit", "4.Hiển Thị", " ");
    }

    void start() {
        int choice;

        do {
            menu();
            System.out.println("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addStudet();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    show();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println(" No Choice !");
            }

        } while (choice <= 4 && choice > 0);


    }
}
