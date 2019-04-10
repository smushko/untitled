package homeworks.lesson13.task5;

import homeworks.lesson12.task7.Employee;

import java.io.Serializable;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class aClass = Employee.class;
        System.out.println(Arrays.toString(new boolean[]{aClass.isPrimitive()}));
        System.out.println(Arrays.toString(new boolean[]{aClass.isArray()}));
        System.out.println(Arrays.toString(aClass.getConstructors()));
        System.out.println(Arrays.toString(new boolean[]{aClass.isArray()}));
        System.out.println(Arrays.toString(new boolean[]{aClass.isInterface()}));
        System.out.println(Arrays.toString(new boolean[]{aClass.isPrimitive()}));
        System.out.println(Arrays.toString(aClass.getDeclaredClasses()));
        System.out.println(Arrays.toString(aClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(aClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(aClass.getDeclaredFields()));
        System.out.println(Arrays.toString(aClass.getClasses()));
        System.out.println(Arrays.toString(aClass.getConstructors()));
        System.out.println(Arrays.toString(aClass.getMethods()));
        System.out.println(Arrays.toString(aClass.getFields()));
    }
}
