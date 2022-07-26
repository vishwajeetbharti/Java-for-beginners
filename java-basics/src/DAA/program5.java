package DAA;

import java.util.Random;
import java.util.Scanner;

public class program5 {
    public static void divide(int[] a, int low, int high){
        if(low<high){
            int mid=(low+high)/2;
            divide(a,low,mid);
            divide(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void merge(int[] a, int low, int mid, int high){
        int i=low,j=mid+1,k=low;
        int[] b=new int[5000];
        while(i<=mid&&j<=high){
            if(a[i]<a[j]){
                b[k++]=a[i++];
            }
            else{
                b[k++]=a[j++];
            }
        }
        while(i<=mid){
            b[k++]=a[i++];
        }
        while (j<=high){
            b[k++]=a[j++];
        }
        for(k=low;k<=high;k++){
            a[k]=b[k];
        }
    }
    public static void main(String[] args) {
        int n,i;
        int[] a=new int[5000];
        Scanner take =new Scanner(System.in);
        Random rand= new Random();
        System.out.println("Enter n: ");
        n= take.nextInt();
        for (i=0;i<n;i++){
            a[i]=rand.nextInt(1000);
            System.out.println(" "+a[i]);
        }
        System.out.println();
        long t1 =System.nanoTime();
        divide(a,0,n-1);
        long t2 =System.nanoTime();
        System.out.println("***Sorted list***");
        for(i=0;i<n;i++){
            System.out.println(" "+a[i]);
        }
        System.out.println();
        double t3=(t2-t1);
        System.out.println("Time taken for the merge sort in nano sec : "+t3);
        double sec=(double)t3/10000000000.0;
        System.out.println("Which is "+sec+" Seconds.");
    }
}
