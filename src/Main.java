import model.classAndObject.Student;
import model.inheritance.Tiger;

/**
 * 创建学生类实例
 * Created by IntelliJ IDEA.
 *
 * @author: QCB
 * @create: 2022-06-20-23:24
 * To change this template use File | Settings | File and Code Templates.
 */
public class Main {
    public static void main(String[] args) {
        // Class And Object Test
        Student student = new Student("Elio", 22, "男", "001");
//        System.out.println(student.toString());
        // Inheritance Test
        Tiger tiger = new Tiger(5, 20.0f);
        System.out.println(tiger.toString());;
        tiger.sound();
    }
}
