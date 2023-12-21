package Classes;

public class Main {
    public static void main(String[]args){
        Cookie cookieone = new Cookie("Green");
        Cookie cookieTwo = new Cookie("Blue");

        cookieone.setColor("Yellow");


        System.out.println(cookieone.getcolor());
        System.out.println(cookieTwo.getcolor());

    }

}
