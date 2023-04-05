import java.util.Scanner;
class Vehicle{
    String vehType;
    int axles;
    double distance;
    double tollFee;
    static double totalAmtDue=2.0;

    static Scanner sc= new Scanner(System.in);
    static Vehicle v =new Vehicle();

    void calculateTollFee(){
        if(v.vehType=="car" || v.vehType=="van" || v.vehType=="bus"){
            v.tollFee = 0.25* v.distance * v.axles;
        }
        else{
            v.tollFee = 0.50* v.distance * v.axles;
        }
        System.out.println("TollFee is $"+(v.tollFee));
    }
    void generateBill(){
        calculateTollFee();
        System.out.println("Bill is $"+(v.tollFee+totalAmtDue));
    }
    void showMenu(){
        System.out.println("Enter vehicle type (car, van, bus, or truck)");
        v.vehType=(sc.nextLine());
        System.out.println("Enter no of axles");
        v.axles=(sc.nextInt());
        System.out.println("Enter distance travelled");
        v.distance=(sc.nextDouble());
        System.out.println("Enter 1 to calculate toll fee or 2 to generate bill and 3 to exit");
        switch(sc.nextInt()){
            case 1: calculateTollFee(); break;
            case 2: generateBill();break;
            case 3: return;
            default: System.out.println("Please rerun the program and enter valid input");
        }

    }
    
}
class TollBoothBill {
    public static void main(String args[]){
        Vehicle t =  new Vehicle();
        t.showMenu();
    }
    
}
