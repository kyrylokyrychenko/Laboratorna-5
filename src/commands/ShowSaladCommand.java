package commands;

public class ShowSaladCommand implements Command {
    @Override
    public void execute() {
        System.out.println("\nПоказати овочі у салаті (ще не реалізовано)");
    }

    @Override
    public String getDesc() {
        return "Показ списку овочів що є у салаті";
    }
}
