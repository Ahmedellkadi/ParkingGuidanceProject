package parking_guidance_system;

import java.util.Date;

public class CustomerClass {
    public String id;
    String name;
    String plateNumber;
    String carColor;
    Date date = new Date();
    long timeIn = date.getTime();
    String Spot;

    public CustomerClass() {
    }
    
    
    
    CustomerClass( String name, String plateNumber, String carColor, String id, long timeIn, String spot){ 
        this.id = id;
        this.name= name;
        this.plateNumber = plateNumber;
        this.carColor = carColor;
        this.timeIn = date.getTime();
        this.Spot = spot;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getCarColor() {
        return carColor;
    }

    public long getTimeIn() {
        return timeIn;
    }
}
