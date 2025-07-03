package chap06_polymorphism;

public class Dog {
  public String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Dog(String name) {
    super();
    this.name = name;
  }
}
