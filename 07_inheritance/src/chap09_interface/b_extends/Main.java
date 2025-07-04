package chap09_interface.b_extends;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("전압: " + ElectronicProduct.VOLT  + "V");
        computer.powerOn();
        computer.powerOff();
        int a = 10 , b = 4;
        System.out.println(computer.add(a,b));
        System.out.println(computer.sub(a,b));
        System.out.println(computer.mul(a,b));
        System.out.println(computer.div(a,b));
        System.out.println(computer.mod(a,b));





    }
}
