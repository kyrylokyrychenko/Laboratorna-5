package commands;

public class RemoveVegetableCommand implements Command {
    @Override
    public void execute() {
        System.out.println("\nВидалення овоча (ще не реалізовано)");
    }

    @Override
    public String getDesc() {
        return "Видалення овоча з салату";
    }
}
