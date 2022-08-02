package DAA;
import java.util.*;

public class Floyd_algorithm {
    int n;
    int[][] dist=new int [10][10];

    void getData(){
        System.out.println("Enter the number of nodes: ");
        Scanner read =new Scanner(System.in);
        n= read.nextInt();
        System.out.println("Enter the distance of martix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                dist[i][j]=read.nextInt();
            }
        }
    }
    void shortest()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    dist[j][k]=min(dist[j][k],dist[j][i]+dist[i][k]);
                }
            }
        }
    }
    int min(int x,int y)
    {
        if(x<y)
            return x;
        return y;
    }
    void display()
    {
        System.out.println("---------------------------All-Pair-Shortest-Path-------------------------");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+dist[i][j]);
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        Floyd_algorithm ob =new Floyd_algorithm();
        ob.getData();
        ob.shortest();
        ob.display();


    }
}
