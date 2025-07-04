package chap09_interface.c_multi_implements;
// 인터페이스는 다중 구현 할 수 있습니다.
public class SmartPhone implements Camera, Phone {
    @Override
    public void picture() {
        System.out.println("사진기능");
    }

    @Override
    public void call() {
        System.out.println("전화기능");
    }
}
