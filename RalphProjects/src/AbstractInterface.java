import java.util.ArrayList;

public class AbstractInterface {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*10));
		}
		
		System.out.println(list.toString());
		average(list);
		
	} public static void average(ArrayList<Integer> list) {
		int avg = 0; 
		for (int i = 0; i < list.size(); i++) {
			avg = avg + list.get(i);
		}
		avg = avg/list.size();
		System.out.println(avg);
	}
}
