public class Vehicle {
    private String regNo;
    private String make;
    private int yearOfManufacture;
    private double value;
//////////////////
    public Vehicle(String regNo, String make, int yearOfManufacture, double value) {
        this.regNo = regNo;
        this.make = make;
        this.yearOfManufacture = yearOfManufacture;
        this.value = value;
    }
/////////G/////////////
    public String getRegNo() {
        return regNo;
    }
    public String getMake() {
        return make;
    }
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    public double getValue() {
        return value;
    }
/////////////////S/////////////
    public void setValue(double value) {
        this.value = value;
    }
//////////////M.C.I.V///////
    public int calculateAge(int currentYear) {
        return currentYear - yearOfManufacture;
    }

    public String getBrand() {
        return getBrand();
    }

    public String getModel() {
        return getBrand();
    }

    public String getYear() {
        return getYear();
    }
}
