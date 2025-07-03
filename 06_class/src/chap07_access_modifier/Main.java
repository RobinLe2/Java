package chap07_access_modifier;

public class Main {

  public static void main(String[] args) {
    
    Car car1 = new Car();  
    car1.printInfo();

    Car car2 = new Car("X6", 12000, new Brand("BMW", "Germany"));
    car2.printInfo();
    
    Car car3 = new Car("Sonata", 3000, "Hyundai", "Korea");
    car3.printInfo();
    // Getter는 필드 값을 확인할 떄 사용합니다.
    System.out.println(car1.getModel());
    System.out.println(car2.getPrice());
    System.out.println(car1.getBrand().getName());
    System.out.println(car1.getBrand().getNation());
    
    //Setter는 필드값을 수정할 때 사용합니다.
    car3.setModel("G80");
    car3.setPrice(7000);
    car3.setBrand(new Brand("Genesis" , "Korea"));
    car3.printInfo();
    
    car2.setModel("GV70");
    car2.setPrice(8000);
    car2.getBrand().setName("Genesis"); // Brand 객체
    car2.getBrand().setNation("Korea"); // Brand 객체
    car2.printInfo();
    
    
  }
}