package anonymousTask;

public class Building {
	public static void main(String[] args) {
		Nike seongnam = new Nike();
		Nike gwangju = new Nike();
		
		seongnam.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[] goods = getGoods();
				for (int i = 0; i < goods.length; i++) {
					if(goods[i].equals(order)) {
						System.out.println(order + "�ֹ� �Ϸ�");
						return;
					}
				}
				System.out.println("���� ��ǰ�Դϴ�.");
			}
			
			@Override
			public String[] getGoods() {
				return new String[] {"�ȭ", "�ĵ�Ƽ", "���"};
			}
		});
		
		gwangju.register(new FormAdapter() {
			
			@Override
			public String[] getGoods() {
				return new String[] {"�ȭ", "�ĵ�Ƽ", "���"};
			}
		});
	}
}
