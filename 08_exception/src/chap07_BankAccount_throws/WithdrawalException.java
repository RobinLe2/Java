package chap07_BankAccount_throws;

public class WithdrawalException extends Exception {

    @java.io.Serial //----- import를 생략할 수 있습니다.
    private static final long serialVersionUID = 68121351231236L;

    public WithdrawalException(String message) {
        super(message);  //--- Exception의 생성자를 호출하며 예외 메시지(String message)를 전달합니다.  자식은 부모 생성자의 호출이 필수적.
    }
}
