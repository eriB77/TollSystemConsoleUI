package hu.erikabirtha;


import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ViewModelTollSystem {
    public String vehicleCategory;
    public String motorwayVignetteType;
    public Integer price;
    public Date validFrom;

    public Date validTo;
    public Date dateOfPurchase;

    public ViewModelTollSystem(String vehicleCategory, String motorwayVignetteType, Integer price, Date validFrom, Date validTo, Date dateOfPurchase) {
        this.vehicleCategory = vehicleCategory;
        this.motorwayVignetteType = motorwayVignetteType;
        this.price = price;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.dateOfPurchase = dateOfPurchase;
    }

    public ViewModelTollSystem() {

    }


    @Override
    public String toString() {
        return "ViewModelTollSystem{" +
                "vehicleCategory='" + vehicleCategory + '\'' +
                ", motorwayVignetteType='" + motorwayVignetteType + '\'' +
                ", price=" + price +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                ", dateOfPurchase=" + dateOfPurchase +
                '}';
    }
}
