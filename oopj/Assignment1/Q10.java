public class Q10 {
    public static void main(String args[]){
       // The number of bits used to represent a char value SIZE
        System.out.println("NO of bits: "+ Character.SIZE);
        //b. The number of bytes used to represent a char value BYTES
        System.out.println("NO of Bytes: "+ Character.BYTES);
        //c. The minimum value a char MIN_VALUE
        System.out.println("Min value: "+ Character.MIN_VALUE);//(\u0000  we cant see this)
        //d. The maximum value a char MAX_VALUE
        System.out.println("Max value: "+ Character.MAX_VALUE);//(? \uFFFF)
    }
}
