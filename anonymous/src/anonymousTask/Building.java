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
						System.out.println(order + "주문 완료");
						return;
					}
				}
				System.out.println("없는 제품입니다.");
			}
			
			@Override
			public String[] getGoods() {
				return new String[] {"운동화", "후드티", "운동복"};
			}
		});
		
		gwangju.register(new FormAdapter() {
			
			@Override
			public String[] getGoods() {
				return new String[] {"운동화", "후드티", "운동복"};
			}
		});
	}
}
