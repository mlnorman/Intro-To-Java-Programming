/*
    Linear search an array.
*/

public class LinearSearch {
    public static int LinearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i
        }
        return -2;
    }
}