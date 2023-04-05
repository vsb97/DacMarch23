import java.util.Scanner;

class TelBillCal {
    String name;
    String phoneNumber;
    int noOfCalls;
    int durationOfCalls; //in minutes

    static Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getNoOfCalls() {
        return noOfCalls;
    }
    public void setNoOfCalls(int noOfCalls) {
        this.noOfCalls = noOfCalls;
    }
    public int getDurationOfCalls() {
        return durationOfCalls;
    }
    public void setDurationOfCalls(int durationOfCalls) {
        this.durationOfCalls = durationOfCalls;
    }
     void acceptRecord(){
        System.out.print("Enter your name.: ");
        this.setName(sc.nextLine());
        System.out.print("Enter your phone number.: ");
        this.setPhoneNumber(sc.nextLine());
        System.out.print("Enter total number calls.: ");
        this.setNoOfCalls(sc.nextInt());
        while(true){
        System.out.print("Enter duration of calls in minutes.: ");
        int i=sc.nextInt();
        if(i<this.getNoOfCalls()){continue;}
        this.setDurationOfCalls(i);
        break;
    }

     }

     double calculateBill(){
        int calls = this.noOfCalls;
        double bill=0;
        if(calls<=100){
            bill = bill+(calls*50);
        }
        else{
            bill = bill+(100*50);
            calls-=100;
            bill = bill+(calls*25);

        }
        return bill-1000;//-1000 because 1US doller= 100 cents
     }

    public static void main(String args[]){
        TelBillCal c1 = new TelBillCal();
        c1.acceptRecord();
        System.out.println("Bill for "+ c1.getName()+"of this month is.: "+c1.calculateBill());
    }
}
