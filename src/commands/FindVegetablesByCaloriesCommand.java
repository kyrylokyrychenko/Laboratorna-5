package commands;

public class FindVegetablesByCaloriesCommand implements Command {
    @Override
    public void execute() {
        System.out.println("\nПошук овочів за діапазоном калорійності (ще не реалізовано)");
    }

    @Override
    public String getDesc() {
        return "Пошук овочів за діапазоном калорійності, що вже належать до салату";
    }
}
