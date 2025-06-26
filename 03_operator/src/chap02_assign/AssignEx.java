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
    
  }

}
