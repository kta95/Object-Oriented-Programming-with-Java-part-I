
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
        System.out.println(Arrays.toString(values));
    }
 
    public static int smallest(int[] array) {
        int smol = array[0];
        for (int num : array) {
            if (smol > num) {
                smol = num;
            }
        }
        return smol;
    }
    
    public static  int indexOfTheSmallest(int[] array) {
        int smol = smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smol) {
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    // write the code here
        int[] newArray = new int[array.length - index];
        for (int i = 0; i < newArray.length; i++) {
            if (array[i + index] != 0) {
                newArray[i] = array[i + index];                
            }
        }
        return indexOfTheSmallest(newArray) + index;
    } 
    
    public static void swap(int[] array, int index1, int index2) {
        int temp1 = array[index1];
        int temp2 = array[index2];        
        array[index1] = temp2;
        array[index2] = temp1;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smol = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smol);
        }
    }
}
