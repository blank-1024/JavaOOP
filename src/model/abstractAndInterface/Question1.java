package model.abstractAndInterface;

/**
 * Question1：
 * One cock sells 5 yuan, one hen 3 yuan, and one yuan for three chickens.
 * If you want to buy 100 of them with 100 yuan, how should you buy them?
 * Created by IntelliJ IDEA.
 *
 * @author: QCB
 * @create: 2022-06-22-0:21
 * To change this template use File | Settings | File and Code Templates.
 */
public class Question1 {
    public static void main(String[] args) {
        for (int cock = 0; cock <= 33; cock++) {
            for (int hen = 0; hen <= 20; hen++) {
                for (int chickens = 0; chickens <= 300; chickens+=3) {
                    if (3*cock + 5*hen + chickens/3 == 100 && (cock + hen + chickens) == 100){
                        System.out.println("cock = " + cock + "，hen = " + hen + "，chickens = " + chickens);
                    }
                }
            }
        }
    }

}
