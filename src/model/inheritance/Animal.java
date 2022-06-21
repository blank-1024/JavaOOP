package model.inheritance;

/**
 * 动物类
 * Created by IntelliJ IDEA.
 *
 * @author: QCB
 * @create: 2022-06-21-23:34
 * To change this template use File | Settings | File and Code Templates.
 */
public class Animal {

    private Integer age;
    private Float weight;

    public void running() {
        System.out.println("I am running");
    }
    public void eating() {
        System.out.println("I am eating");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

    public Animal(Integer age, Float weight) {
        this.age = age;
        this.weight = weight;
    }
}
