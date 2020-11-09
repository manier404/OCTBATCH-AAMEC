package citi.session;

import java.util.ArrayList;
import java.util.List;

public class ManiBoss {

	public static void main(String[] args) {

		
		// ClassName obj name = new Classname();
		List<Integer> li = new ArrayList();
		
		//1. add
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		System.out.println(li);
		
		//2.size
		int i = li.size();
		System.out.println(i);
		
		//3.replace 
		li.set(2, 100);
		System.out.println(li);
		
		//4.add
		li.add(0, 50);
		System.out.println(li);
		
		//5.remove
		li.remove(3);
		System.out.println(li);
		
		//6.indexof
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		//7.last indexof
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		//8.addall
		List<Integer> l1 = new ArrayList();
		l1.add(77);
		boolean addAll = l1.addAll(li);
		System.out.println(addAll);
		System.out.println(l1);
		
		//9.removeall
		l1.removeAll(li);
		System.out.println(l1);
		
		
		//10.retain all
		l1.retainAll(li);
		System.out.println(li);
		
	
		
	
	}

}
