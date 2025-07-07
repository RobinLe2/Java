package chap06_BankAccount;

public class BankAccount {

    private String accNo;  // 계좌번호
    private long balance;  // 잔고

    public BankAccount(String accNo, long balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    /**
     * 입금 메소드입니다. 마이너스 입금은 불가능합니다.
     * @param money 입금액
     */
    public void deposit(long money) {
        try {
            if (money < 0) {
                throw new RuntimeException(money + "원 입금 불가");
            } else {
                balance += money;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 출금 메소드입니다. 마이너스 출금과 잔액보다 큰 금액의 출금은 불가능합니다.
     * @param money 출금액
     * @return 실제 출금액. 출금 성공 시 money, 실패 시 0
     */
    public long withdrawal(long money) {
        try {
            if (money < 0) {
                throw new RuntimeException(money + " 원 출금 불가");
            } else if (money > balance) {
                throw new RuntimeException("잔액 부족  잔고 : " + balance + "원");
            }
            balance -= money;
            return money;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    /**
     * 이체 메소드입니다. 출금된 금액만큼 다른 계좌에 입금됩니다.
     * @param bankAccount 상대방 계좌
     * @param money 이체할 금액
     */
    public void transfer(BankAccount bankAccount, long money) {
        long amount = this.withdrawal(money); // 내 계좌에서 출금
        bankAccount.deposit(amount);          // 상대 계좌에 입금
    }

    /**
     * 계좌 조회 메소드입니다. 계좌번호와 잔고를 출력합니다.
     */
    public void inquiry() {
        System.out.println("계좌번호: " + accNo);
        System.out.println("잔고: " + balance);
    }
}
