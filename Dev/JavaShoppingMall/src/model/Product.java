package model;

import exception.InsufficientStockException;

public class Product {
	private String productId;       // 상품 ID
    private String name;           // 상품명
    private int price;            // 가격
    private int stock;            // 재고
    private String category;      // 카테고리
    private double rating;        // 평점 (0.0 ~ 5.0)
    private int reviewCount;      // 리뷰 개수
    
    public Product(String productId, String name, int price, int stock, String category) {
		//super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.category = category;
	}
	public String getProductId() {
		return productId;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	public String getCategory() {
		return category;
	}
	public double getRating() {
		return rating;
	}
	public int getReviewCount() {
		return reviewCount;
	}
	// 생성자, getter 메서드들
    public void reduceStock(int quantity) throws InsufficientStockException{
    	if(this.stock <= 5) {
    		throw new InsufficientStockException("재고가 부족합니다");
    	}else {
    		this.stock -= quantity;
    		System.out.println(this.stock); 
    	}
    }
    public void addStock(int quantity) {
    	this.stock += quantity;
    }
    public boolean isInStock() {
		return (this.stock > 0 ? true : false);
    }
    // 재고 5개 이하 체크 (요구사항)
    public boolean isLowStock() {
		return (this.stock <= 5 ? true : false);
    }
    public void addReview(double newRating) {
    	if (reviewCount == 0) {
    		rating += newRating;
    		System.out.println(rating);
    		reviewCount++;
    	}
    	reviewCount++;
    	rating += newRating;
    	rating = rating / reviewCount;
    	System.out.println(rating);
    }
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "- 상품ID: "+ productId +" | 상품이름: "+ name +" | 가격: "+ price +" | 물량: "+ stock +" | 종류: "+ category+" | 평점: " + rating +" | 평점갯수: "+ reviewCount + "\n";
    }
}
