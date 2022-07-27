package DAA;
import java.util.*;

public class Knapsack {
    int n,m;
    int[] w =new int[10];
    int[] p =new int[10];
    int[][] v = new int[10][10];
    void getData(){
        Scanner take =new Scanner(System.in);
        System.out.println("Enter hte number of item: ");
        n = take.nextInt();
        System.out.println("Enter the weight of the item: ");
        for(int i=0; i<n;i++){
            w[i]= take.nextInt();
        }
        System.out.println("Enter the profit of each item: ");
        for(int i=0;i<n;i++){
            p[i]= take.nextInt();
        }
        System.out.println("Enter the Maximum capacity: ");
        m = take.nextInt();
    }
    int Max (int x,int y){
        if(x>y)
            return x;
        else
            return y;
    }
    void optimal(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0)
                    v[i][j]=0;
                else if (w[i]>j) {
                    v[i][j]=v[i-1][j];
                }
                else
                    v[i][j]=Max(v[i-1][j],p[i]+v[i-1][j-w[i]]);
            }
        }
    }
    void display(){
        System.out.println("***********************");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("  "+v[i][j]);
            }
            System.out.println();
        }
        System.out.println("Optimal solution = "+v[n][m]);
    }

    public static void main(String[] args) {
        Knapsack obj =new Knapsack();
        obj.getData();
        obj.optimal();
        obj.display();
    }
}
