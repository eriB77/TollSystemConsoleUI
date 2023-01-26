package hu.erikabirtha;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;


public class ContollerTollSystem {
    VignetteAPI vignetteAPI;

    public void findVehicleByRegistrationNumber(String registrationNumber, String vehicleCategory,
                                                String motorwayVignetteType, Integer price,
                                                Date validFrom, Date validTo, Date dateOfPurchase) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("vehicleCategory", vehicleCategory);
            jsonObject.put("motorwayVignetteType", motorwayVignetteType);
            jsonObject.put("price", price);
            jsonObject.put("validFrom", validFrom);
            jsonObject.put("validTo", validTo);
            jsonObject.put("dateOfPurchase", dateOfPurchase);
        } catch (JSONException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        System.out.println(jsonObject + " controller jsonobject");
        vignetteAPI.findVehicleByRegistrationNumber(jsonObject.toString());
    }

    public void setInteractor(VignetteAPI vignetteAPI){
        this.vignetteAPI = vignetteAPI;


    };

//    public void findVehicleByRegistrationNumber
//            (String registrationNumber, String vehicleCategory,
//             String motorwayVignetteType, Integer price,
//             Date validFrom, Date validTo, Date dateOfPurchase) {
//
//        JSONObject jsonObject = new JSONObject();
//        try {
//            jsonObject.put("registrationNumber", registrationNumber);
//            jsonObject.put("vehicleCategory", vehicleCategory);
//            jsonObject.put("motorwayVignetteType", motorwayVignetteType);
//            jsonObject.put("price", price);
//            jsonObject.put("validFrom", validFrom);
//            jsonObject.put("validTo", validTo);
//            jsonObject.put("dateOfPurchase", dateOfPurchase);
//
//        } catch (JSONException exception) {
//            throw new RuntimeException(exception);
//        }
//        System.out.println(jsonObject);
//    }
    //beküldi az adatokat nyelvfüggetlen formában
    //Api hívás
    //JSON objectumot  állít elő abból amit a view létrehoz-konvertálás

//    public void showVehicleMotorwayVignetteHistory() {
//        JSONObject jsonObject = new JSONObject();
//        try {
//            jsonObject.put("registrationNumber", registrationNumber);
////            jsonObject.put("vehicleCategory", vehicleCategory);
////            jsonObject.put("motorwayVignetteType", motorwayVignetteType);
//
//        } catch (JSONException exception) {
//            throw new RuntimeException(exception);
//        }
//        System.out.println(registrationNumber);
//
//    }
}

