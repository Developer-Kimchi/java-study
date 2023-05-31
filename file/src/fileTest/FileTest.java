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
      
//      ���� ���: ��𿡼� �ۼ��ص� ã�ư� �� �ִ� ���, C:/a/b
//      ��� ���: ���� ��ġ�� ���� ����Ǵ� ���, .., ., ./a, a
//      ���� Ŭ������ ���� �ؽ�Ʈ ���� ���
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
      bufferedWriter.write("����ȣ��\n");
//      ���� ��θ� �ٽ� �ݾ��־�� �Է��� ���� ����� �� �ִ�.
      bufferedWriter.close();
      
      System.out.println();
//		����Ŭ���� ���� �ؽ�Ʈ ������ �о �ҷ��´�
      BufferedReader bufferedReader = null;
//      �ؽ�Ʈ������ ����Ʈ�� �޾ƿ��� �� ���� ��� ������ �޾ƿ� �� �ִ�.
      String content = new String(Files.readAllBytes(Paths.get("test.txt")));
      System.out.println(content);
//      Ȥ�� Ʈ���� ĳġ�� �ؽ�Ʈ ������ �� �پ� �ҷ��´�
      try {
         bufferedReader = new BufferedReader(new FileReader("test.txt"));
         String line = null;
//         �ؽ�Ʈ���Ͽ��� �о�� ������ �ִٸ� �ַܼ� ���
         while((line = bufferedReader.readLine()) != null) {
            System.out.print(line);
         }
//         �о�� ������ ���ٸ� FNFE�� ����ó��
      } catch (FileNotFoundException e) {
         System.out.println("������ ã�� �� �����ϴ�.");
//         finally�� ��� �ݾ��ֱ�
      } finally {
         try {
//        	 ��λ� ������ �����Ѵٸ�
            if(bufferedReader != null) {
//            	�ݾ��ش�
               bufferedReader.close();
            }
//          �� ���� ���ܻ�Ȳ���� ������ ��θ� �ݾ��ش�
         } catch (Exception e) {
            throw new RuntimeException(e);
         }
      }
//     ������ �ؽ�Ʈ ���� ���� �����ϱ�
      File file = new File("test.txt");
      if(file.exists()) {
         file.delete();
      }
   }
}

