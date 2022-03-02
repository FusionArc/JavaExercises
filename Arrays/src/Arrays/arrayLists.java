package Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayLists {

	public static void main(String[] args) {
		List<Integer> newList = new ArrayList<>();
		
		newList.add(212);
		newList.add(21);
		newList.add(22);
		newList.add(12);
		
		System.out.println(newList);
		System.out.println(newList.get(1));
		System.out.println(newList.set(0, 13));
		System.out.println(newList);
		System.out.println(newList.remove(1));
		
		newList.add(555);
		newList.add(999);
		newList.add(42);
		newList.add(146);
		System.out.println(newList);
		
		Collections.reverse(newList);
		System.out.println(newList);
//		System.out.println(newList.swap(0,2));
		
		// For Each Looping an array list
		for(Integer a : newList) {
			System.out.print(a + " ");	
		}
		
		System.out.println();
		
		Collections.sort(newList);
		
		// For Looping an array list
		for(int i = 0; i < newList.size(); i++) {
			System.out.print(newList.get(i) + " ");
		}
	}

}
