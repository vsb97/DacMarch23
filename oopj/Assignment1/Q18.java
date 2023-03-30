//Write a program to find minimum and maximum number as well as
//to add two integer numbers using methods of Integer.
public class Q18 {
    public static void main(String args[]){
        int a=23,b=73;
        int min=Integer.min(a, b);
        int max=Integer.max(a, b);

        System.out.println("Min.: "+min+" Max.: "+max);
        System.out.println("sum.: "+(Integer.sum(max, b)));
    }
}
