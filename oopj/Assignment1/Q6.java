public class Q6 {
    public static void main(String args[]){
        boolean b= true;
        Boolean ref=new Boolean(b);
        String s = new String("Vaishnavi");

        //boolean value into stirng
        String str = ref.toString(b);
        System.out.println("boolean converted to String: "+ str);

        //boolean value into Boolean instance
        Boolean ref2=Boolean.valueOf(b);
        System.out.println("boolean converted to Boolean instance: "+ ref2);

        //String value into boolean value
        boolean b1= Boolean.parseBoolean(s);
        System.out.println("String value is converted to boolean: "+b1);

        //String value into Boolean instance
        
        Boolean ref3= ref.valueOf(s);
        System.out.println("String value converted to boolean instance: "+ref3);

    } 

}
