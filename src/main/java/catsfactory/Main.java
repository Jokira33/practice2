package catsfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Cat cat1 = new Cat("Dasha", 3);
//        Leopard leo1 = new Leopard("Jack", 4);
//        Scientific s1 = new Scientific("Doctor");
//        leo1.meetCat(cat1);
//        cat1.askCat();
//        System.out.println(cat1);
//        s1.meetCat(cat1);
//        cat1.askCat();
//        System.out.println(cat1);


//        List<Runner> runners = new ArrayList<>();
//        runners.add(Leopard::new);
//        runners.add(Scientific::new);
//
//        int randomIndex = 2
//        Runner runner = runners.get(randomIndex).get();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество бегунов");
        int numRunners = scanner.nextInt();
        System.out.println("Введите предположительное число лап у кошечки");
        int numLaps = scanner.nextInt();

        List<Runner> list = new ArrayList<>();
        for (int i = 0; i < numRunners; i++) {
            double rand = Math.random();
            if (rand < 0.5) {
                list.add(new Leopard("Leo"));
            } else {
                list.add(new Scientific("Doctor"));
            }
        }
        System.out.println("Список бегунов: ");
        for(Runner runners : list){
            System.out.println(runners);
        }

        Cat cat = new Cat("Dasha", 4);
        for (Runner runner : list){
            runner.meetCat(cat);
            cat.askCat();
            System.out.println("\n" + cat + "\n");

        }
        int resLaps = cat.getLaps();

        if (numLaps == resLaps){
            System.out.println("\nУгадал! Ты чемпион!");
        }
        else {
            System.out.println("\nНе угадал(( Отправляйся в шкавчик есть брокколи лузер!");
        }

    }
}
