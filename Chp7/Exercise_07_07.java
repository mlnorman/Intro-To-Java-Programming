/*
    Write a program that generates 100 random integers between
    0 and 9 and displays the count for each number.
*/

public class Exercise_07_07 {
    public static void main(String[] args) {
        int[] randomInts = new int[100];
        int[] count = new int[10];
        
        // generate an array with 100 random integers between 0-9
        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = (int)(Math.random() * 10);
        }
        // counts the occurence or each int
        for (int num : randomInts) {
            addToCount(num, count);
        }
        // displays the muber of times each integer occured
        System.out.println("Counts:");
        for (int j = 0; j < count.length; j++) {
            System.out.printf("%d : %d%n", j, count[j]);
        }
    }

    public static void addToCount(int num, int[] count) {
        /*
            When passed an integer 0-9, adds 1 to the count for that 
            integer in the count array.
        */    

        switch (num)
        {
            case 0:
                count[0] += 1;
                break;
            case 1:
                count[1] += 1;
                break;
            case 2:
                count[2] += 1;
                break; 
            case 3:
                count[3] += 1;
                break;
            case 4:
                count[4] += 1;
                break;
            case 5:
                count[5] += 1;
                break;
            case 6:
                count[6] += 1;
                break;
            case 7:
                count[7] += 1;
                break;
            case 8:
                count[8] += 1;
                break;
            case 9:
                count[9] += 1;
                break;
            default:
                break;
        }
    }
}