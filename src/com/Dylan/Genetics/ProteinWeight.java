package com.Dylan.Genetics;

/**
 * Created by Dylan on 2/11/2015.
 */
class ProteinWeight {

	public static String getProteinWeight(String x){
		double weight = 0;
		double altWeight = 0;
		x = x.replace("\n", "").replace("\r\n", "").replace("\r", "").replace(" ", "");
		int i = 0, len = x.length();

		while(i<len){
			weight += Double.parseDouble(HashMaps.HMAAW(x.substring(i,i+1)));
			altWeight += Double.parseDouble(HashMaps.AltWeight(x.substring(i,i+1)));
			i++;
		}

		return "Between " + weight + "Da and " + altWeight + "Da";
	}
}
