package catsfactory;

public class Scientific implements Runner{
    private String name;

    public Scientific(String name) {
        this.name = name;
    }
    public void meetCat(Cat cat){
        cat.addLap();
        System.out.println("Встреча с ученым. Пришиваем лапку...");
    }

    @Override
    public String toString() {
        return "Ученый {" +
                "Имя '" + name + '\'' +
                '}';
    }
}
