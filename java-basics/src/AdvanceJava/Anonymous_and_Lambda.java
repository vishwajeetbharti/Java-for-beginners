package AdvanceJava;

interface Toy{
    void cheking(boolean t);
    void playing();
}
interface  Animal{
    void  dog();
        }

public class Anonymous_and_Lambda {
    public static void main(String[] args) {
        // Anonymous classes
        Toy obj = new Toy() {
            @Override
            public void cheking(boolean t) {
                System.out.println(t);
            }

            @Override
            public void playing() {
                System.out.println("YES");
            }
        };

        obj.cheking(true);
        obj.playing();
        // Lambda Classes
        Animal obj1 = ()->{
            System.out.println("Barking:- Bhaooo Bhaooo");
        };
        obj1.dog();
    }
}
