package anonymousTest;

public class Starbucks {
//	���庰 form ���
	public void register(Form form) {
		String[] menu = form.getMenu();
		
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
//		form�� FormAdapter Ÿ���̸� ���� ���� return���� �����
		if(form instanceof FormAdapter) {
			System.out.println("���� ���� �����Դϴ�.");
			return;
		}
		
		form.sell("�Ƹ޸�ī��");
	}
}
