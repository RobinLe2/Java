package chap05_instance_array_throws;

import javax.swing.*;

public class Main {

  public static void main(String[] args) {

    try {
      // 제품 진열하기
      Product product1 = new Product("양파 1.5kg", 3000);
      Product product2 = new Product("고등어", 5000);
      Product product3 = new Product("한돈앞다리 1kg", 15000);
      Product product4 = new Product("블랙앵거스 살치살 500g", 20000);
      Product product5 = new Product("꼬마돈까스", 9000);

      // Cart 진열하기
      Cart cart1 = new Cart();


      // Customer 입장
      Customer customer = new Customer(500);

      //Customer가 cart 취득
      customer.setCart(cart1);

    //쇼핑
    customer.addToCart(product1); 
    customer.addToCart(product2); 
    customer.addToCart(product3); 
    customer.addToCart(product4); 
    customer.addToCart(product5);

    
    customer.removeFromCart(0);

    // 구매
    String receipt = customer.purchase();
    
    // 구매 내역 확인
    System.out.println(receipt); // 구매 product 목록 + 총 구매금액
    System.out.println("남은 돈: "+ customer.getMoney());
    if (receipt != null) {
      JOptionPane.showMessageDialog(null,receipt); // 구매 product 목록 + 총 구매금액
      JOptionPane.showMessageDialog(null,"남은 돈: "+ customer.getMoney());
    }
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
     
    
    
    
    
//    // "1" -> 1
//    int x = Integer.parseInt("1");
//    System.out.println(x+1);
//    
//    // "1.5" -> 1.5
//    double y =Double.parseDouble("1.5");
//    System.out.println(y+1);
    
    // 입력 대화상자
    // showInputDialog()는 항상 String을 반환하므로 적절한 변환 과정이 필요할 수 있습니다.
//    String name = JOptionPane.showInputDialog("이름을 입력하세요. ");
//   
//   
//    int age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요."));
//    System.out.println(name+ "의 나이는 " +age + "살이다.");
  }

}
