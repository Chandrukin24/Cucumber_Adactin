package org.King;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Map_Methods {
	public static void main(String[] args) {
		Map<Integer, Integer> s = new TreeMap<>();
		System.out.println(s);
		s.put(2, 5);
		s.put(3, 6);
		s.put(2, null);
		s.put(4, 15);
		s.put(5, 77);
		s.put(1, 85);
		System.out.println(s);
		int r = s.size();
		System.out.println(r);
		Integer obj =  s.get(6);
		System.out.println(obj);
		Set<Integer> kc = s.keySet();
		System.out.println(kc);
		Collection<Integer> n = s.values();
		System.out.println(n);
		boolean kc1 = s.containsKey(85);
		System.out.println(kc1);
		boolean kc2 = s.containsKey(85);
		System.out.println(kc2);
		
		Set<java.util.Map.Entry<Integer,Integer>> sup = s.entrySet();
		System.out.println(sup);
		for (java.util.Map.Entry<Integer, Integer> chandru : sup) {
			System.out.println(chandru);
	}}}