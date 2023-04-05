import java.util.Scanner;

class RNCalculator {
    int numerator;
    int denominator;
    public static void add(RNCalculator a, RNCalculator b) {
        int num = ((a.numerator*b.denominator)+(a.denominator*b.numerator));
        int den = (a.denominator*b.denominator);
        int g = gcd(num,den);
        System.out.println("Addition: "+(num/g)+"/"+(den/g));
    }
    public static void sub(RNCalculator a, RNCalculator b) {
        int num = ((a.numerator*b.denominator)-(a.denominator*b.numerator));
        int den = (a.denominator*b.denominator);
        int g = gcd(num,den);
        System.out.println("Subtraction: "+(num/g)+"/"+(den/g));
    }
    public static void div(RNCalculator a, RNCalculator b) {
        int num = ((a.numerator*b.denominator));
        int den = (a.denominator*b.numerator);
        int g = gcd(num,den);
        System.out.println("Division: "+(num/g)+"/"+(den/g));
    }
    public static void mul(RNCalculator a, RNCalculator b) {
        int num = ((a.numerator*b.numerator));
        int den = (a.denominator*b.denominator);
        int g = gcd(num,den);
        System.out.println("Multiplication: "+(num/g)+"/"+(den/g));
    }

    public static int gcd(int a, int b){
        int gcd=1;
	    for(int i=2;i<=a && i<=b;i++){
	        if(a%i==0 && b%i==0)
	        gcd=i;
	    }
        return gcd;

    }


}

class RNC{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first rational number:");
        RNCalculator a=new RNCalculator();
        System.out.print("Numerator: ");
        a.numerator = sc.nextInt();
        System.out.print("Denominator: ");
        a.denominator = sc.nextInt();

        System.out.println("Enter the second rational number:");
        RNCalculator b=new RNCalculator();
        System.out.print("Numerator: ");
        b.numerator = sc.nextInt();
        System.out.print("Denominator: ");
        b.denominator = sc.nextInt();

        System.out.println("Enter the aritmetic operation(+,-,*,/): ");
        sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        switch(ch){
            case '+':RNCalculator.add(a,b); break;
            case '-':RNCalculator.sub(a,b); break;
            case '*':RNCalculator.mul(a,b); break;
            case '/':RNCalculator.div(a,b); break;
            default: System.out.println("Rerun the program!");
        }


    }

}
