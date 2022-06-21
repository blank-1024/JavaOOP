package model.abstractAndInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * From Wuhan to Beijing you can choose from 4 means of transportation, including driving a car,
 * taking bus, train, or plane. Driving costs 500 yuan, bus 300 yuan, train 400 yuan,
 * and plane 1000 yuan. With the budget of 500 yuan, which vehicles Xiaoming can choose to get there?
 * Created by IntelliJ IDEA.
 *
 * @author: QCB
 * @create: 2022-06-22-0:35
 * To change this template use File | Settings | File and Code Templates.
 */

public class Question2 {
    public static void main(String[] args) {
        HashMap<String, Integer> transportation = new HashMap<>();
        transportation.put("bus", 300);
        transportation.put("train", 400);
        transportation.put("plane", 1000);
        transportation.put("driving", 500);
        System.out.print("which vehicles Xiaoming can choose to get：");
        for (Map.Entry<String, Integer> entry : transportation.entrySet()) {
            if (entry.getValue() <= 500){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
