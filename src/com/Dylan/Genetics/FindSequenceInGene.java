import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FindSequenceInGene{
    
    static String Full;
    static String Trunk;
    static String places = "";
    public static void readFile() throws FileNotFoundException{
        
        Full = new Scanner(new File("Files/test.txt")).useDelimiter("\\Z").next();
        Trunk = new Scanner(new File("Files/test2.txt")).useDelimiter("\\Z").next();
        
        System.out.println("Full DNA Sequence: " + Full + "\n" + "Truncated: " + Trunk);
        
    }
    public static void scanString(){
        int x = 0;
        int len1 = Full.length();
        int len2 = Trunk.length();
        
        while(x<(len1-len2)){
            if(Full.substring(x, (x+len2)).equals(Trunk)){
                places = places + Integer.toString(x+1) + " ";
            }
            x++;
        }
        System.out.println(places);
    }
}
