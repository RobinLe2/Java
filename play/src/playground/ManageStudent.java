package playground;

public class ManageStudent {
    public static void main(String[] args){
        Student student[] = null;
        ManageStudent sample = new ManageStudent();
        student = sample.addStudent();
        sample.printStudents(student);


    }

    public Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("LIM");
        student[1] = new Student("MIN");
        student[2] = new Student("Sook","Seoul","010XXXXXXX","ask@godofjava.com");
        return student;
    }

    public void printStudents(Student[] students){
        for(Student student : students){
            System.out.println(student);
        }
    }
}
