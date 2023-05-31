package anonymousTest;

public class Building {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();
		
//		익명클래스를 통해 매장별 메뉴 및 판매방식 구현
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"아메리카노", "까페라떼", "그린티"};
			}
		});
		
		gangnam.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[] menu = getMenu();
				for (int i = 0; i < menu.length; i++) {
					if(menu[i].equals(order)) {
						System.out.println(order + " 주문 완료");
						return;
					}
				}
				System.out.println("없는 메뉴입니다");
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"아메리카노", "카페라떼", "그린티"};
			}
		});
	}
}
