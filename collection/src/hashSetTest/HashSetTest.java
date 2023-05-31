package hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
   public static void main(String[] args) {
//	      �ڵ��׽�Ʈ ���
//	   	  ��̸���Ʈ�� �ߺ��� ���� �Բ� ����
	      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 30, 30, 30, 20, 10, 90));
//	      �ؽ��� �����ڿ� datas(�÷���) �ִ´�
	      HashSet<Integer> dataSet = new HashSet<Integer>(datas);
//	      datas�� dataSet�� �ִ´�
	      datas = new ArrayList<Integer>(dataSet);
//	      �ߺ��� ����
	      System.out.println(datas);
	      
	   
      HashSet<String> bloodTypeSet = new HashSet<String>();
      bloodTypeSet.add("A");
      bloodTypeSet.add("B");
      bloodTypeSet.add("O");
      bloodTypeSet.add("AB");
//      �̻� �ߺ��� �� ����
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
//    HashSet�� ���� ������ �� ������ iterator�� ���� �����´�
//    HashSet�� ������ ������ ���� �ʴ�.
      System.out.println(bloodTypeSet.toString());
//      iterator ������� ���� �ο�      �ؽ��� ��ü.iterator();
      Iterator<String> iter = bloodTypeSet.iterator();
//      hasNext()�� ���� ���� ���� �ִ� �� �˻��ϰ�, next()�� ����ؼ� ���� �����´�.
      while(iter.hasNext()) {
         System.out.println(iter.next());
      }
   }
}
