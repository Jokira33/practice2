package practicStroki;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите строку");
        Scanner scan = new Scanner(System.in);
        String stroka = scan.next();

        String[] newStroka = stroka.split(",");

        System.out.println(Arrays.toString(newStroka));



    }
}
