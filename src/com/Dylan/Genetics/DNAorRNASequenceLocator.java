package com.Dylan.Genetics;


public class DNAorRNASequenceLocator {

    public static String scanString(String Full, String Trunk){
        int x = 0;
        Full = Full.replace("\n", "").replace("\r\n", "").replace("\r", "").replace(" ", "").replace("\t", "");
        Trunk = Trunk.replace("\n", "").replace("\r\n", "").replace("\r", "").replace(" ", "").replace("\t", "");
        int len1 = Full.length();
        int len2 = Trunk.length();
	    String places = "";
        while(x<((len1-len2)+1)){
            if(Full.substring(x, (x+len2)).equals(Trunk)){
                places += "Found at: " + (x+1) + "\n";
            }
            x++;
        }
        return  places;
    }
}
