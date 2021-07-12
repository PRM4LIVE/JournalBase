import java.util.ArrayList;

public class ArrayListCat {
    public static void main(String[] args) {
        ArrayList<String> cat = new ArrayList<>();
        cat.add("Vaska");
        cat.add("Barsik");
        cat.add("Vasilisa");
        for (String i: cat
             ) {
            System.out.println(i);
        }
    }
}
