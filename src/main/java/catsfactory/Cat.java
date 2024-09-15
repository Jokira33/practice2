package catsfactory;

public class Cat {
    private String name;
    private int laps;

    public Cat(String name, int laps) {
        this.name = name;
        this.laps = laps;
    }

    public Cat(String name){
        this.name = name;
    }

    public int getLaps() {
        return laps;
    }

    public String getName() {
        return name;
    }
    public void missLap(){
        laps = laps - 1;
    }
    public void addLap(){
        laps = laps + 1;
    }
    public void askCat(){
        if (laps <= 0){
            System.out.println("Кошка: <<Я червяк...>>");
        }
        else if (laps > 4){
            System.out.println("Кошка: <<Я хуйня непонятная...>>");
        }
        else System.out.println("Кошка: <<Я еще кошечка мяу...>>");
    }
    public void meetRunner(){

    }
    @Override
    public String toString() {
        return "Кошечка: " +
                "Имя '" + name + '\'' +
                ", Лапы " + laps +
                '}';
    }
}
