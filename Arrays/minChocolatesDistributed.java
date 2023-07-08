import java.util.*;

public class minChocolatesDistributed {
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56} ;
        int m = 3;
        if(m > arr.length){
            System.out.print("Cannot distribute the Chocolates!!");
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i = 0, j = i + m -1; i<arr.length&&j<arr.length; i++, j++){
            int diff = arr[j] - arr[i];
            min = (diff < min)? diff:min; 
        }

        System.out.print(min);
    }
}
