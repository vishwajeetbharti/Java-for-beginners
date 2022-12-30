package Practice;
import java.util.*;


public class Testing {
    static int increment=0;
    public static int Partition(int[] a, int low, int high) {
        int i = low + 1, j = high, pivot = a[low];
        try{
        while (i <= j) {
            while (a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                Swap(a, i, j);
            }
        }}
        catch (Exception e)
        {
            System.out.println(e);
        }
        Swap(a, low, j);
        increment++;
        return j;
    }

    public static void Swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void divide(int[] a, int low, int high) {
        if (low < high) {
            int j = Partition(a, low, high);
            divide(a, low, j - 1);
            divide(a, j + 1, high);
        }
    }

    public static void main(String[] args) {
        int n, i;
        int[] a;
        Scanner take = new Scanner(System.in);
        n = take.nextInt();
        a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] =take.nextInt();
        }
        divide(a, 0, n - 1);
        System.out.println(increment/2);
    }
}

