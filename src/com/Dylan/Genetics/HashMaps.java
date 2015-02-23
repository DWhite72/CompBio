package com.Dylan.Genetics;

import java.util.HashMap;

/**
 * Created by Dylan on 2/11/2015.
 */
class HashMaps {
	private static String temp = "0.0";
	public static String HMAA(String key){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("UUU", "F");
		hm.put("UUC", "F");
		hm.put("UUA", "L");
		hm.put("UUG", "L");
		hm.put("CUU", "L");
		hm.put("CUC", "L");
		hm.put("CUA", "L");
		hm.put("CUG", "L");
		hm.put("AUU", "I");
		hm.put("AUC", "I");
		hm.put("AUA", "I");
		hm.put("AUG", "M");
		hm.put("GUU", "V");
		hm.put("GUC", "V");
		hm.put("GUA", "V");
		hm.put("GUG", "V");
		hm.put("UCU", "S");
		hm.put("UCC", "S");
		hm.put("UCA", "S");
		hm.put("UCG", "S");
		hm.put("AGU", "S");
		hm.put("AGC", "S");
		hm.put("CCU", "P");
		hm.put("CCC", "P");
		hm.put("CCA", "P");
		hm.put("CCG", "P");
		hm.put("ACU", "T");
		hm.put("ACC", "T");
		hm.put("ACA", "T");
		hm.put("ACG", "T");
		hm.put("GCU", "A");
		hm.put("GCC", "A");
		hm.put("GCA", "A");
		hm.put("GCG", "A");
		hm.put("UAU", "Y");
		hm.put("UAC", "Y");
		hm.put("UAA", "X");
		hm.put("UAG", "X");
		hm.put("UGA", "X");
		hm.put("GGG", "G");
		hm.put("CAU", "H");
		hm.put("CAC", "H");
		hm.put("CAA", "Q");
		hm.put("CAG", "Q");
		hm.put("AAU", "N");
		hm.put("AAC", "N");
		hm.put("AAA", "K");
		hm.put("AAG", "K");
		hm.put("GAU", "D");
		hm.put("GAC", "D");
		hm.put("GAA", "E");
		hm.put("GAG", "E");
		hm.put("UGU", "C");
		hm.put("UGC", "C");
		hm.put("UGG", "W");
		hm.put("CGU", "R");
		hm.put("CGC", "R");
		hm.put("CGA", "R");
		hm.put("CGG", "R");
		hm.put("AGA", "R");
		hm.put("AGG", "R");
		hm.put("GGU", "G");
		hm.put("GGA", "G");
		hm.put("GGC", "G");
		if(!hm.containsKey(key)){
			temp ="No Key";}
		else {
			temp = hm.get(key);
		}
		return temp;
	}

	public static String HMAAW(String key) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("F", "147.06841");
		hm.put("L", "113.08406");
		hm.put("I", "113.08406");
		hm.put("M", "131.04049");
		hm.put("V", "99.06841");
		hm.put("S", "87.03203");
		hm.put("P", "97.05276");
		hm.put("T", "101.04768");
		hm.put("A", "71.03711");
		hm.put("Y", "163.06333");
		hm.put("X", "0.0");
		hm.put("G", "57.02146");
		hm.put("H", "137.05891");
		hm.put("Q", "128.05858");
		hm.put("N", "114.04293");
		hm.put("K", "128.09496");
		hm.put("D", "115.02694");
		hm.put("E", "129.04259");
		hm.put("C", "103.00919");
		hm.put("W", "186.07931");
		hm.put("R", "156.10111");
		if(!hm.containsKey(key)){
			temp = "0.0";System.out.println("No Key @ HMAAW. Key = " + key);}
		else{
			temp = hm.get(key);
		}
		return temp;
	}
	public static String AltWeight(String key){
		String altWeight;
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A","89.000  ");
		hm.put("R","174.000 ");
		hm.put("N","132.000 ");
		hm.put("D","133.000 ");
		hm.put("C","121.000 ");
		hm.put("Q","146.000 ");
		hm.put("E","147.000 ");
		hm.put("G","75.000  ");
		hm.put("H","155.000 ");
		hm.put("I","131.000 ");
		hm.put("L","131.000 ");
		hm.put("K","146.000 ");
		hm.put("M","149.000 ");
		hm.put("F","165.000 ");
		hm.put("P","115.000 ");
		hm.put("S","105.000 ");
		hm.put("T","119.000 ");
		hm.put("W","204.000 ");
		hm.put("Y","181.000 ");
		hm.put("V","117.000 ");
		if(!hm.containsKey(key)){
			altWeight = "0.0";System.out.println("No Key @ HMAAW. Key = " + key);}
		else{
			altWeight = hm.get(key);
		}


		return altWeight;
	}
}
