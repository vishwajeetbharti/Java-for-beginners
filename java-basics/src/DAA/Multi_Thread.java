package DAA;
import  java.util.*;




class Rand extends Thread{
    public  int result;
    static  int num;
    public  int generate(){
        Random Regene = new Random();
        num = Regene.nextInt(100);
        return num;
    }

    @Override
    public void run() {
        while(true){
            try
            {
                result = generate();
                System.out.println("Random number : "+result);
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                System.out.println("Exception in Rand "+ex);
            }
        }

    }
}
class Square extends Thread{
    public int sqnum(int a){
        return (a*a);
    }
    public void display(int a){
        System.out.println("Square : "+ a);
    }

    @Override
    public void run() {
        while (true){
            try
            {
                display(sqnum(Rand.num));
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                System.out.println("Exception in Rand"+ex);
            }
        }
    }
}
class  Cube extends Thread{
    public int sqnum(int a){
        return (a*a*a);
    }
    public void display(int a){
        System.out.println("Cube : "+ a);
    }
    public void run() {
        while (true){
            try
            {
                display(sqnum(Rand.num));
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                System.out.println("Exception in Rand"+ex);
            }
        }
    }
}
public class Multi_Thread {
    public static void main(String[] args) {
        Rand ob_rand =new Rand();
        ob_rand.start();
        Square ob_rand1 =new Square();
        ob_rand1.start();
        Cube ob_rand3 =new Cube();
        ob_rand3.start();
    }
}
