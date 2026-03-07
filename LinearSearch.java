import java.util.Scanner;

public class LinearSearch {

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        int key = 3;
        System.out.println("Enter the array value:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = linearSearch(arr, key);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}