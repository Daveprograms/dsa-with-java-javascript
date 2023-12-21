package POINTERS;

public class Main {
    public static void main (String[] args){
        int num1 = 12;
        int num2 = num1;
// when we say num1 = num2, it does not stay their forever its only when it is initialized
        num1 = 22;

        System.out.println("NUM1: "+ num1);
        System.out.println("NUM2: "+ num2);
    }


}
