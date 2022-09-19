import java.util.Comparator;

public class Item implements Cloneable, Comparable<Item>, Comparator<Item>{
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
	public int compareTo(Item o) {
		int id1 = this.id;
		int id2 =  o.id;
		if(id1<id2) {
			return -1;
		}else if(id1 > id2) {
			return 1;
		}
		return 0;
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


	@Override
	public int compare(Item arg0, Item arg1) {
		// TODO Auto-generated method stub
		Float i1 = (Float) arg0.price;
		Float i2 = (Float) arg1.price;
		return i1.compareTo(i2);
	}
	
	
}
