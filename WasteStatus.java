import java.util.Scanner;
public class WasteStatus{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the waste collected in Kg: ");
        double wasteCollected=sc.nextDouble();
        if (wasteCollected >= 100){
            System.out.println("Collection Target Achived.");
        }
        else{
            System.out.println("More waste Collection Required");
        }
        sc.close();
    }
}