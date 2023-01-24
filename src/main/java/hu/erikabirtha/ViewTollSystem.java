package hu.erikabirtha;

import java.util.Scanner;

public class ViewTollSystem {


    ContollerTollSystem contollerTollSystem;
    Scanner scanner = new Scanner(System.in);
    public void showVehicleMotorwayVignetteHistory() {
        boolean isValid = true;
        while (isValid) {
            String askQuestion = scanner.next();
            switch (askQuestion) {
                case "A":
                    System.out.println("The [] registration number car motorway usage history:");
                    System.out.println("Valid from ['validFrom'] valid to ['validTo'] vehicle category: ['vehicleCategory'] date of purchase: ['dateOfPurchase']");
                    break;
                case "B":
                    System.out.println("The [] registration number car motorway usage history: Invalid");
                default:
                    System.out.println("Not an option");
                    isValid = false;
                    break;
            }
        }
    }


}
