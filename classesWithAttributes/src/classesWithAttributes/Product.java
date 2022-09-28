package classesWithAttributes;

public class Product {
	
	//ayn� isimle farkl� parametrelrle methodlar�m�z� kullanabiliyoruz.
	public Product(int id, String name, String description, double price, int stockAmount ){  //constructor videosu
		
		System.out.println("Yap�c� blok �al��t�.");
		
	}
	
	public Product() {
		
	}
	
	//attribute | field
	private String name;
	private String description;
	private int id;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return this.name.substring(0,1) + id;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}



}
