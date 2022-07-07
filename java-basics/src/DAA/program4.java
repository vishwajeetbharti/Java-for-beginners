package DAA;
import java.util.*;


public class program4 {
    public static int Partition(int[] a, int low, int high){
        int i=low+1,j=high,pivot=a[low];
        while (i<=j){
            while (a[i]<=pivot){
                i++;
            }
            while(a[j]>pivot){
                j--;
            }
            if(i<j){
                Swap(a,i,j);
            }
        }
        Swap(a,low,j);
        return j;
    }
    public static void Swap(int[] a, int x, int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    public static void divide(int[] a, int low, int high){
        if(low<high){
            int j=Partition(a,low,high);
            divide(a,low,j-1);
            divide(a,j+1,high);
        }
    }
    public static void main(String[] args) {
        int n,i;
        int[] a =new int[50];
        Scanner take =new Scanner(System.in);
        Random rand =new Random();
        System.out.println("Enter n: ");
        n= take.nextInt();
        System.out.println("Enter item: ");
        for(i=0;i<n;i++){
            a[i]=rand.nextInt(1000);
            System.out.println(" "+a[i]);
        }
        System.out.println();
        long t1=System.nanoTime();
        divide(a,0,n-1);
        long t2=System.nanoTime();
        System.out.println("\nTime="+(t2-t1));
        System.out.println("***Sorted Array***");
        for(i=0;i<n;i++){
            System.out.println(" "+a[i]);
        }
    }
}
