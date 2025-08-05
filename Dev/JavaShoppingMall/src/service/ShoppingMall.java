package service;

import java.util.*;

import exception.CustomerNotFoundException;
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
    private ArrayList<Order> orders = new ArrayList<Order>();               // 주문 내역
    private HashMap<String, ArrayList<CartItem>> carts = new HashMap<String, ArrayList<CartItem>>(); // 고객별 장바구니
    private String mallName;
    private int orderCounter; // 주문 번호 생성용
    
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
    		if(pro.getName() == name) {
    			arr.add(pro);
    		}
    	return arr;
    }
    public ArrayList<Product> getProductsByCategory(String category){
    	ArrayList<Product> arr = new ArrayList<>();
    	
    	for(Product pro : products.values())
    		if(pro.getCategory() == category) {
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
    		if(cus.getId() == id) {
    			throw new ShopException("이미 존재하는 상품 ID입니다: P001");
    		}
    	}
    	customers.put(id, new Customer(id, name, email));
    }
    void addManager(String id, String name, String email, String department, int employeeId) throws ShopException{
    	for(Manager man: managers.values()) {
    		if(man.getId() == id) {
    			throw new ShopException("이미 존재하는 상품 ID입니다: P001");
    		}
    	}
    	managers.put(id, new Manager(id, name, email, department, employeeId));
    }
    void displayCustomerOrders(String customerId) throws CustomerNotFoundException{
    	Boolean switchOn = false;
    	for(String key: customers.keySet()) {
    		if(key == customerId) {
    			System.out.println("찾으시는 주문: \n"+ customers.get(customerId)+ "\n");
    			switchOn = true;
    		}
    	}
    	if(switchOn == false) {
    		throw new CustomerNotFoundException("존재하지 않는 고객입니다: C999");
    	}
    }
    void addToCart(String customerId, String productId, int quantity) throws CustomerNotFoundException, ProductNotFoundException{
    	ArrayList <CartItem> arr = new ArrayList<CartItem>();
    	
    	if(!products.containsKey(productId)) {
    		throw new ProductNotFoundException("존재하지 않는 상품입니다: P999");
    	}
    	if(!customers.containsKey(customerId)) {
    		throw new CustomerNotFoundException("존재하지 않는 고객입니다: C999");
    	}
    	
    	arr.add(new CartItem(products.get(productId),quantity));
    	carts.put(customerId, arr);
    }
    void displayCart(String customerId) throws CustomerNotFoundException{
    	if(!carts.containsKey(customerId)) {
    		throw new CustomerNotFoundException("존재하지 않는 고객입니다: C999");
    	}
    	for(ArrayList<CartItem> cart: carts.values()) {
    		int i = 1;
    		System.out.println(i + "번째 상품: \n" + cart + "\n");
    		i++;
    	}
    }
}
