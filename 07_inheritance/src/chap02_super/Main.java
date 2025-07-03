package chap02_super;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Developer developer = new Developer("Robin", new String[] {"Java","MySQL","Python","Flutter","C#"});  //-- 동적 초기화(체크)
    developer.printInfo();
    
  }

}
