package compare_the_triplets;

import java.util.ArrayList;

public class solution01 {
	
	public static ArrayList<Integer> compareTriplets(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> myList = new ArrayList<>();
		
		int k = 0;
		int l = 0;
		
		for(int j=0; j<a.size(); j++) {
			if(a.get(j) > b.get(j)) {
				k++;			
			}else if(a.get(j) < b.get(j)) {
				l++;
			}else {
				continue;
			}
		}		
		myList.add(k);
		myList.add(l);
				
		return myList;
	}

	public static void main(String[] args) {

		ArrayList <Integer> a = new ArrayList<>();
		a.add(17);
		a.add(28);
		a.add(30);
		
		for(int i=0; i<a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
		
		ArrayList <Integer> b = new ArrayList<>();
		b.add(99);
		b.add(16);
		b.add(8);
		
		System.out.println();
		System.out.println(compareTriplets(a, b));

	}

}
