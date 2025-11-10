package commands;

public class AddVegetableCommand implements Command {
    @Override
    public void execute() {
        System.out.println("\n Додати овоч до салату (ще не реалізовано)");
    }

    @Override
    public String getDesc() {
        return "Додати овоч до салату";
    }
}