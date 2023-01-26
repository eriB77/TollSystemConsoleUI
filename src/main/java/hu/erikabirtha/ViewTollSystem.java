package hu.erikabirtha;

import java.util.Date;
import java.util.Scanner;

public class ViewTollSystem {
    ContollerTollSystem contollerTollSystem;
    public Scanner scanner = new Scanner(System.in);

    public ViewTollSystem(ContollerTollSystem contollerTollSystem) {
        this.contollerTollSystem = contollerTollSystem;
    }

    public void showVehicleMotorwayVignetteHistory() {

        ViewModelTollSystem viewModelTollSystem =
                new ViewModelTollSystem("","",
                "",0, new Date(), new Date(), new Date());

        System.out.println("\n "  + "registration number car motorway usage history:");

        //    System.out.println(result);

       String registrationNumber = scanner.next();
       viewModelTollSystem.registrationNumber = registrationNumber;
        System.out.println(registrationNumber + "ez a reg number");
        System.out.println(viewModelTollSystem + "ez a viewmodel A ViewTollsytemben.........");
        System.out.println("\n\n");
        System.out.println("\n " + "valid from:" );
        System.out.println(registrationNumber );
//        String vehicleCategory = scanner.next();
//        viewModelTollSystem.vehicleCategory = vehicleCategory;
//
//        String motorwayVignetteType = scanner.next();
//        viewModelTollSystem.motorwayVignetteType = vehicleCategory;
//
//        Integer price = scanner.nextInt();
//        viewModelTollSystem.price = price;

//        Date validFrom = scanner.next();
//        viewModelTollSystem.validFrom = validFrom;
//        Date validTo = scanner.next();
//        viewModelTollSystem.validTo = validTo;
//        Date dateOfPurchase = scanner.next();
//        viewModelTollSystem.dateOfPurchase = dateOfPurchase;

    }

    public void showErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }

    public void showOkMessage(String okMessage) {
        System.out.println(okMessage);
    }
}
