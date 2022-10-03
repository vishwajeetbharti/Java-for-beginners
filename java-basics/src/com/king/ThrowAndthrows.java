package com.king;
class LossException extends Exception{
    @Override
    public String toString() {
        return "Bussines loss";
    }

    @Override
    public String getMessage() {
        return "Bussines loss";
    }
}
public class ThrowAndthrows {
    public static float profit(float principal,float rate,float duration)throws LossException{
        float SI= principal*rate/100*duration;
        if(SI<=0)
            throw new LossException();
        return SI;
    }
    public static int calsy(int x,int y) throws ArithmeticException{
        return x/y;
    }
    public static void main(String[] args) throws LossException {
        //System.out.println(calsy(9,0)); It will throw an error but we can handle this error by using try catch....
        try{
            System.out.println(profit(50000,0,5));
        }
        catch (Exception e){
            System.out.println(e);
        }
        try
        {
            System.out.println(calsy(9,0));
        }
        catch (Exception e){
            System.out.println("Divided by zero");
        }
    }
}
