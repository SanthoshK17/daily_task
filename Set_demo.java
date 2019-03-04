package pack;
import java.util.*;

public class Set_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> Set_a = new HashSet<Integer>(); 
        Set_a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0})); 
        Set<Integer> Set_b = new HashSet<Integer>(); 
        Set_b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5})); 
  
        
        Set<Integer> union = new HashSet<Integer>(Set_a); 
        union.addAll(Set_b); 
        System.out.print("Union of the two Set"); 
        System.out.println(union); 
  
        
        Set<Integer> intersection = new HashSet<Integer>(Set_a); 
        intersection.retainAll(Set_b); 
        System.out.print("Intersection of the two Set"); 
        System.out.println(intersection); 
  
         
        Set<Integer> difference = new HashSet<Integer>(Set_a); 
        difference.removeAll(Set_b); 
        System.out.print("Difference of the two Set"); 
        System.out.println(difference); 
	}

}
