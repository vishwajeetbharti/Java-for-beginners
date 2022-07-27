package DAA;

import java.util.Scanner;

public class Prim {
    int n,ne,sum;
    int[][] d =new int[10][10];
    int[] visited =new int[10];
    void getData(){
        int i,j;
        Scanner take =new Scanner(System.in);
        System.out.println("Enter number of nodes: ");
        n= take.nextInt();
        System.out.println("Enter the the cost matrix: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                d[i][j]= take.nextInt();
            }
        }
        for(i=0;i<n;i++){
            visited[i]=0;
        }
    }
    void spantree(){
        int i,j,u=0,v=0,min;
        ne=0;
        sum=0;
        visited[0]=1;
        while (ne!=n-1){
            min=999;
            for (i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(d[i][j]<min){
                        if(visited[i]==1&&visited[j]==0){
                            min =d[i][j];
                            u=i;
                            v=j;
                        }
                    }
                }
            }
            System.out.println(u+"---"+v+"="+d[u][v]);
            ne++;
            sum+=d[u][v];
            visited[v]=1;
        }
        System.out.println("Cost of minimum spanning tree = "+sum);
    }

    public static void main(String[] args) {
        Prim obj =new Prim();
        obj.getData();
        System.out.println("Minimum Spaning Tree.....");
        obj.spantree();
    }

}
