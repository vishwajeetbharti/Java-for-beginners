package DAA;

import java.util.Scanner;

public class Djikstra {
    int n;
    int[][] dist =new int[10][10];

    void getData(){
        Scanner take =new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        n= take.nextInt();
        System.out.println("Enter distance matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=take.nextInt();
            }
        }
    }
    void shortest(){
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    dist[i][j]=min(dist[i][j],dist[i][k]+dist[k][j]);
                }
            }
        }
    }
    int min(int x,int y){
        if(x<y){
            return x;
        }
        return y;
    }
    void display(){
        Scanner take =new Scanner(System.in);
        System.out.println("Enter the Source: ");
        int source=take.nextInt();
        System.out.println("-----Shortest path given source-----: ");
        for(int i=0;i<n;i++){
            System.out.println(source+" ---> "+i+" = "+dist[source][i]);
        }
    }

    public static void main(String[] args) {
        Djikstra me = new Djikstra();
        me.getData();
        me.shortest();
        me.display();
    }
}
