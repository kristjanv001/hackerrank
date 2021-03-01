public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int numOfSwaps = 0;
        for(int i = 0; i < a.length-1; i++) {
            for(int j = 0; j < a.length-1; j++) {
                if(a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    
                    numOfSwaps += 1;
                }
            }
        } 
        
        System.out.println("Array is sorted in " + numOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }
}
