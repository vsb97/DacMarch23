import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Q1 {
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter hour: ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes: ");
        int min = sc.nextInt();

        System.out.print("Enter seconds: ");
        int sec = sc.nextInt();
        
        LocalDateTime ldt = LocalDateTime.of(year,month,day,hour,min,sec);

        System.out.println("\n===========================================\n");

       System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd/mm/yyyy")));
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("mm/dd/yyyy")));
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("yyyy/mm/dd"))); 

       System.out.println("\n===========================================\n");
        
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("hh:mm"))); 

       System.out.println("\n===========================================\n");

       System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss")));
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("mm/dd/yyyy hh:mm:ss a")));
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm"))); 

       System.out.println("\n===========================================\n");

    }
}
