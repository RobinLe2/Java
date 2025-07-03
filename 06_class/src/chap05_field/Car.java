package chap05_field;

public class Car {
  /*
   *  필드(field)
   *  
   *  1. 클래스에서 선언한 변수입니다. 일반 지역변수와 구분해서 필드라고 부릅니다.
   *  2. 클래스가 선언한 변수입니다. 일반 지역변수와 구분하기 위해 필드라고 부릅니다.
   *  3. 클래스에 포함된 모든 메소드는 필드를 사용할 수 있습니다.
   *  4. 일반 지역변수와 달리 선언만 하면 자동으로 초기화됩니다. (0, false, null 등)
   */
  
  //----------- 이 model, price는 클래스 Car에서 선언했으므로 필드입니다.
  String model; //--- String model = null;
  int price;   //---- int price = 0;  
  
//----------- 이 model, price는 메소드 setInfo에서 선언했으므로 지역변수입니다.
  void setInfo(String model, int price) {
    this.model = model;
    this.price = price;
    
    //this (매개변수 이름과 필드 이름이 같을 때 사용)
    // setInfo 메소드를 호출하는 객체(인스턴스)를 의미합니다.
    // 주로, 매개변수와 필드의 이름이 같을 때 이를 구분하기 위해 필드 앞에 this를 추가합니다.
  }
  
  void printInfo() {
    System.out.println(this.model + ", " + this.price);
  }
}
