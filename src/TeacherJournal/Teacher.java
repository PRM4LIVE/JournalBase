package TeacherJournal;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> people = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Размер журнала");
        int data1 = scanner.nextInt();
        System.out.println("Фамилия, \n оценка");
        int k = 0;
        for (int i = 0; i < data1; i++) {
            String name = scanner.next();
            people.add(name);
            int data2 = scanner.nextInt();
            number.add(data2);
        }
        System.out.println("Введите <<двоешники>>(2) или <<отличники>>(5) либо <<журнал>>(0)");
        String menu = scanner.next();
        if (menu.equals("журнал")|| menu.equals("0"))
            for (int j = 0; j < data1; j++) {
                System.out.println(people.get(j) + " - " + number.get(j));
            }
        if (menu.equals("двоешники") || menu.equals("2")) {
            for (int i : number
            ) {
                if (i == 2) {
                    System.out.println(people.get(k) + " - " + i);
                }
                k++;
            }
            if (menu.equals("отличники") || menu.equals("5")) {
                /*for (int i : number
                ) {
                    if (i == 5) {
                        System.out.println(people.get(k) + " - " + i);
                    }
                    k++;
                }*/

            }
            else System.out.println("Введены не корректные данные");
        }
    }
}