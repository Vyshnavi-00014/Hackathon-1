import java.util.Scanner;
public class WasteCalculator {
    public static double calculateTotalWaste(double point1Waste, double point2Waste){
        return point1Waste + point2Waste;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the waste collected from point 1 in kg: ");
        double point1Waste=sc.nextDouble();
        System.out.println("Enter the waste collected from point 2 in kg: ");
        double point2Waste=sc.nextDouble();
        double totalWaste=calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total waste collected: " + totalWaste + " kg");
        sc.close();
    }
    
}
