import java.util.Scanner;

public class sorter {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Length: ");
        int length = scnr.nextInt();

        System.out.print("Array: ");
        int [] array = new int[length];
        for (int i = 0; i < length; i++){
            array[i] = scnr.nextInt();
        }

        selectionSort(array);
        print(array);
        close Scanner; 
    }

    public static void selectionSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n -1; i++){
            int indexSmallest = i;
            //search for smallest value starting at i+1
            for (int j = i+1; j < n; j++){
                if (array[j] < array[indexSmallest]){
                    indexSmallest = j; //sets smallest value variable equal to the smallest value in iteration
                }
            }
            //swap
            int temp = array [i]; //creates copy of value in array[i]
            array[i] = array[indexSmallest]; //sets array[i] equal to smallest found value in array for the outer loop iteration
            array [indexSmallest] = temp; //sets value that was in array[i] to index of smallest found value for the iteration
        }
    }

    public static void print(int[] array){
        for(int a : array){ //short cut syntax when wanting to loop through an entire array
            System.out.print(a + " ");
        }
        System.out.println();
    }
}