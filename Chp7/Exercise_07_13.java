/*
    Write a method that returns a random number between
    1 and 54, excluding the numbers passed in the argument. The method header is
    specified as follows:
    public static int getRandom(int... numbers)
*/

public class Exercise_07_13 {
    public static void main(String[] args) {
        System.out.printf("The random number is %d%n",
        getRandom(3,5,7,5,4,3,23,53,6,7,44,34,23));
    }

    public static int getRandom(int... numbers) {
        int randomInt;
        boolean inUserValues;
        do
        {
            inUserValues = false;
            randomInt = (int)(Math.random() * 54 + 1);
            for (int i : numbers) {
                if (i == randomInt) {
                    inUserValues = true;
                }
            }            
        } while (inUserValues);

        return randomInt;
    }
}