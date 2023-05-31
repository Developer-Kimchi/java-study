package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
   
   public static int changeToInteger(int c) {
      return c - 48;
   }
   
   public static void main(String[] args) {
//      10~1���� ArrayList�� ��� ���
//	    ���� ���� ��� ����Ʈ ����(datas)
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//	    ��Ʈ��Ʈ������ ���� ���� ���� -> �ʿ��� ���ٷ� 10 - ���� �� ���� -> forEach�� datas�� ���� �� �ݺ� �߰�
//      IntStream.range(0, 10).map(data -> 10 - data).forEach(datas::add);	   
//      System.out.println(datas);
      
//      1~10���� ArrayList�� ��� ���
//	    ���� ���� ��� ����Ʈ ����(datas)
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//	    ��Ʈ��Ʈ�� ���� ���� rangeClosed�� �����ְ� forEach ���� datas�� �� �ݺ� �߰�
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      System.out.println(datas);
      
//      ABCDEF�� �� ���ں��� ���
//      String data = "ABCDEF";
//	    chars ��� �� 'forEach'���� �������� ���ڰ����� ����ȯ�Ͽ� ���
//      data.chars().forEach(c -> System.out.println((char)c));
      
//      1~100���� �� Ȧ���� ArrayList�� ��� ���
//	    ������ ���� ��� ����Ʈ ��ü ����
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//	    ��Ʈ��Ʈ�� rangeClosed�� 1���� 100���� ���� �����ش� -> filter���� ���ٷ� ���ǽ� -> forEach�� datas�� �� �߰�
//      IntStream.rangeClosed(1, 100).filter(data -> data % 2 == 1).forEach(datas::add);
//      System.out.println(datas);
      
//      A~F���� �� D�����ϰ� ArrayList�� ��� ���
//	    ��� ����Ʈ ��ü(ĳ������)
//      ArrayList<Character> datas = new ArrayList<Character>();
//	    range�� ���� �����ְ� map���� ���ٷ� ���׿����� ���ǽ�(c���� 67���� ũ�ٸ� 68�� �н�) -> forEach���� ���� ���������� ��ȯ
//      IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(data -> datas.add((char)data));
//      System.out.println(datas);
      
//      5���� ���ڿ��� ��� �ҹ��ڷ� ����("Black", "WHITE", "reD", "yeLLow", "PINk"), toLowerCase() ���
//      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//	    stream().map()���� datas�� ���ڿ� ������ ���� �ҹ��ڷ� ��ȯ���ش�.
//      datas.stream().map(String::toLowerCase).forEach(System.out::println);
      
//      1~100���� �� ¦���� ArrayList�� ��� ���
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//	    Ȧ���� ����� ���� ���ǽĸ� ¦���� �ٲ��ش�
//      IntStream.rangeClosed(1, 100).filter(data -> data % 2 == 0).forEach(datas::add);
//      System.out.println(datas);
      
//      "Apple", "banana", "Melon" �� ù ��° ���ڰ� �빮���� ���ڿ� ���
//      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//	    ���� ���� ���ڿ� ù��° ���� A~Z�� ��츸 ���
//      datas.stream().filter(data -> data.charAt(0) >= 'A')
//                  .filter(data -> data.charAt(0) <= 'Z')
//                     .forEach(System.out::println);
      
//      �ѱ��� ������ ����
//      String hangle = "�����̻�����ĥ�ȱ�";
//      String input = "�ϰ��̻�";
//	    ���� ���� �ѱ� ���ڿ��� �ִ� ���ڰ��� �ε��� ������ ���
//      input.chars().map(hangle::indexOf).forEach(System.out::print);      
      
//      ������ �ѱ۷� ���� "1024" -> '1' - 48 = 1
//      String hangle = "�����̻�����ĥ�ȱ�";
//      String input = "1024";
//	   ���� ���� ������ ���ڸ� ���������� ��ȯ���ش�(�޼ҵ忡 ����) -> ������ ��ȯ�� i���� �Ű������� hangle �ε��� �� �����Ͽ� ���
//      input.chars().map(StreamTask::changeToInteger).forEach(i -> System.out.print(hangle.charAt(i)));
   }
}
