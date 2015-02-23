package com.Dylan.Genetics;

/**
 *
 * @author Dylan
 */
public class Codons {
    
    public static String[] FindCondons(String NA){
        NA = NA.replace("\n", "").replace("\r\n", "").replace("\r", "").replace(" ", "").replace("\t", "");
        
        String[] condons = new String [NA.length()/3];
        int x = 0;
        for(int i = 0; i < NA.length()/3; i++){
            condons[x] = NA.substring(3*i, (3*i)+3);
            x++;
        }
        
        
        return condons;
    }

}
