package homeworks.Lesson16;
/*
Создать очередь, содержащую объекты класса HeavyBox. Используем
класс ArrayDeque. Поместить объекты в очередь с помощью метода
offer(). Удалить объекты методом poll().  (Задание с урока)
*/

import lesson15.HeavyBox;

import java.util.ArrayDeque;

public class Task6 {
    public static void main(String[] args) {
        ArrayDeque<HeavyBox> boxes = new ArrayDeque<>();
        boxes.offer(new HeavyBox(1, 1, 1, 1));
        boxes.offer(new HeavyBox(2, 2, 2, 2));
        boxes.offer(new HeavyBox(3, 3, 3, 3));
        boxes.offer(new HeavyBox(4, 4, 4, 4));
        boxes.forEach(i ->System.out.println(i));

        while (boxes.poll()!=null){}
        System.out.println(boxes);

    }
}
