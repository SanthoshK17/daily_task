package pack;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "String in common pool";
		String t=new String();
		t="Working with Sting class";
		String q="String in common pool";
		
		System.out.println(t);
		System.out.println(t.intern());
		System.out.println(t.trim());
		System.out.println(s);
		s="Changing value of s";
		System.out.println(q);
		System.out.println(s.toUpperCase());
		System.out.println(t.toLowerCase());
		System.out.println(s.startsWith("ST"));
		System.out.println(s.startsWith("Ch"));
		System.out.println(t.endsWith("class"));
		System.out.println(s +" "+ t);
		
		String s1=s.replace("Changing","Changed");
		System.out.println(s1);
		
		System.out.println(t.charAt(3));
	}

}
