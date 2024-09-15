package catsfactory;

public class Lion extends Cat implements Runner{
    private String leoName;
    public Lion(String name) {
        super(name);
    }
    public void meetCat(Cat cat){
        cat.missLap();
        System.out.println("Встреча со львом. Потеря лапы...");
    }

    public String toString() {
        return "Лев: {" +
                "Имя '" + getName() + '\'' +
                '}';
    }
}
