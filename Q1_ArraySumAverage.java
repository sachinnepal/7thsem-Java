
import java.util.*;

public class Q1_ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int num : arr){
            sum += num;
        }

        double avg = sum / 10.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
