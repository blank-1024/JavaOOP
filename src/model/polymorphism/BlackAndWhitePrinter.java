package model.polymorphism;

/**
 * 黑白打印机类
 * Created by IntelliJ IDEA.
 *
 * @author: QCB
 * @create: 2022-06-21-23:57
 * To change this template use File | Settings | File and Code Templates.
 */
public class BlackAndWhitePrinter extends Printer{
    public void print() {
        System.out.println("I am a black and white printer. I can print by only the black color.");
    }
}
