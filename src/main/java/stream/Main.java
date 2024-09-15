package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

//    ArrayList<Integer> list = new ArrayList<Integer>(20);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 21; i++){
            list.add(i);
        }
        List<String> list2 = List.of("a", "b", "c", "d", "e","f","g","h","i");

        System.out.println("poradok");
        list.stream()
                .sorted() // сортировка по возрастанию
                .forEach(System.out::println);
        System.out.println("ne po poradku");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("chisla % 3 == 0");
        list.stream()
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println);
        System.out.println("chisla < 10");
        list.stream()
                .filter(x -> x < 10)
                .forEach(System.out::println);
        System.out.println("chtn chisla chisla v 2 < 20");
        list.stream()
                .filter(x -> x % 2 == 0 && Math.pow(x,2) < 20)
                .forEach(System.out::println);
        System.out.println("summa");
        int sum1 = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        int sum2 = list.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum2);

        String result = list2.stream()
                .reduce(String::concat).get();
        System.out.println(result);

        System.out.println("alfavit");
        list.stream()
                .map(element -> 1 + 'a' + element)
                .collect(Collectors.toList());
        System.out.println("на исключение");
        //        list.stream()
//                .filter(Objects::nonNull)
//                .filter(x -> x == 50)
//                .findFirst()
//                .orElseThrow(() -> new IllegalArgumentException("no element"));


        System.out.println("Gbcmrf");
        var t = list.stream()
                .map(x -> {
                    var s = new ArrayList<Object>(List.of());
                    for (int i=1; i<=x; i++){
                        if (x % i == 0){
                            s.add(i);
                        }

                }
                    return s;
                }).map(x->List.of(x.getLast(), x)).toList();
        System.out.println(t);
        var fields = List.of("number", "age", "national");
        var values = List.of("~!!@#$", "", "ХУЙ");
        // number !@#
        // number ""
        Object[][] data = (Object[][]) fields.stream().flatMap(x -> values.stream().map(y -> new Object[]{x, y})).toList().toArray();
        for (int i = 0 ; i< data.length; i++){
            for (int j =0; j< data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(arr);

//        int divisor = 0;
//        list.stream()
//                .collect(Collectors.toMap(
//                number -> number,
//                number -> Math.floorMod(number, divisor))


//        IntStream stream = list.stream().mapToInt(Integer::valueOf);
//                stream.mapToObj(Integer::valueOf).collect(Collectors.toMap(
//                            number -> number,
//                            number -> Math.floorMod(number, divisor)
//                    );
    }
}
