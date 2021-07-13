package TeacherJournal;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Journal extends Teacher{
    public void excellent (ArrayList<Integer> number, ArrayList<String> people) {
        int k = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : number
        ) {
            if (i == 5) {
                System.out.println(people.get(k) + " - " + number.get(k));
            }
            k++;

        }
        return;
    }
}
