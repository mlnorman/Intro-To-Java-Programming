/*
    Write the following method that shuffles an ArrayList of numbers:
    public static void shuffle(ArrayList<Number> list)
*/
import java.util.ArrayList;

public class Exercise_13_02 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
    
        list.add(21);
        list.add(2);
        list.add(24);
        list.add(67);
        list.add(1);
        list.add(3);
        list.add(53);

        shuffle(list);

        System.out.println(list.toString());
    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int switchValue = (int) (Math.random() * list.size());
            Number temp = list.get(switchValue);
            list.set(switchValue, list.get(i));
            list.set(i, temp);
        }
    }
}

