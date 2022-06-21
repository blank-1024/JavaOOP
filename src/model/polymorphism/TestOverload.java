package model.polymorphism;

/**
 * 重载ccase代码实现
 * Created by IntelliJ IDEA.
 *
 * @author: QCB
 * @create: 2022-06-21-23:58
 * To change this template use File | Settings | File and Code Templates.
 */
// 重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。多态的实现其实就利用了重写的思想。
// 重载是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。 如下所示：
public class TestOverload {
    public int test(){
        System.out.println("test1");
        return 1;
    }

    public void test(int a){
        System.out.println("test2：a is " + a);
    }

    public String test(int a,String s){
        System.out.println("test3, a is " + a + ", s is " + s);
        return "test3";
    }

    public String test(String s,int a){
        System.out.println("test4, s is " + s + ", a is " + a);
        return "test4";
    }

    public static void main(String[] args){
        TestOverload testOverload = new TestOverload();
        System.out.println(testOverload.test());
        testOverload.test(1);
        System.out.println(testOverload.test(1,"test3"));
        System.out.println(testOverload.test("test4",1));
    }
}

