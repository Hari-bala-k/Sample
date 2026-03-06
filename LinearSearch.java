public class LinearSearch {
    static int linearSearch(int[] a,int k){
    for(int i=0;i<a.length;i++){
    if(a[i]==k) return i;
    }
    return 0;
    } 
    public static void main(String[] args) {
        int[] arr ={1,2,3,8,45,7,3,2};
        int k=3;
        System.out.println(linearSearch(arr, k));
    }
}
