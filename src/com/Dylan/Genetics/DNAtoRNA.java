package com.Dylan.Genetics;

/**
 *
 * @author Dylan
 */
public class DNAtoRNA {
    public static String DTR(String DNA){
       String RNA = "";
       DNA = DNA.replace("\n", "").replace("\r\n", "").replace("\r", "").replace(" ", "").replace("\t", "");
        for(int i = 0; i < DNA.length();i++){
            if(DNA.substring(i,i+1).equalsIgnoreCase("t")){
                RNA += "U";
            }
            else{
                RNA +=DNA.substring(i, i+1);
            }
        }
        return RNA.toUpperCase();
    }
    public static String RTD(String RNA){
       String DNA = "";
       RNA = RNA.replace("\n", "").replace("\r\n", "").replace("\r", "").replace(" ", "").replace("\t", "");
        for(int i = 0; i < RNA.length();i++){
            if(RNA.substring(i,i+1).equalsIgnoreCase("U")){
                DNA += "T";
            }
            else{
                DNA += RNA.substring(i, i+1);
            }
        }
        return DNA.toUpperCase();
    }
}

