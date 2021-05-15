package exercises.technology;

public class Computer {

    private String manufacturer;
    private String modelNumber;
    private String serialNumber;

//    public Computer(String manufacturer, String modelNumber, String serialNumber) {
//        this.manufacturer = manufacturer;
//        this.modelNumber = modelNumber;
//        this.serialNumber = serialNumber;
//    }

    public Computer() {
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.serialNumber = serialNumber;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    public String getManufacturer() {return manufacturer;}
    public void setManufacturer(String manufacturer) {this.manufacturer = manufacturer;    }

    public String getModelNumber() { return modelNumber;}
    public void setModelNumber(String modelNumber) {this.modelNumber = modelNumber;}

    public String getSerialNumber() {return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }
}
