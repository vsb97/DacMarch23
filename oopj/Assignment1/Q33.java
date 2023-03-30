
public class Q33 {
    public static void main(String args[]){

        int i =Integer.parseInt(args[0]);
        float f =Float.parseFloat(args[1]);
        double d =Double.parseDouble(args[2]);

        System.out.println("addition: "+(i+f+d));
        System.out.println("substration: "+(i-f-d));
        System.out.println("multiplication: "+(i*f*d));
        System.out.println("division: "+(d/f/i));

    }
}
