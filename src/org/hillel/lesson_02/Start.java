package org.hillel.lesson_02;

public class Start {

    public static void main(String[] args) {
	// для того что бы запустить метод print находясь в методе main мы должны выполнить его вызов.
        // Что бы для каждой фразы не писать новый метод print, мы написали один раз метод, а фразы отдельно в main

        print("Hello my dear friends");

        print("Hello my dear friends")

        int r = pow(10);
        System.out.println(r);

        int another = pow(r);
        System.out.println(another);

    }

    public static void print(String text) {
        System.out.println(text);

    }

    public static int pow(int x) {
        int result = x * x;
        return result;
    }
}
