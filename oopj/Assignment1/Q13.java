public class Q13 {
    public static void main(String args[]){
        short s= 97;
        //short value into String
        String str = Short.toString(s);
        System.out.println("Short converted to string: "+str);
        //b. short value into Short instance.
        Short si=Short.valueOf(s);
        System.out.println("short converted to short instance: "+si);
        //c. String instance into Short instance.
        String str2="123";
        Short ref=Short.valueOf(str2);
        System.out.println("String instance converted to short instance: "+ref);
    }
    
}
