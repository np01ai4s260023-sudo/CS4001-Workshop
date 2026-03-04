import java.util.Scanner;
public class RickshawFare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();
        
        System.out.print("Enter time (minutes): ");
        double time = sc.nextDouble();
        
        System.out.print("Are you a local? (true/false): ");
        boolean isLocal = sc.nextBoolean();
        
        System.out.print("Is it night time? (true/false): ");
        boolean isNight = sc.nextBoolean();
        
        double baseFare = 20;
        double perKm = 10;
        double perMinute = 2;
        
        double total = baseFare + (distance * perKm) + (time * perMinute);
        
        double discount = (isLocal && distance > 5) ? total * 0.1 : 0;
        double surcharge = isNight ? total * 0.15 : 0;
        
        total = total - discount + surcharge;
        
        System.out.println("Rs. " + total);
        
        sc.close();
    }
}
