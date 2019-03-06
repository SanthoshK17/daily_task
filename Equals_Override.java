package pack;

public class Equals_Override {

		String name;
		int id_no;
		
		public Equals_Override(String name,int id_no) 
		{
			this.name = name;
			this.id_no = id_no; 
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals_Override O1= new Equals_Override("Sandy",12);
		Equals_Override O2= new Equals_Override("Sandy",12);
		
		System.out.println("O_1 hashcode = " + O1.hashCode()); 
		System.out.println("O_2 hashcode = " + O2.hashCode()); 
		System.out.println("Checking equality between O_1 and O_2 = " + O1.equals(O2));
		
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_no;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equals_Override other = (Equals_Override) obj;
		if (id_no != other.id_no)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
