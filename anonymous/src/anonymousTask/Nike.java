package anonymousTask;

public class Nike {
	public void register(Form form) {
		String[] goods = form.getGoods();
		
		for (int i = 0; i < goods.length; i++) {
			System.out.println(goods[i]);
		}
		if (form instanceof FormAdapter) {
			System.out.println("���� ���� ��ǰ�Դϴ�.");
			return;
		}
		form.sell("�ȭ");
	}
}
