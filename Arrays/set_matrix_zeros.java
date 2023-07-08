import java.util.*;

class Main{
    public static void main(String[] args) {
        int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};
        
        //storing all the indices with zeros in hashset
        HashSet<ArrayList<Integer>> hs = new HashSet<>();

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] == 0){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    hs.add(temp);
                }
            }
        }
        for(ArrayList<Integer> list : hs){
            int ind1 = list.get(0);
            int ind2 = list.get(1);
            fillZeros(ind1, ind2, arr);
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    static void fillZeros(int ind1, int ind2, int[][] a){
        //fill the bottom rows
        for(int i = ind1; i<a.length; i++){
            a[i][ind2] = 0;
        }
        //fill the top rows
        for(int i = ind1; i>=0; i--){
            a[i][ind2] = 0;
        }
        //fill the right columns
        for(int i = ind2; i<a[0].length; i++){
            a[ind1][i] = 0;
        }
        // fill the left columns
        for(int i = ind2; i>=0; i--){
            a[ind1][i] = 0;
        }
    }
}