import java.util.*;
import commands.*;

class Menu {
    private Map<String, Command> commands = new LinkedHashMap<>();
    private Scanner sc = new Scanner(System.in);

    public Menu() {
        init();
    }

    public void init() {
        commands.put("додати", new AddVegetableCommand());
        commands.put("показати", new ShowSaladCommand());
        commands.put("підрахувати", new CalculateCaloriesCommand());
        commands.put("сортувати", new SortVegetablesCommand());
        commands.put("знайти", new FindVegetablesByCaloriesCommand());
        commands.put("видалити", new RemoveVegetableCommand());
        commands.put("оновити", new UpdateVegetableCommand());
    }

    public void show() {
        System.out.println("\n===== МЕНЮ САЛАТУ =====");
        for (Map.Entry<String, Command> entry : commands.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getDesc());
        }
        System.out.println("вихід - Вихід з програми");
    }

    public void execute(String choice) {
        Command command = commands.get(choice);
        if (command != null)
            command.execute();
        else
            System.out.println("Невірний вибір!");
    }

    public void start() {
        while (true) {
            show();
            System.out.print("Виберіть пункт меню: ");
            String choice = sc.nextLine().trim().toLowerCase();

            if (choice.equals("вихід")) {
                System.out.println("\nВихід з програми...");
                break;
            }

            execute(choice);
        }
    }

}


