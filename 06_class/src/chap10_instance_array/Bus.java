package chap10_instance_array;

public class Bus {
  
  private Seat[] seats = new Seat[5];
  private int count = 0;
  private final int LIMIT = 5;
  
  public Bus() {
    seats = new Seat[LIMIT];
  
  for (int i = 0 ; i < LIMIT ; i++) {
    seats[i] = new Seat();
  }
  }
  
  public void seatInfo() {
    for (int i = 0; i< LIMIT; i++) {
      //---- 각 Seat에 앉아있는 Person
      Person person = seats[i].getPerson();
      if(person == null) {
        System.out.println(String.format("%02d", i+1) + "번 좌석: 비어 있음");
      } else {
        System.out.println(String.format("%02d", i+1) + "번 좌석: " + person.getName());
      }
    }
  }
  //------ Bus 탑승 (빈 Seat가 보이면 순차적으로 채웁니다.)
  public void on(Person person) {
    if (count == LIMIT) {
      System.out.println("만차입니다");
      return;
    }
    for (int i=0 ; i< LIMIT; i++) {
      if (seats[i].getPerson() == null) {
        seats[i].setPerson(person);
        count++;
        break;
      }
    }
  }
  //---- Bus 하차 (Seat 번호(인덱스보다 1 큰 수)를 전달해서 해당 Seat를 비웁니다.)
  
  
  public void off(int seatNo) {
    if (seatNo <= 0 || seatNo > LIMIT) {
      System.out.println("없는 좌석 번호입니다.");
      return;
    }
    
     
    seats[seatNo-1].setPerson(null);
    count--;
      
      
    }
  }


