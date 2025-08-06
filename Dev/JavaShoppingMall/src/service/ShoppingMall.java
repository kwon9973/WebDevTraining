package service;

import java.time.LocalDateTime;
import java.util.*;

import exception.CustomerNotFoundException;
import exception.InsufficientStockException;
import exception.ProductNotFoundException;
import exception.ShopException;
import model.Customer;
import model.Product;
import model.Manager;
import model.Order;
import model.CartItem;

public class ShoppingMall {
	private HashMap<String, Product> products = new HashMap<String, Product>();      // 상품 관리
    private HashMap<String, Customer> customers =new HashMap<String, Customer>();    // 고객 관리
    private HashMap<String, Manager> managers = new HashMap<String, Manager>();      // 관리자 관리
    private ArrayList<Order> orders = new ArrayList<Order>();               		// 주문 내역
    private HashMap<String, ArrayList<CartItem>> carts = new HashMap<String, ArrayList<CartItem>>(); // 고객별 장바구니
    private String mallName;
    private int orderCounter; // 주문 번호 생성용
    //additional fields
    private ArrayList<CartItem> savedItem = new ArrayList<CartItem>(); // carts add용 - 같은 고객아이디로 여러 카트 저장하려면 필요.
    private HashMap<String, Integer> productByCategory = new HashMap<String, Integer>(); // Categroy를 Key로 전환 productID를 value로
    
    
    
