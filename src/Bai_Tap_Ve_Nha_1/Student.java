package Bai_Tap_Ve_Nha_1;

public class Student {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String lop;

    public Student() {
    }

    public Student(int id, String name, String gender, int age, String lop) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.lop = lop;
    }

    public int getId() {
        return id;
    }

    public void setId(int  id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", lop=" + lop +
                '}';
    }

}
