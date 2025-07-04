package chap08_abstract;

public class Main {
    public static void main(String[] args) {

        Animal animal;

        //animal = new Animal();   미완성 메소드를 호출 할 수 없다. 자식단에서 완성해야함

        animal = new Lion(); animal.move();      // 호출할 땐 부모(Animal)의 메소드 실행할 땐 자식(Lion)의 메소드

        animal = new Shark(); animal.move();

        animal = new Eagle(); animal.move();

    }
}