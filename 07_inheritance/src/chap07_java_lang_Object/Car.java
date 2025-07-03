package chap07_java_lang_Object;

import java.util.Objects;

/*
 * java.lang.Object 클래스
 * 
 * 1. 자바의 모든 클래스의 최상위 슈퍼클래스입니다.2
 * 2. 별도의 슈퍼클래스 명시가 없는 클래스들은(extends가 없는 클래스) 모두 java.lang.Object 클래스를 슈퍼클래스로 가집니다.
 * 3. 모든 개체(인스턴스)들은 java.lang.Object 타입으로 up-casting 할 수 있습니다.(만능 타입입니다.)
 *    단, java.lang.Object 타입으로 up-casting 된 객체는 오직 java.lang.Object 클래스의 멤버만 호출할 수 있으므로
 *    반드시 down-casting을 이용해서 객체 자신의 메소드를 호출해야합니다.
 */
public class Car {
  
  private String carNo;
  private String model;
  
 
      public Car(String carNo, String model) { //---- java.lang.Object 클래스의 생성자를 호출합니다. 디폴트 생성자의 호출이므로 생략해도 아무 문제 없습니다.
        super();
        this.carNo = carNo;
        this.model = model;
     
      }
      
      public void carInfo() {
        System.out.println("차량번호: " + carNo);
        System.out.println("차량모델: " + model);
      }
      //----- equals() 메소드 오버라이드( Car 객체의 비교를 위해 새로 만듭니다.)
      
      @Override
      public int hashCode() {
        return Objects.hash(carNo);
      }

      
      @Override
      public boolean equals(Object obj) {
        if (this == obj)
          return true;
        if (obj == null)
          return false;
        if (getClass() != obj.getClass())
          return false;
        Car other = (Car) obj;
        return Objects.equals(carNo, other.carNo);
      }
       //--- toString() 메소드 오버라이드 (Car 객체의 정보를 출력하기 위해 새로 만듭니다)
      @Override
      public String toString() {
        return "Car [carNo=" + carNo + ", model=" + model + "]";
      }
  


}
