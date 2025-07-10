package chap01_File;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * java.io.File
 *
 * 파일과 디렉터리(폴더) 작업을 지원하는 클래스.
 */
public class Main {

    public static void handling() {
        // 1. 생성할 디렉터리를 File 객체로 생성 (이 시점에서는 실제로 디렉터리가 만들어지지 않음)
        File dir = new File("D:/dev/Java_IntelliJ/storage");

        // 2. 디렉터리 생성 (없으면 만듦)
        if (!dir.exists()) {
            dir.mkdirs();
            System.out.println("디렉터리가 생성되었습니다.");
        } else {
            System.out.println("이미 존재하는 디렉터리입니다.");
        }

        // 3. 디렉터리 삭제 (있으면 삭제)
        if (dir.exists()) {
            dir.delete();
            System.out.println("디렉터리가 삭제되었습니다.");
        } else {
            System.out.println("존재하지 않는 디렉터리입니다.");
        }

        //---- 실습. 현재 날짜를 디렉터리 이름으로 사용해서 생성하시오 )(예: D:/2025/07/10)

        File dir2 = new File("D:/" + DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDate.now()));
        // 2. 디렉터리 생성 (없으면 만듦)
        if (!dir2.exists()) {
            dir2.mkdirs();
            System.out.println("디렉터리가 생성되었습니다.");
        } else {
            System.out.println("이미 존재하는 디렉터리입니다.");
        }




    }

    public static void deleteDirectoryTree(String pathname){ // recursive call (재귀 호출)

        //---- 실습. 파라미터로 전달된 디렉터리를 모두 삭제하세요.
        //          비어 있는 디렉터리만 삭제할 수 있으므로 아래 과정이 필요합니다.
        //          D:/2025/07/10 삭제 -> D:/2025/07 삭제 -> D:/2025 삭제

        File dir = new File(pathname); //-- 최초 호출 시 "D:/2025/07/10" 경로
                                      //-- 다음 호출 시 "D:/2025/07" 경로
                                     //-- 다음 호출 시 "D:/2025" 경로
                                     //-- 다음 호출 시 "D:" 경로 (루트 경로로 인식: 부모 디렉터리가 없는 시점이 종료 시점)
        if (dir.getParentFile() == null){ //- 부모 디렉터리가 없으면!
            return;
        }


        dir.delete();  //----------------- 최초 호출 시 "D:/2025/07/10" 삭제
                       //----------------- 다음 호출 시 "D:/2025/07" 삭제
                      //-----------------  다음 호출 시 "D:/2025" 삭제
        deleteDirectoryTree(dir.getParent()); //--- 상위 디렉터리 정보를 넘깁니다.
    }
    public static void information(){

        //JAVA_HOME 디렉터리를 File 객체로 생성
        File dir = new File("C:/Program Files/Java/jdk-17");

        //JAVA_HOME 디렉터리에 포함된 모든 파일/디렉터리를 File[] 배열로 가져옴
        File[] files = dir.listFiles();

        //StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();

        //하나씩 정보 확인
        for (File file : files){

            // 수정한 날짜
            sb.append(String.format("%-30s",new SimpleDateFormat("yyyy-MM-dd a hh:mm").format(file.lastModified())));
            // 유형 (파일/디렉터리)
            sb.append(String.format("%-10s", file.isDirectory() ? "<DIR>" : ""));
            // 크기
            sb.append(String.format("%-10s", file.isFile()? new DecimalFormat("#,##0").format(file.length()) : ""));
            // 이름
            sb.append(file.getName()).append("\n");

        }
        // 결과 확인
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        //handling(); // 메소드 호출 시 괄호 필수!
        deleteDirectoryTree("D:/2025/07/10"); //---- 실습 D:/2025/07/10 디렉터리를 모두 삭제하세요.
        //information();

    }
}
