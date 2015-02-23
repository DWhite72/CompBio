package com.Dylan.Genetics;


import org.apache.commons.lang3.ArrayUtils;

public class CompRevComp {
    
	
	
    
    public static String[] TextToArray(String DNA) { 
        int x = 0;
        int len = DNA.length();
	String[] DNAA = new String[len];
        
        while(x<len){
            DNAA[x] = DNA.substring(x, x+1);
            x++;
        }
        return DNAA;
    }
    public static String[] ReverseDNAA(String[] DNAA){
        ArrayUtils.reverse(DNAA);
        return DNAA;
    }
    public static String complementReverse(String DNA){
        int x = 0, z = 0;
        DNA = DNA.replace("\n", "").replace("\r", "").replace(" ", "").replace("\r\n", "").replace("\t", "");
        String[] DNAAR = ReverseDNAA(TextToArray(DNA));
        int len = DNAAR.length;
	    String[] DNAARC = new String[len];
        while(x<len){
            if(DNAAR[x].equalsIgnoreCase("T")){
	            DNAARC[x]="A";}
            else if(DNAAR[x].equalsIgnoreCase("A")){
	            DNAARC[x]="T";}
            else if(DNAAR[x].equalsIgnoreCase("G")){
	            DNAARC[x]="C";}
            else if(DNAAR[x].equalsIgnoreCase("C")){
	            DNAARC[x]="G";}
            else if(DNAAR[x].equalsIgnoreCase("U")){
                DNAARC[x] = "A";
            }
            else { DNAARC[x]="?";}
            x++;
        }
        String DNARC = "";
        while(z<len){
            DNARC += DNAARC[z];
            z++;
        }
        return DNARC.toUpperCase();
    }
    public static String complementary(String DNA){
        int x = 0, z = 0;
        DNA = DNA.replace("\n", "").replace("\r", "").replace(" ", "").replace("\r\n", "").replace("\t", "");
        String[] DNAA = TextToArray(DNA);
        int len = DNAA.length;
	    String[] DNAAC = new String[len];
        while(x<len){
            if(DNAA[x].equalsIgnoreCase("T")){
	            DNAAC[x]="A";}
            else if(DNAA[x].equalsIgnoreCase("A")){
	            DNAAC[x]="T";}
            else if(DNAA[x].equalsIgnoreCase("G")){
	            DNAAC[x]="C";}
            else if(DNAA[x].equalsIgnoreCase("C")){
	            DNAAC[x]="G";}
            else if(DNAA[x].equalsIgnoreCase("U")){
                DNAAC[x] = "A";
            }
            else { DNAAC[x]="?";}
            x++;
        }
        String DNAC = "";
        while(z<len){
            DNAC += DNAAC[z];
            z++;
        }
        
       return DNAC.toUpperCase();
    }

}
