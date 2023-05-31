package anonymousTest;

public class Starbucks {
//	매장별 form 등록
	public void register(Form form) {
		String[] menu = form.getMenu();
		
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
//		form이 FormAdapter 타입이면 문구 띄우고 return으로 멈춘다
		if(form instanceof FormAdapter) {
			System.out.println("무료 나눔 매장입니다.");
			return;
		}
		
		form.sell("아메리카노");
	}
}
