package anonymousTest;

//지점마다 어떤 메뉴를 팔지, 어떻게 팔지
//인터페이스로 기본 form 작성
public interface Form {
	public String[] getMenu();
	public void sell(String order);
}
