package commands;

public class UpdateVegetableCommand implements Command {
    @Override
    public void execute() {
        System.out.println("\nОновлення даних овоча (ще не реалізовано)");
    }

    @Override
    public String getDesc() {
        return "Оновлення даних про овочі що є у салаті";
    }
}
