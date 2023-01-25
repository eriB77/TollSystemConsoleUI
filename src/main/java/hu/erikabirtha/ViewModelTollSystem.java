package hu.erikabirtha;


import org.json.JSONObject;

import java.util.Date;

public class ViewModelTollSystem {
    public String vehicleCategory;
    public String motorwayVignetteType;
    public Integer price;
    public Date validFrom;

    public Date validTo;
    public Date dateOfPurchase;

    public String registrationNumber;

    public ViewModelTollSystem(String vehicleCategory, String motorwayVignetteType, Integer price, Date validFrom, Date validTo, Date dateOfPurchase, String registrationNumber) {
        this.vehicleCategory = vehicleCategory;
        this.motorwayVignetteType = motorwayVignetteType;
        this.price = price;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.dateOfPurchase = dateOfPurchase;
        this.registrationNumber = registrationNumber;
    }

    //parse JSON to string
//    public static String parseJsonToString(JSONObject jsonObjectData) {
//        JSONObject jsonObject= new JSONObject(jsonObjectData);
//        String registrationNumber = jsonObject.get("registrationNumber").toString();
//        String validVigenette = jsonObject.get("validVignette").toString();
//        String validFrom = jsonObject.get("validFrom").toString();
//        String validTo = jsonObject.get("validTo").toString();
//        String dateOfPurchase = jsonObject.get("dateOfPurchase").toString();
//        return "["+validVigenette+"] ["+registrationNumber+"] ["+validFrom+"] ["+validTo+"] ["+dateOfPurchase+"]";
//    }


    @Override
    public String toString() {
        return "ViewModelTollSystem{" +
                "vehicleCategory='" + vehicleCategory + '\'' +
                ", motorwayVignetteType='" + motorwayVignetteType + '\'' +
                ", price=" + price +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                ", dateOfPurchase=" + dateOfPurchase +
                ", registrationNumber=" + registrationNumber +
                '}';
    }

//     System.out.println("\n "  + "registration number car motorway usage history:" );
//    //    System.out.println(result);
//        System.out.println("\n\n");

}
