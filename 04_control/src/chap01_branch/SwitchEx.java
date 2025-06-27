package chap01_branch;

public class SwitchEx {

  public static void main(String[] args) {
    // 짝수/홀수
    
    int x = 11;
    switch ( x % 2 ) {                          // 가능한 표현식 타입 : byte, short, int , chare ,String (불가능 : long , float, double, boolean)
    case 0: System.out.println("짝수"); break;
    case 1: System.out.println("홀수"); break;
  }

    
    int y = 10;
    switch ( y % 3 ) { 
    case 0: System.out.println("3의 배수"); break;
    default : System.out.println("3의 배수 아님"); 
  }
    
    // 학점 (A,B,C,D,F)
    int score = 90;
    char grade;

    switch (score / 10) {
        case 10: 
        case 9:grade = 'A';break;
        case 8:grade = 'B';break;
        case 7:grade = 'C';break;
        case 6:grade = 'D';break;
        default:grade = 'F';break;
    }

    System.out.println(score + "점은 " + grade + "학점입니다.");
    
 
//    double 사용시    
//    // 학점 (A,B,C,D,F)
//    double score = 100;
//    char grade;
//
//    switch ((int)(score / 10)) {
//        case 10: 
//        case 9:grade = 'A';break;
//        case 8:grade = 'B';break;
//        case 7:grade = 'C';break;
//        case 6:grade = 'D';break;
//        default:grade = 'F';break;
//    }
//
//    System.out.println(score + "점은 " + grade + "학점입니다.");
//}
    
    // Level에 따른 권한 처리
    int level = 2;
    String auth = "";
    switch (level) {           // case는 최초 진입시점
    case 3: auth += "A";
    case 2: auth += "B";
    case 1: auth += "C";
    }
    System.out.println(level + ":" + auth);
}
}