package ch14.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExam {

	public static void main(String[] args) {
		// list 컬렉션은 Arraylist, vector, Linkedlist 3가지를 주로 use.
		// list collection : many using (길이가 자유롭니다.)
		// list<String> is strong type check, only String can insert.
		// List<String> list = new Arraylist<String>(); -> 10 is basic 
		
		List<String> listS = new LinkedList<String> ();
		
		listS.add("Java"); // 0 index
		listS.add("Oracle"); //1 index (database)
		listS.add("JDBC"); // 2 index (java + db relation)
		listS.add("HTML, CSS, Javascript"); // (frontend)
		listS.add("JSP"); // java +db + frontend
		listS.add("tomcat"); // server programming(servlet)
		listS.add("linux"); // sharing server
		listS.add(5, "servlet"); //jsp + java
		listS.add("AWS"); // virutal sharing server
		//김지선님은 프론트를 하다 오셨다.
		
		int size = listS.size();
		System.out.println("총 객체수 : " + size);
		System.out.println("--------------------");
		String skill = listS.get(2); // 2 index take and skill insertion
		System.out.println("2번째 인덱스 값 : " + skill); //JDBC
		
		listS.remove(2) ;
		listS.remove(2) ;
		listS.remove("jsp");
		
		System.out.println("---------for function all print----------");
		for ( int i = 0; i < listS.size(); i++) {
			System.out.println(i + "번째 값 : " + listS.get(i));
		}
		
		System.out.println("---------for each all print(no index using)-----------");
		for (String str : listS) {// array listS -> print all max str variables
			System.out.println(str);
		}
		
	}//main

}//clas
