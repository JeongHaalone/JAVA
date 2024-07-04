package ch14.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExam {

	public static void main(String[] args) {
		// In Set interface : HashSet, LinkedHashset, TreeSet is exist
		// Set is not duplication(중복) index object 구슬 주머니

		Set<String> setHashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		//method is same because set interface is already sharing variables
		setHashSet.add("Java");
		setHashSet.add("Oracle");
		setHashSet.add("JDBC");
		setHashSet.add("HTML");
		setHashSet.add("CSS");
		setHashSet.add("Javascript");
		setHashSet.add("JDBC");

		int size = setHashSet.size();
		System.out.println("set 객체 수 : " + size);
		int i = 0;
		System.out.println("-----------no index _ for print is unavailable-------------");
		Iterator<String> iterator = setHashSet.iterator(); // continue type -> set type
		while (iterator.hasNext()) { // if next object exist -> true // not exist -> false
			String element = iterator.next(); // element = taken value
			
			System.out.println(i++ + "object : " + element);
		}
		
		setHashSet.remove("CSS");
		
		System.out.println("----------index is not here. for each start-----------");
		for (String entity :setHashSet) {
			System.out.println( ++i + "객체" + entity);
		}
	}

}
