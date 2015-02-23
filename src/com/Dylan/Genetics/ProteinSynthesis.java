package com.Dylan.Genetics;



public class ProteinSynthesis {
	public static String RNASyn(String[] codons)  {
		int i = 0;
		
		String[] AA = new String[((codons.length))];
		while (i < (codons.length)) {
			AA[i] = "" + HashMaps.HMAA(codons[i]);
			i++;
                }
                String aminos="";
                for(String x: AA){
                    aminos+=x;
                }
                
                return aminos;
        }
}