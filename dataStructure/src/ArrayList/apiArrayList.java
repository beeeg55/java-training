package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class apiArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);
		
		numbers.add(1,50);
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println(numbers);
		
		numbers.get(2);
		System.out.println(numbers);
		
		System.out.println(numbers.size());
		
		Iterator integer = numbers.iterator();
		
		while(integer.hasNext()){
			int value = (int)integer.next();
			if(value == 30){
				integer.remove();
			}
			System.out.println(value);
		}
		System.out.println(numbers);
		
		
		for(int value : numbers){
			System.out.println(value);
		}
		
		for(int i=0; i<numbers.size();i++){
			System.out.println(numbers.get(i));
		}
		
	}

}
