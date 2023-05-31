package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileTest {
   
   public static void main(String[] args) throws IOException{
      FileTest fileTest = new FileTest();
      
//      절대 경로: 어디에서 작성해도 찾아갈 수 있는 경로, C:/a/b
//      상대 경로: 현재 위치에 따라 변경되는 경로, .., ., ./a, a
//      버퍼 클래스를 통해 텍스트 파일 출력
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
      bufferedWriter.write("끼얏호우\n");
//      파일 경로를 다시 닫아주어야 입력한 값을 출력할 수 있다.
      bufferedWriter.close();
      
      System.out.println();
//		버퍼클래스 통해 텍스트 파일을 읽어서 불러온다
      BufferedReader bufferedReader = null;
//      텍스트파일을 바이트로 받아오면 한 번에 모든 내용을 받아올 수 있다.
      String content = new String(Files.readAllBytes(Paths.get("test.txt")));
      System.out.println(content);
//      혹은 트라이 캐치로 텍스트 파일을 한 줄씩 불러온다
      try {
         bufferedReader = new BufferedReader(new FileReader("test.txt"));
         String line = null;
//         텍스트파일에서 읽어올 라인이 있다면 콘솔로 출력
         while((line = bufferedReader.readLine()) != null) {
            System.out.print(line);
         }
//         읽어올 파일이 없다면 FNFE로 예외처리
      } catch (FileNotFoundException e) {
         System.out.println("파일을 찾을 수 없습니다.");
//         finally로 경로 닫아주기
      } finally {
         try {
//        	 경로상 파일이 존재한다면
            if(bufferedReader != null) {
//            	닫아준다
               bufferedReader.close();
            }
//          그 외의 예외상황에는 강제로 경로를 닫아준다
         } catch (Exception e) {
            throw new RuntimeException(e);
         }
      }
//     생성한 텍스트 파일 파일 삭제하기
      File file = new File("test.txt");
      if(file.exists()) {
         file.delete();
      }
   }
}

