package chap01_is_a;

public class Main {

  public static void main(String[] args) {
    Student student = new Student();
    student.eat();
    student.sleep();
    student.study();
    
    Worker worker = new Worker();
    worker.eat();
    worker.sleep();
    worker.startWork();
    worker.finishWork();
    
    
    Developer developer = new Developer();
    developer.eat();
    developer.sleep();
    developer.startWork();
    developer.develop();
    
    Designer designer = new Designer();
    designer.design();
    designer.finishWork();
    designer.eat();
    
  }

}
