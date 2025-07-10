package chap03_input;

import javax.swing.*;
import java.util.Scanner;

/**
 * java.util.Scanner
 *
 * 1. 사용자가 콘솔 창으로 데이터를 입력할 때 사용할 수 있습니다.
 * 2. 표준 입력 스트림(System.in)으로부터 데이터를 입력받을 수 있도록 Scanner 객체를 생성하면,
 *    사용자로부터 데이터를 입력 받을 수 있습니다.
 * 3. 주요 메소드
 *    1) next()             공백 없는 문자열 입력
 *    2) nextLine()         공백 포함된 문자열 입력
 *    3) nextInt()          int입력
 *    4) nextLong()         long입력
 *    4) nextDouble()       double입력
 *    6) next().charAt(0)   char입력
 *
 */
public class Main {
    public static void main(String[] args) {
        while (true) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("이름을 입력하세요 >>>");
            String name = sc.next();
            System.out.println("입력된 이름은 " + name + "입니다.");

            System.out.println("나이를 입력하세요 >>>");
            int age = sc.nextInt();
            System.out.println("입력된 나이는 " + age + "살 입니다.");

            System.out.println("키를 입력하세요 >>>");
            double height = sc.nextDouble();
            System.out.println("입력된 키는 " + height + "cm입니다");

            // 입력 리소스 사용 후 반납
            sc.close();
            //무한 루프(while(true){}) 종료
            break;
        } catch (Exception e) {
            System.out.println("올바른 타입의 정보를 입력해야 합니다.");
        }
    }
    }

}
