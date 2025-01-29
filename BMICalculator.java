import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BMI Calculator");
        System.out.print("enter your weight: "); 
        Double weight=sc.nextDouble();
        System.out.print("enter your height: ");
        Double height=sc.nextDouble();
        int choice = 0;
        double bmi=0.0;
        System.out.println("Choose your preference mesurements system");
        System.out.println("1. Matric (kilogram and meters)");
        System.out.println("2. Imperial (pounds and inches)");
        System.out.println("Enter 1 or 2: ");
        choice=sc.nextInt();
        if(choice==1){
            bmi = (weight)/(height*height);
        }else{
            bmi= (weight*703)/(height*height);
        }
        // categories
        String category;
        if(bmi<18.5){
            category= "Under weight";
        }else if (bmi>=18.5&&bmi<24.9){
            category="Normal weight";
        }else if(bmi>=25&&bmi<29.9){
            category="Over weight";
        }else{
            category="Obesity";
        }
        System.out.printf("your BMI value: %.2f\n",bmi);
        System.out.println("you are classifies as:"+category);
    }
}
