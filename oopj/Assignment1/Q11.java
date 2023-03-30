public class Q11 {
    public static void main(String args[]){
        //a. Check whether entered character is letter or digit. 
        //If it is digit then print its values as well as code point.
        char c=args[0].charAt(0);
        int i =c;
        char[] arr = new char[1];
        arr[0]= c;
        String s=Character.toString(c);

        if((i>=65 && i<=90) || (i>=97 && i<=122)){
            System.out.println("Character is letter.");
        }
        else if(i>=48 && i<=57){
            System.out.println("digit Character .:"+i);
            System.out.println("unicode.:"+Character.codePointAt(arr, 0));
            System.out.println("unicode str.:"+s.codePointAt( 0));
        }

        //b. If it is character then check whether it is in lowercase? If it is in lowercase then convert it into upper case and
        //print it well as its code point. If it is in uppercase then convert it into lower case and print it well as its code point.

        if((c>=97 && c<=122)){
            System.out.println("Lower case :"+ c+" converted to uppercase:"+ Character.toUpperCase(c));
            System.out.println("unicode str.:"+s.codePointAt( 0));
        }
        else if(c>=65 && i<=90){
            System.out.println("Upper case :"+ c+" converted to lowercase:"+ Character.toLowerCase(c));
            System.out.println("unicode str.:"+s.codePointAt( 0));
        }

    }
}
