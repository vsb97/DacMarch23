class ElectricityBill {
    String customerName;
    double unitsConsumed;
    double billAmount;

    ElectricityBill(String customerName, double unitsConsumed){
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public String getCustomerName() {
        return customerName;
    }
    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    double calculateBillAmount(){
        double units= unitsConsumed;  
        if(units<=100){
            billAmount=billAmount+(units*5);
        }
        else{
            billAmount=billAmount+(100*5);
            units=units-100;
            System.out.println(billAmount+"  "+units);
            if(units<=200){
                billAmount=billAmount+((units)*7);
                units=units-200;
                System.out.println(billAmount+"  "+units);
            }
            else{
                billAmount=billAmount+((200)*7);
                units=units-200;
                System.out.println(billAmount+"  "+units);
                billAmount=billAmount+((units)*10);
                System.out.println(billAmount+"  "+units);
            }
            
            
        }
        return billAmount; 
    }

    public static void main(String agrs[]){
        ElectricityBill eb = new ElectricityBill("Vaishnavi", 250);
        System.out.println(eb.getCustomerName()+ "  "+ eb.getUnitsConsumed()+"  "+eb.calculateBillAmount());
    }
}
