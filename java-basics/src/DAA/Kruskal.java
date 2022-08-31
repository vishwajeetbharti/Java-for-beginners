package DAA;

import java.util.Scanner;

public class Kruskal {
    int ne,sum,n;
    int[][] dist =new int[10][10];
    int[] parant =new int[10];
    void getData(){
        Scanner take =new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        n = take.nextInt();
        System.out.println("Enter the distance matrix: ");
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                dist [i][j]=take.nextInt();
            }
        }
    }
    void mst(){
        int u=0,v=0,min;
        ne=0;
        sum=0;
        for(int i=0;i<n;i++){
         parant[i]=i;
        }
        while(ne!=n-1){
            min=999;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][j]<min){
                        min=dist[i][j];
                        u=i;
                        v=j;
                    }
                }
            }

            if(find(u)!=find(v)){
                System.out.println("Connect "+u+"--->"+v);
                ne++;
                sum=sum+dist[u][v];
                parant[v]=u;
            }
            dist[u][v]=dist[v][u]=999;
        }
        System.out.println("MST = "+sum);
    }
    int find(int x){
        while(x!=parant[x]){
            x=parant[x];
        }
        return x;
    }

    public static void main(String[] args) {
        Kruskal Me = new Kruskal();
        Me.getData();
        Me.mst();
    }
}
