import java.util.Scanner;

class BMIcal {
    //fields of the class
    double height;  //in meters
    double weight;  //in kg

    //parameterless constructor
    BMIcal(){
        this.height= 0;
        this.weight=0;
    }

    //geters and seters methods
    public void setHeight(double h){
        this.height=h;
    }
    public void setWeight(double w){
        this.weight=w;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }

    //member function
    double calculateBMI(){
        return (weight/(height*height));
    }

    //entry point 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        BMIcal b=new BMIcal(); //instance creation
        System.out.print("Enter height in meters.: ");
        b.setHeight(sc.nextDouble()); //setting the height
        System.out.print("Enter weight in Kg.: ");
        b.setWeight(sc.nextDouble()); //setting the weight

        double bmi= b.calculateBMI(); //method call
        System.out.println("BMI : "+bmi);

    }
}
