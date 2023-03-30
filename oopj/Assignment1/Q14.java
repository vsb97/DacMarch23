//14.Write a program to convert state of Short instance into byte,
//short, int, long, float and double.
public class Q14 {
    public static void main(String args[]){
        Short s=new Short((short)123);
        System.out.println("byte "+s.byteValue());
        System.out.println("short "+((short)s));
        System.out.println("int "+((int)s));
        System.out.println("long "+((long)s));
        System.out.println("float "+((float)s));
        System.out.println("double "+((double)s));
    }
}