    public void addProduct(String productId, String name, int price, int stock, String category) throws ShopException{
    	if(products.containsKey(productId)) {
    		throw new ShopException("이미 존재하는 상품 ID입니다: P001");
    	}else {
    		products.put(productId, new Product(productId, name, price, stock, category));
    	}
    }
    public void displayAllProducts() {
    	for(Product product: products.values()) {
    		System.out.println(product);
    	}
    }
    // 재고 있는 상품만
    public void displayAvailableProducts() {
    	for(Product product: products.values()) {
    		if(product.isInStock()) {
    			System.out.println(product);
    		}else {
    			return;
    		}
    	}
    }
    public ArrayList<Product> searchProductsByName(String name){
    	ArrayList<Product> arr = new ArrayList<>();
    	for(Product pro : products.values())
    		if(pro.getName().equals(name)) {
    			arr.add(pro);
    		}
    	return arr;
    }
    public ArrayList<Product> getProductsByCategory(String category){
    	ArrayList<Product> arr = new ArrayList<>();
    	
    	for(Product pro : products.values())
    		if(pro.getCategory().equals(category)) {
    			arr.add(pro);
    		}
    	return arr;
    }
    // 재고 부족 상품 (5개 이하)
    public ArrayList<Product> getLowStockProducts(){
    	ArrayList<Product> arr = new ArrayList<>();
    	
    	for(Product pro : products.values())
    		if(pro.isLowStock()) {
    			arr.add(pro);
    		}
    	return arr;
    }
    //be ready to get the matching between Product - id to String id with containsValue() or for(Customer cus : customers.values())
    public void addCustomer(String id, String name, String email) throws ShopException{
    	for(Customer cus: customers.values()) {
    		if(cus.getId().equals(id)) {
    			throw new ShopException("이미 존재하는 상품 ID입니다: P001");
    		}
    	}
    	customers.put(id, new Customer(id, name, email));
    }
    public void addManager(String id, String name, String email, String department, int employeeId) throws ShopException{
    	for(Manager man: managers.values()) {
    		if(man.getId().equals(id)) {
    			throw new ShopException("이미 존재하는 상품 ID입니다: P001");
    		}
    	}
    	managers.put(id, new Manager(id, name, email, department, employeeId));
    }
    public void displayCustomerOrders(String customerId) throws CustomerNotFoundException{
    	Boolean switchOn = false;
    	for(String key: customers.keySet()) {
    		if(key.equals(customerId)) {
    			System.out.println("찾으시는 주문: \n"+ customers.get(customerId)+ "\n");
    			switchOn = true;
    		}
    	}
    	if(switchOn == false) {
    		throw new CustomerNotFoundException("존재하지 않는 고객입니다: C999");
    	}
    }
    public void addToCart(String customerId, String productId, int quantity) throws CustomerNotFoundException, ProductNotFoundException{
    	if(!products.containsKey(productId)) {
    		throw new ProductNotFoundException("존재하지 않는 상품입니다: P999");
    	}
    	if(!customers.containsKey(customerId)) {
    		throw new CustomerNotFoundException("존재하지 않는 고객입니다: C999");
    	}
    	
    	savedItem.add(new CartItem(products.get(productId),quantity)); // suspicious error - same product should be altogether even from the separate orders*********************************************************
    	//carts.put(customerId, savedItem); //not adding items for the same ID *********************************************************************
    }
    public void displayCart(String customerId) throws CustomerNotFoundException{
    	if(!carts.containsKey(customerId)) {
    		throw new CustomerNotFoundException("존재하지 않는 고객입니다: C999");
    	}
    	for(ArrayList<CartItem> cart: carts.values()) {
    		int i = 1;
    		System.out.println(i + "번째 상품: \n" + cart + "\n");
    		i++;
    	}
    }
	 // 핵심 처리 로직:
	 // 1. 고객 존재 확인 → CustomerNotFoundException
	 // 2. 장바구니 비어있는지 확인 → ShopException  
	 // 3. 재고 확인 및 차감 → InsufficientStockException
	 // 4. 주문 생성 및 저장
	 // 5. 장바구니 비우기
    public void placeOrder(String customerId) throws ShopException{
    	LocalDateTime time = LocalDateTime.now();
    	
    	if(!customers.containsKey(customerId)) {
    		throw new ShopException("존재하지 않는 고객입니다: C999");
    	}
    	if(carts.isEmpty()) {
    		throw new ShopException("장바구니가 비어있습니다.");
    	}
    	// 3. 재고 확인 및 차감 → InsufficientStockException
    	//todo 
    	
    	carts.put(customerId, savedItem);
    	Order order = new Order(customerId, customers.get(customerId), savedItem, time);
    	orders.add(order);
    	carts.remove(customerId);
    }
	 // 출력 내용:
	 // - 총 상품 수, 구매 가능한 상품 수, 재고 부족 상품 수 (5개 이하)
	 // - 등록 고객 수, 총 주문 수, 총 매출
	 // - 카테고리별 상품 수
    public void displayMallStatistics() {
    	int count1 = 0;
    	int count2 = 0;
    	int count3 = 0;
    	
    	int customerCount = 0;
    	int orderCount = 0;
    	int totalRevenue = 0;
    	
    	
    	try {
    		System.out.println("총 상품: ");
    		for (String key : products.keySet()) {
                Product value = products.get(key);
                count1++;
            }
    		System.out.println(count1);
    		
    		System.out.println("구매 가능한 상품 수:");
    		for (String key : products.keySet()) {
                Product value = products.get(key);
                if(value.isInStock()) {
                	count2++;
                }
            }
    		System.out.println(count2);
    		
    		System.out.println("재고 부족 상품: ");
    		for (String key : products.keySet()) {
                Product value = products.get(key);
                if(value.isLowStock()) {
                	count3++;
                }
            }
    		System.out.println(count3);
    		
    		System.out.println("등록 고객 수:" + customers.size());
    		System.out.println("총 주문 수: "+ orders.size());
    		for(int i = 0; i < orders.size(); i++) {
    			totalRevenue += orders.get(i).getTotalAmount();
    		}
    		System.out.println("총 매출: " + totalRevenue);
    		
    		// 같은 아이디 중복 방지용 - 아이디 찾기 
    		int i = 0;
        	for(String key: products.keySet()) {
    			Product value = products.get(key);
    			String category = value.getCategory();
    			
    			i++;
    			
    			for(int j = i;j < products.size();j++) {
    				
    				if(products.containsKey(category)) {
    					productByCategory.put(category, returnIntegerIncremented(productByCategory, category));
    				}else {
    					productByCategory.put(category, 1);
    				}
    			}
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
   
    int returnIntegerIncremented(HashMap<String, Integer> hash, String id) {
    	int count = hash.get(id);
    	count++;
    	return count;
    }
    
    
}
