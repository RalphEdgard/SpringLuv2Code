import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
public class ArrayListSum {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(); 
		Collection<Integer> list2 = new ArrayList<Integer>();  
		Collection<Integer> list3 = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			double num = Math.random()*10; 
			list1.add((int)num);
			list2.add((int)num);
			list3.add((int)num);
			// System.out.println(i + " " + list2.get(i));
		}
		
		Collection<Integer> collection = (ArrayList<Integer>)list1.clone();
		Collection<Integer> collect1 = new ArrayList<Integer>();
		ArrayList<Integer> collect2 = (ArrayList<Integer>)collect1; 
		
		collection.add(1);
		collection.add(1);
		
		collection.forEach(e -> System.out.println(e));
		//System.out.println("");
		//System.out.println(sum(list1)); 
		//System.out.println(list1.toString());
		
		//removeDuplicates(list2);
		
		//System.out.println(list2.toString());
		
		//uniteLists(list2, list3);
		
		//System.out.println(list2.toString());
		
		GenericStack<Integer> test = new GenericStack<Integer>();
		test.push(2);
		
		System.out.println(test.toString());
	
	} public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E greater = list.get(0);
		int limit = list.size()-1;
		E tempNum = null; 
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i);
			for (int j = 0; j < list.size(); j++) {
				if (i != limit && j != limit) {
					int temp = greater.compareTo(list.get(i+1));
					if (temp > 0) {
						greater = list.get(i+1);
						tempNum = list.get(i);
						list.add(i, greater);
						list.add((i+1), tempNum);
						System.out.println(tempNum + "<" + greater);
					} else if (temp < 0) {
						System.out.println(list.get(i) + " < " + list.get(i+1));
					} else {
						System.out.println(list.get(i) + "=" + list.get(i+1));
					}
				}  else {
					break;
				}	
			}
		}

		for (int i = 0; i < list.size(); i++ ) {
			//System.out.println(i + " " + list.get(i));
		}
		
	} public static double sum(ArrayList<Double> list) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		double addNumbers = 0; 
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a number: ");
			double userIn = scan.nextDouble(); 
			list.add(userIn);
			
			addNumbers = addNumbers + list.get(i);
		}
		
		
		return addNumbers;
	}
	
	public static void removeDuplicates(ArrayList<Integer> list) {
		int numIncrease = 0; 
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (i == numIncrease && list.get(i) == list.get(j)) {
					if (j == numIncrease) {
						continue;
					} else {
						if (list.get(i) == list.get(j)) {
							list.remove(i);
						}	
					}
				} else {
					numIncrease = numIncrease + 1; 
					if (list.get(i) == list.get(j)) {
						list.remove(i);
						System.out.println(list.get(i) + " " + list.get(j));	
					}
				}
			}
			numIncrease = 0; 
			System.out.println();
		}
	} public static void uniteLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		java.util.Scanner scan = new java.util.Scanner(System.in); 
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter five digits for list 1, " + i + ": ");
			int userInput = scan.nextInt(); 
			list1.add(userInput); 
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter five digits for list 2, " + i + ": ");
			int userInput = scan.nextInt(); 
			list2.add(userInput); 
		}
		
		for (int i = 0; i < list2.size(); i++) {
			list1.add(list2.get(i));
		}
	}
	
}

class GenericStack<E> {
	
	java.util.ArrayList<E> list = new java.util.ArrayList<E>(); 
	Object[] listAsArray = list.toArray();
	
	GenericStack() {}
	
	public int getSize() {
		return listAsArray.length;
	}
	
	public E peek() {
		return (E)listAsArray[listAsArray.length];
	}
	
	public E pop() {
		E o = list.get(getSize());
		list.remove(getSize());
		return o; 
	}
	
	public void push(E o) {
		list.add(o);
	}
	
	public boolean isEmpty() {
		return list.isEmpty() ? true : false; 
	}
	
	@Override 
	public String toString() {
		String result = "";
		for (int i = 0; i < listAsArray.length; i++)
			result = result + listAsArray[i] + ", ";
		return "[" + result + "]";
	}
}
