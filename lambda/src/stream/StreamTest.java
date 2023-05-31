package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	public Integer getTwoTimes(Integer number) {
		return number * 2;
	}
	
	public boolean checkEven(int number) {
		return number % 2 == 0;
	}
	
	public int change(int number) {
		return 10 - number;
	}
	
	public static void main(String[] args) {
//		Arrays.asList()
//		�迭�� List�� ���氡��
//		Integer[] arData = {10, 20, 30, 40, 50};
//		���� ���� ���� List�� ���氡��
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//		System.out.println(datas.toArray()[0]);
//		System.out.println(datas);
		
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		StreamTest streamTest = new StreamTest();
		
//		forEach() : �ݺ�
//		���� ���� ������ �ִ� �÷��� ��ü���� forEach �޼ҵ带 ����� �� �ִ�.
//		forEach() �޼ҵ忡�� Consumer �������̽� Ÿ���� ���� �����ؾ� �Ѵ�.
//		Consumer�� �Լ��� �������̽��̱� ������ ���ٽ��� ����� �� �ִ�.
//		�Ű��������� �÷��� ��ü �ȿ� �ִ� ������ ������� ����,
//		ȭ��ǥ �ڿ����� �����ϰ� ���� ������ �ۼ��Ѵ�.
//		datas.stream().forEach(data -> System.out.println(data));
//		���� ���̴� �޼ҵ��̱� ������ stream �����ϰ� ����� �� �ְ� �Ǿ� ����.
//		datas.forEach(data -> System.out.println(data));
//		��ü(or Ŭ����)::�����޼ҵ�
//		datas.forEach(System.out::println);
		
//		map() : ���� �� ����
//		ArrayList<User> users = new ArrayList<User>(Arrays.asList(new User("��ġ��", 20), new User("ȫ�浿", 20)));
//							��ü���� -> �����Ҹ޼ҵ�
//		datas.stream().map(data -> data * 2).forEach(System.out::println);
//		�޼ҵ尡 static�� �ƴ϶�� ����. �ּ� ������ ��ü �ʿ�
//		�޼ҵ带 Ŭ���� �ȿ� ��������, ��ü::�����޼ҵ� ���� ���
//		datas.stream().map(streamTest::getTwoTimes).forEach(System.out::println);		
//		users.stream().map(User::getAge).forEach(System.out::println);
//		����: map, �ݺ�: forEach
		
//		range(inclusive, exclusive)
//		rangeClosed(inclusive, inclusive)
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		��Ʈ��Ʈ�� ���� ����
//		IntStream.range(1, 10).forEach(System.out::println);
//		IntStream.rangeClosed(1, 10).forEach(System.out::println);
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		System.out.println(datas);
		
//		chars(): ���ڿ��� IntStream���� ����
//		String data = "ABC";
//		A, B, C�� �ƽ�Ű �ڵ尪���� ��µȴ�
//		data.chars().forEach(System.out::println);
//		��Ʈ��Ʈ���� ����ȯ�� �ص� ������ ������ ���ϵȴ�.
//		data.chars().map(c -> (char)c).forEach(System.out::println);
//		forEach�� ���� ����� �� ����ȯ�� ���־�� ���ڰ����� ����� �ȴ�.
//		data.chars().forEach(c -> System.out.println((char)c));
		
//		filter(): ���ǽ��� true�� ��츸 ����١�
//		StreamTest streamTest = new StreamTest();
//		IntStream.range(0, 10).filter(streamTest::checkEven).forEach(System.out::println);
		
////		sorted(): ����
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		StreamTest streamTest = new StreamTest();
//		IntStream.rangeClosed(0, 9).map(streamTest::change).forEach(datas::add);
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		System.out.println(datas);
//		datas.stream().sorted().forEach(System.out::println);
//		datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		collect(): ����� �پ��� Ÿ������ �������ش�.
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 30, 15));
//		System.out.println(datas.stream().map(String::valueOf).collect(Collectors.joining(":")));
		
		List<Integer> datas = new ArrayList<Integer>(Arrays.asList(30, 20, 90, 40, 80));
//		�÷��ǿ����� Stream�� �ִ� sorted�� ������� �ʰ� sort�� ����Ͽ� ���� ������ �ּҸ� ���Ľ�Ų��.
//		������������ �������ش�.
//		datas.sort(null);
//		������
//		datas.sort(Collections.reverseOrder());
//		System.out.println(datas);
		List<Integer> results = datas.stream().sorted().collect(Collectors.toList());
		System.out.println(results);
		
//		System.out.println(datas.stream().map(String::valueOf).collect(Collectors.joining(", ")));
		
	}
}


