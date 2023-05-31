package anonymousTask;

public class Nike {
	public void register(Form form) {
		String[] goods = form.getGoods();
		
		for (int i = 0; i < goods.length; i++) {
			System.out.println(goods[i]);
		}
		if (form instanceof FormAdapter) {
			System.out.println("무료 나눔 제품입니다.");
			return;
		}
		form.sell("운동화");
	}
}
