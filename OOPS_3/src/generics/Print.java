package generics;

public class Print {
	
	public static<T> void printArray(T a[]) {
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	// The below one is the case of "Bound generic" we have bounded or imposed condition the generic that it must implement( extend ) PrintInterface.
	// Here, to bound generic, we don't write implements we write extends. 
	
	public static<T extends PrintInterface> void printArray(T a[]) {
		
		for(int i=0; i<a.length; i++) {
			a[i].print();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer arr1[] = new Integer[10];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=i;
		}
		printArray(arr1);
		
		
		Character arr2[]= new Character[10];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=(char)('a'+i);
		}
		printArray(arr2);
		
		Vehicle v[]= new Vehicle[10];
		
		for(int i=0; i<v.length; i++) {
			v[i]= new Vehicle(10+i);
		}
		
		printArray(v);
	}

}
