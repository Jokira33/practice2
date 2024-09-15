package catsfactory;

public class RunnerFactory {
    public Runner createRunners(RunnerType type){
        return switch (type) {
            case LION -> new Lion("Лев");
            case LEOPARD -> new Leopard("Леопард");
            case SCIENTIFIC -> new Scientific("Ученый");
        };
    }
}
