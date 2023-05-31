package hashMapTest;

public class Product {
//   상품 번호, 상품 이름, 상품 가격, 상품 재고
   private static Long sequence;
//   중복 없는 값은 정수타입. 문자열 값으로 하면 유지보수가 어렵다
//   Long 사용 이유:
//   1) 장기적으로 서비스를 운영했을 때 바이트를 초과하여 문제가 생기는 것을 방지하기 위해
//   2) 클래스타입으로 사용한 이유 : null을 허용하기 위해서
   private Long productId;
   private String productName;
   private int productPrice;
   private int productStock;

//   static 블록 : 단 한 번만 실행
//   롱 클래스 타입은 숫자 뒤에 L을 붙여준다.
   static {
      sequence = 0L;
   }
   
//   초기화 블록: 생성자를 호출할 때 마다 실행
   {
      sequence++;
   }
   
   public Product() {;}
   
   public Product(String productName, int productPrice, int productStock) {
      this.productId = sequence;
      this.productName = productName;
      this.productPrice = productPrice;
      this.productStock = productStock;
   }

   public Long getProductId() {
      return productId;
   }

   public void setProductId(Long productId) {
      this.productId = productId;
   }

   public String getProductName() {
      return productName;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public int getProductPrice() {
      return productPrice;
   }

   public void setProductPrice(int productPrice) {
      this.productPrice = productPrice;
   }

   public int getProductStock() {
      return productStock;
   }

   public void setProductStock(int productStock) {
      this.productStock = productStock;
   }

   @Override
   public String toString() {
      return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
            + ", productStock=" + productStock + "]";
   }
}

