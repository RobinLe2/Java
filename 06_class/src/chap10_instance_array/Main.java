package chap10_instance_array;

public class Main {

  public static void main(String[] args) {
   
     Bus bus = new Bus();
     
     bus.on(new Person("낸시"));
     bus.on(new Person("폴"));
     bus.on(new Person("제레미"));
     bus.on(new Person("알리"));
     bus.on(new Person("팀"));

    
     bus.off(5);
     bus.off(6);  
     bus.on(new Person("앤드류"));
     
     bus.seatInfo();
     

  }


}
