package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//�÷��� �����ӿ�ũ Ȱ��
public class OneOrZero {
   public int solution(String s) {
      int result = 0;
//      ��̸���Ʈ ���ڿ��� ����(datas)           ���ڿ����� 0�� �������� ���ø��ϴ� �迭(0�� �������� 1�� �̷���� ���ڿ����� ĭ���� �и�)
      ArrayList<String> datas = new ArrayList<String>(Arrays.asList(s.split("0")));
//                         datas -> stream() -> map�� ���� ���ڿ� �Է����� �� ���̷� �����ϵ��� -> ���� ���� ����Ʈȭ
      List<Integer> lengths = datas.stream().map(String::length).collect(Collectors.toList())
//    	  stream()       ->           ������	                  -> ����Ʈȭ  
         .stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//    �����      lengths ����� 0�̸� 0�� ����, �ƴϸ� lengths�� 0��° �� ����(1�� ���ӵǴ� ������ �ִ밪�� ��)
      result = lengths.size() == 0 ? 0 : lengths.get(0);
      
      return result;
   }
   
   public static void main(String[] args) {
      int result = new OneOrZero().solution("11100000111");
      System.out.println(result);
   }
}


