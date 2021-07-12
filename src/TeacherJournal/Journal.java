package TeacherJournal;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    public static void excellent(ArrayList<Integer> number) {
        int k = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : number
        ) {
            if (i == 5) {
                list.add(number.get(k));
            }
            k++;
        }
    }
}
