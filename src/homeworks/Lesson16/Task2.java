package homeworks.Lesson16;
/*Получить массив содержащий ящики из коллекции тремя
способами и вывести на консоль. (Задание с урока)*/

import lesson15.HeavyBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxList = new ArrayList<>();
        HeavyBox[] heavyBoxArray;

        heavyBoxList.add(new HeavyBox(1, 1, 1, 1));
        heavyBoxList.add(new HeavyBox(2, 2, 2, 2));
        heavyBoxList.add(new HeavyBox(3, 3, 3, 3));
        heavyBoxList.add(new HeavyBox(4, 4, 4, 4));


//1
        HeavyBox[] heavyBoxArray1 = heavyBoxList.toArray(new HeavyBox[heavyBoxList.size()]);
        System.out.println(Arrays.toString(heavyBoxArray1));

//2
        int j = 0;
        heavyBoxArray = new HeavyBox[heavyBoxList.size()];
        for (HeavyBox i : heavyBoxList) {
            heavyBoxArray[j++] = i;
        }
        System.out.println(Arrays.toString(heavyBoxArray));

//3
        heavyBoxArray = new HeavyBox[heavyBoxList.size()];
        for (int i = 0; i <= heavyBoxList.size(); i++) {
            heavyBoxArray[i] = heavyBoxList.get(i);
        }
        System.out.println(Arrays.toString(heavyBoxArray));
    }

}
