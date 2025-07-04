package chap15_Store_Customer;


/**
 * 단일 상품을 판매하는 상점(Store) 클래스입니다.
 * 
 * 판매 상품의 개수를 저장할 int count 필드를 선언합니다.
 * 해당 상품의 가격을 저장할 double price 필드를 선언합니다.
 * 상점이 가지고 있는 자본금을 저장할 double money 필드를 선언합니다.
 * 
 * 모든 필드 정보를 전달 받는 생성자를 생성합니다.
 * 
 * 모든 필드에 대해서 Getter/Setter를 생성합니다.
 * 
 * 판매 메소드를 생성합니다. 판매 메소드의 세부 내용은 Store 클래스 본문을 참고하세요.
 */
public class Store {

    private int count;
    private double price;

    public Store(int count, double price, double money) {
        this.count = count;
        this.price = price;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private double money;
  
  /**
   * 판매 메소드입니다.
   * 구매를 원하는 상품의 개수가 상점이 보유한 상품의 개수보다 많으면 판매를 할 수 없습니다.
   * 고객이 낸 돈이 상품의 가격보다 부족하면 판매를 할 수 없습니다.
   * 
   * @param money 상품 구매를 위해서 고객이 상점에 낸 돈(money)입니다.
   * @param count 구매를 원하는 상품의 개수(count)입니다. 
   * @return 판매한 상품의 개수와 잔돈을 저장하는 ProductAndChange 타입의 객체입니다.
   */
  public ProductAndChange sell(double money, int count) {
    if(count > this.count){
        System.out.println("재고가 부족합니다. 현재 재고 : " + this.count + "개");
        return null;
    }

    if (price*count > money){
        System.out.println("금액이 부족합니다" + (price*count - money) + " 달러가 더 필요합니다.");
        return null;
    }
    this.money += price * count;
    this.count -= count;

    // 고객 (Customer)에게 반환할 객체 (상품 개수 + 잔돈)
      return new ProductAndChange(count, money-price*count);
  }
}
