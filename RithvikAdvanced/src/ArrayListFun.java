import java.util.ArrayList;


public class ArrayListFun {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list.add(5);
		list.add(10);
		list.add(15);
		list2.add(20);
		list2.add(25);
		list.addAll(list2);
		System.out.println(list);
		System.out.println(list.size());

	}

}
