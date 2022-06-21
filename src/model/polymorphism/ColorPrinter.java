package model.polymorphism;

/**
 * 彩色打印机类
 * Created by IntelliJ IDEA.
 *
 * @author: QCB
 * @create: 2022-06-21-23:57
 * To change this template use File | Settings | File and Code Templates.
 */
public class ColorPrinter extends Printer{
    public void print() {
        System.out.println("I am a color printer.I can print by different colors!");
    }
}
