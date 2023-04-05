import java.time.LocalDateTime;
import java.util.Scanner;

class Date {
    int day;
    int month;
    int year;

    boolean isValid(){
        try{
            LocalDateTime ldt = LocalDateTime.of(this.year,this.month,this.day,0,0,0);
            return true;
        }
        catch(Exception e ){
            System.out.println("Invalid date!!!!");
            return false;
        }
    }

    void getDayOfWeek(){
        if(isValid()){
            LocalDateTime ldt = LocalDateTime.of(this.year,this.month,this.day,0,0,0);
            System.out.println(ldt.getDayOfWeek());
            
        }
        else
        System.out.println("invalid date!!!");

    }

    void isLeapYear(){
        if(isValid()){
            LocalDateTime ldt = LocalDateTime.of(this.year,this.month,this.day,0,0,0);
            int y = ldt.getYear();
            if (y%400==0) {
                System.out.println("LEAP Year ");}
                else if(y%100==0){
                System.out.println("NOT a LEAP Year ");}
                else if(y%4==0){
                System.out.println("LEAP Year ");}
                else{
                System.out.println("NOT a LEAP Year ");}
        
            
        }
        else
        System.out.println("invalid date!!!");

    }
    void getNextDay(){
        if(isValid()){
            LocalDateTime ldt = LocalDateTime.of(this.year,this.month,this.day,0,0,0);
            System.out.println("Next day : "+ldt.plusDays(1));
            
        }
        else
        System.out.println("invalid date!!!");

    }

    void getPreviousDay(){
        if(isValid()){
            LocalDateTime ldt = LocalDateTime.of(this.year,this.month,this.day,0,0,0);
            System.out.println("Previous day : "+ldt.minusDays(1));
            
        }
        else
        System.out.println("invalid date!!!");

    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Date d=new Date();
        System.out.println("Enter day month year one by one: ");
        d.day=sc.nextInt();
        d.month=sc.nextInt();
        d.year=sc.nextInt();

        System.out.println("Date isValid: "+d.isValid()); 
        d.getDayOfWeek();
        d.isLeapYear();
        d.getNextDay();
        d.getPreviousDay();


        
    }

}
