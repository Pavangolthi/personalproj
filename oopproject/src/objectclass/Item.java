package objectclass;

public class Item implements Cloneable{
	private int id;
	private String name;
	private float price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	

	public Item(int id, String name, float price) {
		super();
		//to set the values of the properties, we can use the setter methods in the parameterized constructor
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) return false; 
		Item item = (Item) obj;
		if(item.id == this.id && this.name.equals(item.name) && this.price == item.price) {
			return true;
		}		
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id :"+id+" Name: "+name+" Price: "+price;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
