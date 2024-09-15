package builderrr;

public class Cat {
    private String name;
    private int laps;
    public Cat(CatBuilder catBuilder) {
        name = catBuilder.name;
        laps = catBuilder.laps;
    }
    public int getLaps() {
        return laps;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Кошка: ").append(name).append(", лапы = ").append(laps);
        return builder.toString();
    }

    public static class CatBuilder{
        private String name;
        private int laps;
        public CatBuilder(String name, int laps) {
            this.name = name;
            this.laps = laps;
        }

        public Cat build(){
            return new Cat(this);
        }
    }

}
 class Main {
    public static void main(String[] args) {
        Cat cat = new Cat.CatBuilder("Dasha", 4).build();
        System.out.println(cat);
    }
}
