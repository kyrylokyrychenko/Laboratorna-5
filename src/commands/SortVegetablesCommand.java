package commands;

public class SortVegetablesCommand implements Command {
    @Override
    public void execute() {
        System.out.println("\nСортувати овочі (ще не реалізовано)");
    }

    @Override
    public String getDesc() {
        return "Сортування овочів що належать до салату за одним з параметрів";
    }
}
