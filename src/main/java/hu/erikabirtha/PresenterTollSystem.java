package hu.erikabirtha;


import org.json.JSONException;
import org.json.JSONObject;

public class PresenterTollSystem implements DisplayTollSystem {
    VehicleRegisterInteractor vehicleRegisterInteractor;
    //adatfogadásért felel olyan formátumra hozza amit az alkalmazás tud kezelni
    //data structure

    //régi interaptor kommunikál vele
    //implementál  Display
    private ViewTollSystem viewTollSystem;
    private ViewModelTollSystem viewModelTollSystem;

    public PresenterTollSystem(ViewTollSystem viewTollSystem, ViewModelTollSystem viewModelTollSystem) {
        this.viewTollSystem = viewTollSystem;
        this.viewModelTollSystem = viewModelTollSystem;
    }


    @Override
    public void dislayMotorwayVignette(String s) {
        //Json parser
        //view meghívása
        ViewModelTollSystem viewModelTollSystem = new ViewModelTollSystem();
        try {
            JSONObject jsonObject = new JSONObject();
            viewModelTollSystem.vehicleCategory = jsonObject.getString("vehicleCategory");
            viewModelTollSystem.motorwayVignetteType = jsonObject.getString("motorwayVignetteType");
            viewModelTollSystem.price = jsonObject.getInt("price");


        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayError(String s) {

    }

    public void displayOk(String s) {

    }

}