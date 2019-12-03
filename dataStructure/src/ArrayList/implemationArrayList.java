package ArrayList;

public class implemationArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.add(1,15);
		numbers.addFirst(5);
		System.out.println(numbers);
		System.out.println(numbers.remove(3));
		System.out.println(numbers.indexOf(30));
	}

}
