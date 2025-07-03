package chap07_access_modifier;


public class Car {
  // 필드
  private String model;
  private int price;
  private Brand brand;  

  // 생성자 - 1
  public Car() {
    this("E350", 8000, new Brand());  
  }

  // 생성자 - 2              new Car("모델", 가격, new Brand("이름", "국적"))
  
  public Car(String model, int price, Brand brand) {
    this.model = model;
    this.price = price;
    this.brand = brand;
  }
  
  // 생성자 - 3              new Car("모델", 가격, 이름", "국적")
  public Car(String model, int price ,String name, String nation) {
//    this.model = model;
//    this.price = price;
//    this.brand = new Brand(name, nation);
    this(model, price, new Brand(name, nation));   // 생성자 -2 를 호출
  }

  // 메소드
  public void printInfo() {
    brand.printInfo();
    System.out.println(model + ", " + price);
    
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }
}