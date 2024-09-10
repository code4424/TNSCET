public class WarehouseCrateOrganizer {
    public static void organizeCrates(int[] crates) {
        int nonEmptyPointer = 0;
        
        for (int i = 0; i < crates.length; i++) 
        {

            if (crates[i] != 0) {
                int temp = crates[nonEmptyPointer];
                crates[nonEmptyPointer] = crates[i];
                crates[i] = temp;

                nonEmptyPointer++;
            }
        }
    }

    public static void main(String[] args) {
        int[] crates = {1, 0, 2, 0, 3, 0, 4};
        System.out.println("Before" + java.util.Arrays.toString(crates));
        organizeCrates(crates);
        System.out.println("After: " + java.util.Arrays.toString(crates));
    }
}