class Q8{
    public static void main(String args[]){
        byte b = 12;
        Byte obj = new Byte(b);

       // byte value into String
        String str1 = Byte.toString(b);
        System.out.println("byte value converted to String: "+str1);

        //b. byte value into Byte instance.
        Byte i=Byte.valueOf(b);
        System.out.println("byte value into Byte instance: "+i);

        //c. String instance into Byte instance.
        //String s = new String("Vaishanvi");//Exception in thread "main" java.lang.NumberFormatException: For input string: "Vaishanvi"
        String s = new String("20");
        Byte i2 = Byte.valueOf(s);
        System.out.println("string instance into byte instance: "+i2);
    }
}