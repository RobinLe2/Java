package chap04_set;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //---- HashSet 객체에 Person 객체를 저장할 때 오버라이드 된 hashCode()와 equals()를 이용하여
    // 기존에 저장된 Person 객체와 새로 저장하려는 Person 객체의 중복 여부를 판단합니다.
    // 먼저 hashCode() 메소드로 해시값을 비교하고 , 동일한 해시값을 가지고 있으면 equals()  메소드를 호출합니다.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}
