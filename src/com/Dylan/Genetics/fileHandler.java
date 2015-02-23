package com.Dylan.Genetics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Dylan
 */
public class fileHandler {

	public static String readFile(String path) throws FileNotFoundException, IOException {
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String line, fileContents="";
            while((line = br.readLine()) !=null){
                fileContents += line + "\n";
            }
            return fileContents;
	}
}
