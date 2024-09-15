package catsfactory;


public class RunnersShop {
    private final RunnerFactory runnerFactory;

    public RunnersShop(RunnerFactory runnerFactory) {
        this.runnerFactory = runnerFactory;
    }
    public Runner createRunner(RunnerType type){
        Runner runner = runnerFactory.createRunners(type);


        return runner;
    }
}
