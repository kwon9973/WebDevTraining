package model;

public class CartItem {
	private Product product;  // 상품
    private int quantity;    // 수량
    
    public CartItem(Product product, int quantity) {
		//super();
		this.product = product;
		this.quantity = quantity;
	}
    
 
	public Product getProduct() {
		return product;
	}
	public int getQuantity() {
		return quantity;
	}
	// 수량 증가
    public void addQuantity(int amount) {
    	if(amount < 0) {
    		return;
    	}
    	quantity += amount;
    }
    // 총 가격 계산
    public int getTotalPrice() {
    	return product.getPrice() * quantity;
    }
    // toString()으로 상품정보와 총액 표시
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.product + "\n---------(수량: " + quantity + ")------------\n";
    }
}
