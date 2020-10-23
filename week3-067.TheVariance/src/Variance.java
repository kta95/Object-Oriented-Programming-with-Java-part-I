import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int result = 0;
        for (int num : list) {
            result += num;
        }
        return result;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int total = list.size();
        return (1.0 * sum(list)) / total;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double num = average(list);
        double temp = 0;
        for (int n : list) {
            temp = temp + (n - num) * (n - num);
        }
        return temp / (list.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
