package catsfactory;

public class Leopard extends Cat implements Runner{

    private String leoName;
    public Leopard(String name) {
        super(name);
    }
//    public Leopard(){
//        super();
//        leoName = "Leo";
//    }

    public void meetCat(Cat cat){
        cat.missLap();
        System.out.println("Встреча с леопардом. Потеря лапы...");
    }

    public String toString() {
        return "Леопард: {" +
                "Имя '" + getName() + '\'' +
                '}';
    }
}
