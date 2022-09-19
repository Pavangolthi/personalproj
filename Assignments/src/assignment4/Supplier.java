package assignment4;

import java.util.Comparator;

public class Supplier implements Comparable<Supplier>, Comparator<Supplier>{
	
		private int id;
		private String name;
		private String code;
		
		public Supplier() {
			// TODO Auto-generated constructor stub
		}
		
		
		public Supplier(int id, String name, String code) {
			super();
			this.id = id;
			this.name = name;
			this.code = code;
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
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}

		@Override
		public String toString() {
			return "Id: "+getId()+" Name: "+getName()+" Code: "+getCode();
		}
		
		@Override
		public int hashCode() {
			int prime = 31;
			return (this.getId()*prime)+this.getName().hashCode()+this.getCode().hashCode();
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Supplier) {
				Supplier supplier = (Supplier) obj;
				if(this.getId() == supplier.id && this.getName().equals(supplier.getName()) && this.getCode().equals(supplier.getCode())) {
					return true;
				}
				else {
					return false;
				}
			}
			return false;
		}


		@Override
		public int compareTo(Supplier arg0) {
			String s1 = this.code;
			String s2 = arg0.code;
			
			return s1.compareTo(s2);
		}


		@Override
		public int compare(Supplier arg0, Supplier arg1) {
			Integer i1 = arg0.id;
			Integer i2 = arg1.id;
			
			return i1.compareTo(i2);
		}
}
