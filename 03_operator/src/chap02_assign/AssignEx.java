package chap02_assign;

public class AssignEx {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // Assignment : 대입 연산 (=)
    int a = 10; // 10을 a에 대입
    System.out.println(a);
    
    
    
    
    // Compound Assignment : 복합 대입 연산 (+=, -=, *=, /=, %= 등)
    int x= 10;
    x += 10;  // x = x + 10;
    System.out.println(x);
    x -= 10;  // x = x- 10;
    System.out.println(x);
    x *= 10;  // x = x * 10  100
    System.out.println(x);
    x /= 10;  // x = x / 10  10
    System.out.println(x);
    x %= 10;  // x = x % 10   0
    System.out.println(x);
    
    // 문자열의 비교 : ==, != 를 사용하지 않습니다.
    String s1 = "abc"; //--------------- 문자열 저장소에 "abc"를 저장합니다.
    String s2 = "abc"; //--------------- 최적화에 의해서 이미 존재하는 "abc"는 새로 만들지 않습니다.  문자열 저장소에 저장하는 "abc"는 1개이다.
    String s3 = new String("abc"); //--- 객체 생성 코드로 인해서 새로운 "abc"가 저장됩니다.
    System.out.println(s1 == s2);  //--- "abc"가 저장된 참조값 비교
    System.out.println(s1 == s3); //---- s1의 참조값과 s3의 참조값은 서로 다르므로 false
    
    System.out.println(s1.equals(s3));//- 문자열 비교코드(메소드)
  }

}
