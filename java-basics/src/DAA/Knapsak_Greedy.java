package DAA;
import java.util.*;
public class Knapsak_Greedy {
    int n;
    float m,sum;
    float[] w= new float[10];
    float[] p=new float[10];
    float[] x=new float[10];
    void getData(){
        Scanner take =new Scanner(System.in);
        System.out.println("Enter the number of item: ");
        n= take.nextInt();
        System.out.println("Enter the weight of each item: ");
        for(int i=0;i<n;i++){
            w[i]= take.nextFloat();
        }
        System.out.println("Enter thre profit of each item: ");
        for(int i=0;i<n;i++){
            p[i]= take.nextFloat();
        }
        System.out.println("Enter the max capacity: ");
        m=take.nextFloat();
    }
    void optimal(){
        int i;
        float rem;
        for(i=0;i<n;i++){
            x[i]=0;
        }
        rem=m;
        sum=0;
        for(i=0;i<n;i++){
           if(w[i]>rem)
               break;
           x[i]=1;
           sum+=p[i];
           rem-=w[i];
        }
        if(i<=n){
            x[i]=rem/w[i];
            sum+=(rem/w[i]*p[i]);

        }
    }
    void display(){
        int i;
        System.out.println("Optimal solution = "+sum);
        System.out.println("Item selected weight and profit: ");
        for(i=0;i<n;i++){
            System.out.println(x[i]*w[i]+"-->"+x[i]*p[i]);
        }
    }

    public static void main(String[] args) {

        Knapsak_Greedy Kick_It =new Knapsak_Greedy();
        Kick_It.getData();
        Kick_It.optimal();
        Kick_It.display();
    }
}
