package com.Dylan.Genetics;

import java.util.Arrays;

/**
 *
 * @author Dylan
 */
public class StartStopFinder {
    
    public static String StartFinder(String[] codons){
        String starts = "";
        
        for(int i = 0; i < codons.length; i++){
            if(codons[i].equalsIgnoreCase("AUG")||codons[i].equalsIgnoreCase("ATG")){
                starts += "Start at: " +(((i+1)*3)-2) +"-" +((i+1)*3) +" Codon #: " +(i+1)+"\n";
            }
        }
        return starts;
    }
    public static String StopFinder(String[] codons){
        String stops = "";
        
        for(int i = 0; i < codons.length; i++){
            if(codons[i].equalsIgnoreCase("UAA")||codons[i].equalsIgnoreCase("TAA")){
                stops += "Stop at: " + ((i+1)*3) +" Codon #: " +(i+1)+"\n";
            }
            else if(codons[i].equalsIgnoreCase("UAG")||codons[i].equalsIgnoreCase("TAG")){
                stops += "Stop at: " + ((i+1)*3) +" Codon #: " +(i+1)+"\n";
            }
            else if(codons[i].equalsIgnoreCase("UGA")||codons[i].equalsIgnoreCase("TGA")){
                stops += "Stop at: " + ((i+1)*3) +" Codon #: " +(i+1)+"\n";
            }
        }
        return stops;
    }
    public static String StartAndStopFinder(String[] codons){
        String both = "";
        
        for(int i = 0; i < codons.length; i++){
            if(codons[i].equalsIgnoreCase("AUG")||codons[i].equalsIgnoreCase("ATG")){
                both += "Start at: " + ((i+1)*3) +" Codon #: " +(i+1)+"\n";
            }
            else if(codons[i].equalsIgnoreCase("UAA")||codons[i].equalsIgnoreCase("TAA")){
                both += "Stop at: " + ((i+1)*3) +" Codon #: " +(i+1)+"\n";
            }
            else if(codons[i].equalsIgnoreCase("UAG")||codons[i].equalsIgnoreCase("TAG")){
                both += "Stop at: " + ((i+1)*3) +" Codon #: " +(i+1)+"\n";
            }
            else if(codons[i].equalsIgnoreCase("UGA")||codons[i].equalsIgnoreCase("TGA")){
                both += "Stop at: " + ((i+1)*3) +" Codon #: " +(i+1)+"\n";
            }
            
        }
        return both;
    }
    
}
