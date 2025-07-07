package chap05_instance_array_throws;

public class Product {
  // 필드
  private String name;
  private int price;
  
  // 생성자
  public Product() {}

  public Product(String name, int price) {
    super();
    this.name = name;
    this.price = price;
  }

  // 메소드(getter , setter  자동화)

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {  // throws RuntimeException 생략
    // 예외 발생 후 회피  (던졌는데 아무도 안받으면 실행하는곳으로 회피함) unchecked여서 생략가능
    if (price < 0)
        throw new RuntimeException(price + "원은 잘못된 가격입니다.");
    this.price = price;
  }
  
  
}
