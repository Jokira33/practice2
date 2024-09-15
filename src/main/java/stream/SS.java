package stream;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SS {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Чтение входной строки
        String input = scanner.nextLine().trim();

        // Множество для хранения уникальных чисел
        Set<Integer> numbers = new TreeSet<>();

        // Разделяем строку по запятой
        String[] intervals = input.split(",");

        // Обрабатываем каждый интервал
        for (String interval : intervals) {
            // Проверяем, является ли интервал диапазоном
            if (interval.contains("-")) {
                String[] bounds = interval.split("-");
                int start = Integer.parseInt(bounds[0]);
                int end = Integer.parseInt(bounds[1]);

                // Добавляем все числа в диапазоне [start, end]
                for (int i = start; i <= end; i++) {
                    numbers.add(i);
                }
            } else {
                // Если это просто число, добавляем его в множество
                numbers.add(Integer.parseInt(interval));
            }
        }

        // Выводим отсортированные числа
        System.out.println(numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

        scanner.close();
    }


}
