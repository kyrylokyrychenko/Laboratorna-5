package commands;

public class CalculateCaloriesCommand implements Command {
    @Override
    public void execute() {
        System.out.println("\nПідрахунок калорій (ще не реалізовано)");
    }

    @Override
    public String getDesc() {
        return "Підрахування калорійності салату";
    }
}