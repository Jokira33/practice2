package catsfactory;

public class TestF {
    public static void main(String[] args) {
        RunnersShop runnersShop = new RunnersShop(new RunnerFactory());
        Runner runner = runnersShop.createRunner(RunnerType.LEOPARD);
        Runner runner1 = new Leopard("Леопарл");
        System.out.println(runner);
    }
}
