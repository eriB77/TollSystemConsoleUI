package hu.erikabirtha;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

public class PresenterTollSystem implements DisplayTollSystem {

    //adatfogadásért felel olyan formátumra hozza amit az alkalmazás tud kezelni
    //data structure

    //régi interaptor kommunikál vele
    //implementál  Display

    //VehicleRegisterInteractor vehicleRegisterInteractor;
    private ViewTollSystem viewTollSystem;
    private ViewModelTollSystem viewModelTollSystem;

    public PresenterTollSystem(ViewTollSystem viewTollSystem) {
        this.viewTollSystem = viewTollSystem;
    }


    @Override
    public void dislayMotorwayVignette(String json) {
        //Json parser
        //view meghívása
        ViewModelTollSystem viewModelTollSystem = new ViewModelTollSystem("","", 0, new Date(), new Date(), new Date(), "");
        try {
            JSONObject jsonObject = new JSONObject(json);
            viewModelTollSystem.registrationNumber = jsonObject.getString("registrationNumber");
            viewModelTollSystem.vehicleCategory = jsonObject.getString("vehicleCategory");
            viewModelTollSystem.motorwayVignetteType = jsonObject.getString("motorwayVignetteType");
            viewModelTollSystem.price = jsonObject.getInt("price");

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        viewTollSystem.showVehicleMotorwayVignetteHistory();
    }

    public void displayError(String errorMessage) {
        viewTollSystem.showErrorMessage(errorMessage);

    }

    public void displayOk(String okMessage) {
        viewTollSystem.showOkMessage(okMessage);
    }

}