package com.Dylan.Genetics;

/**
 *
 * @author Dylan
 */
public class GeneralInfo {
    
    public static String generalInfo(String NA, String Type){
        String info = "";
        NA = NA.replace("\n", "").replace("\r\n", "").replace("\r", "").replace(" ", "").replace("\t", "");
        if(Type.equalsIgnoreCase("DNA")){
            info += getDNAGCATCount(NA)+"\n";
            info += "Length: " + NA.length()+"\n";
            int codons = NA.length()/3;
            info += "Number of Codons: " + codons +"\n";
        }
        if(Type.equalsIgnoreCase("RNA")){
            info += getRNAGCATCount(NA)+"\n";
            info += "Length: " + NA.length()+"\n";
            int codons = NA.length()/3;
            info += "Number of Codons: " + codons +"\n";
        }
        return info;
    }

    private static String getDNAGCATCount(String NA) {
        int z=0;
        int G = 0;
        int C = 0;
        int A = 0;
        int T = 0;
        
            
            while(z<NA.length()){
               if(NA.substring(z, z+1).equalsIgnoreCase("G")) {G++;}
               if (NA.substring(z, z+1).equalsIgnoreCase("C")) {C++;}
               if(NA.substring(z, z+1).equalsIgnoreCase("A")){A++;}
               if(NA.substring(z, z+1).equalsIgnoreCase("T")) {T++;}
               
               z++;
            }
            
            
        
        return "A- " + A + "\nG- " + G + "\nT- " + T + "\nC- " + C;
    }
    private static String getRNAGCATCount(String NA) {
        int z=0;
        int G = 0;
        int C = 0;
        int A = 0;
        int U = 0;
        
            
            while(z<NA.length()){
               if(NA.substring(z, z+1).equalsIgnoreCase("G")) {G++;}
               if (NA.substring(z, z+1).equalsIgnoreCase("C")) {C++;}
               if(NA.substring(z, z+1).equalsIgnoreCase("A")){A++;}
               if(NA.substring(z, z+1).equalsIgnoreCase("U")) {U++;}
               
               z++;
            }
            
            
        
        return "A- " + A + "\nG- " + G + "\nU- " + U + "\nC- " + C;
    }

   
    
}


