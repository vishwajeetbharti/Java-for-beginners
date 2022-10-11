package AdvanceJava;


class Tester<B2,B4,B6>{
    int val;
    private B2 b2;
    private B4 b4;
    private B6 b6;

    Tester(int val,B2 b2, B4 b4, B6 b6) {
        this.val= val;
        this.b2 = b2;
        this.b4 = b4;
        this.b6 = b6;
    }

    public B6 getB6() {
        return b6;
    }

    public void setB6(B6 b6) {
        this.b6 = b6;
    }

    public B4 getB4() {
        return b4;
    }

    public void setB4(B4 b4) {
        this.b4 = b4;
    }

    public B2 getB2() {
        return b2;
    }

    public void setB2(B2 b2) {
        this.b2 = b2;
    }
}
public class Generic_Java {
    public static void main(String[] args) {
        Tester<String,Integer,Boolean> obj =new Tester(7,"Hello",33,true);    // Generic Class
        System.out.println(obj.getB2());
        System.out.println(obj.getB4());
        System.out.println(obj.getB6());



    }
}
