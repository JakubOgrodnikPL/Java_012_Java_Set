import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Mietek");
        names.add("Bolek");
        names.add("Lolek");
        names.add("Siemysław");
        names.add("Wydrwisław");
        names.add("Wydrwisław");
        names.add("Olgierd");
        names.add("Olgierd");
        System.out.println(names);

        names.remove("Mietek");
        boolean isEmpty = names.isEmpty();
        System.out.println(isEmpty);

        boolean zawiera = names.contains("Przemo");
        System.out.println(zawiera);

        names.clear();
        System.out.println(names);

        names.add("Bolek");
        names.add("Lolek");

        for (String element : names){
            System.out.println(element);
        }

        /*List<String> names = new ArrayList<>();
        names.add("Mietek");
        names.add("Bolek");
        names.add("Lolek");
        names.add("Siemysław");
        names.add("Wydrwisław");
        names.add("Wydrwisław");
        names.add("Olgierd");
        names.add("Olgierd");

        System.out.println(names);

        for(String element : names){
            System.out.println(element);
        }

         */
    }
}