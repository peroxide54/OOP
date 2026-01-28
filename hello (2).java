import java.util.ArrayList;

public class FilterNames {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Артем");
        names.add("Владимир");
        names.add("Александр");
        names.add("Елена");
        names.add("Антон");
        names.add("Дмитрий");
        names.add("Анастасия");
        names.add("Павел");
        
        System.out.println("Имена, начинающиеся на 'А':");
        for (String name : names) {
            if (name.startsWith("А")) {
                System.out.println("- " + name);
            }
        }
    }
}