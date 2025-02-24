public class Car {  
    private String brand;  
    private String model;  
    private int year;  
  
    public Car(String brand, String model, int year) {  
        this.brand = brand;  
        this.model = model;  
        this.year = year;  
    }  
    
    public String getBrand() {  
        return brand;  
    }  
  
    public String getModel() {  
        return model;  
    }  
  
    public int getYear() {  
        return year;  
    }  
  
    public void setBrand(String brand) {  
        this.brand = brand;  
    }  
  
    public void setModel(String model) {  
        this.model = model;  
    }  
  
    public void setYear(int year) {  
        this.year = year;  
    }  
    
    public void startEngine() {  
        System.out.println("The " + brand + " " + model + " engine has started.");  
    }  
  
    public void stopEngine() {  
        System.out.println("The " + brand + " " + model + " engine has stopped.");  
    }  
  
    public static void main(String[] args) {  
        Car myCar = new Car("Toyota", "Camry", 2020);    
        System.out.println("Brand: " + myCar.getBrand());  
        System.out.println("Model: " + myCar.getModel());  
        System.out.println("Year: " + myCar.getYear());   
        myCar.setYear(2022);  
        myCar.startEngine();  
        myCar.stopEngine();  
    }  
}  