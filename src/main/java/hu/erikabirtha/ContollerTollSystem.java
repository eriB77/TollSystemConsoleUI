package hu.erikabirtha;


import org.json.JSONException;
import org.json.JSONObject;


public class ContollerTollSystem {


    public void findVehicleByRegistrationNumber(String registrationNumber) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("registrationNumber", registrationNumber);
//            jsonObject.put("vehicleCategory", vehicleCategory);
//            jsonObject.put("motorwayVignetteType", motorwayVignetteType);

        } catch (JSONException exception) {
            throw new RuntimeException(exception);
        }
        System.out.println(jsonObject);
    }
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

