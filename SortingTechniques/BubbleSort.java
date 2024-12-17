package SortingTechniques;

public class BubbleSort{

    private static int[] table = null;

    private static void bubbleSort(){

        for (int i = 0; i < table.length - 1; i++) {
            for (int j = i + 1; j < table.length; j++) {
                
            }
        }

    }

    public static void main(String[] args) {
        
        table = new int[]{4,2,6,1,5,3};

        printArray();

        bubbleSort();

        printArray();


    }

    private static void printArray(){

        System.out.println("  ");

        System.out.print("  [ ");

        for(int i = 0 ; i < table.length ; i++){
            System.out.print( table[i] + " ");
        }

        System.out.print("]  ");

        System.out.println("   ");
    }

}
