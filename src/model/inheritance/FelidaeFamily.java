package model.inheritance;

/**
 * 猫科动物类
 * Created by IntelliJ IDEA.
 *
 * @author: QCB
 * @create: 2022-06-21-23:35
 * To change this template use File | Settings | File and Code Templates.
 */
public class FelidaeFamily extends Animal{

    public FelidaeFamily(Integer age, Float weight) {
        super(age, weight);
    }

    public void sound() {
        System.out.println("My sound is meowing meowing meowing~~~");
    }
}