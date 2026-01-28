import java.util.ArrayList;
import java.util.Collections;

public class TaskList {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Яблоко");
        items.add("Груша");
        items.add("Апельсин");
        items.add("Персик");
        items.add("Слива");

        System.out.println("Список элементов:");
        for (String item : items) {
            System.out.println("- " + item);
        }

        System.out.println("\nУдаляем третий элемент:");
        items.remove(2);
        
        System.out.println("Список после удаления:");
        for (String item : items) {
            System.out.println("- " + item);
        }

        boolean containsApple = items.contains("Яблоко");
        System.out.println("\nСодержит 'Яблоко'? " + containsApple);

        Collections.sort(items);
        System.out.println("\nОтсортированный список:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
