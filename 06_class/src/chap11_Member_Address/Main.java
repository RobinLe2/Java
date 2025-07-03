package chap11_Member_Address;

// 문제. 생성자를 호출하여 Member 객체를 만들고 printInfo() 메소드를 호출하여 객체의 정보를 확인하세요.
public class Main {

  public static void main(String[] args) {

    Address homeAddr = new Address("12345", "서울특별시 강남구", "101동 202호");
    Address deliveryAddr = new Address("67890", "서울특별시 마포구", "301동 405호");


    Member member = new Member(homeAddr, deliveryAddr);


    member.printInfo();
  }
}