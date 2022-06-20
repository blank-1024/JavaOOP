package model;

/**
 * 学生类
 * Created by IntelliJ IDEA.
 *
 * @author: QCB
 * @create: 2022-06-20-23:22
 * To change this template use File | Settings | File and Code Templates.
 */
public class Student {

    private String name;
    private Integer age;
    private String gender;
    private String ID;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Student(String name, Integer age, String gender, String ID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
    }
}
