
public class Main {

	public static void main(String[] args) {
		
		
		DynamicArray dynamicArray = new DynamicArray();
		
		System.out.println("capacity: " + dynamicArray.capacity);
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");
		dynamicArray.add("F");
		dynamicArray.add("G");
		dynamicArray.add("H");
		
		
		System.out.println("array: " + dynamicArray);
		System.out.println("capacity: " + dynamicArray.capacity);
		
		
		dynamicArray.insert(2,"M");
		System.out.println("array: " + dynamicArray);
		
		
		dynamicArray.delete("A");
		dynamicArray.delete("B");
		dynamicArray.delete("D");
		dynamicArray.delete("E");
		dynamicArray.delete("F");
		dynamicArray.delete("G");
		System.out.println("array: " + dynamicArray);
		System.out.println("capacity: " + dynamicArray.capacity);
		
		
		System.out.println("search C: " + dynamicArray.search("C"));
		
		
		System.out.println("size: " + dynamicArray.size);
		System.out.println("empty: " + dynamicArray.isEmpty());


	}

}
