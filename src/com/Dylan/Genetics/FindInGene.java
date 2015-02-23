package com.Dylan.Genetics;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Dylan
 */
public class FindInGene {
	public static void gogo(String cDNA, String Gene) throws IOException {
		cDNA = cDNA.replace("\n", "").replace("\r", "").replace("\r\n", "");
                Gene = Gene.replace("\n", "").replace("\r", "").replace("\r\n", "");
		String cDNACodons[];
		String GeneCodons[];
		cDNA = cDNA.replace(" ", "").replace("\t", "").toUpperCase();
		Gene = Gene.replace(" ", "").replace("\t", "").toUpperCase();
		cDNACodons = MakeCodons(cDNA);
		ArrayList pieces = SearchForcDNA(cDNACodons);
		FindcDNAinGene(pieces,Gene);
	}

	private static String[] MakeCodons(String input) {
		String[] Codons = new String[input.length()/3];

		for(int i = 0; i < input.length()-2;i+=3){
			Codons[i/3] = input.substring(i,i+3);
		}
		return Codons;
	}

	private static ArrayList SearchForcDNA(String codons[]) {
		
		String temp = "";
		ArrayList<String> pieces = new ArrayList<String>();
		for (int i = 0; i < codons.length-1; i++) {
			temp += codons[i];
			if (codons[i+1].equalsIgnoreCase("atg")){
				pieces.add(temp);
				temp = "";
			}
		}
		return pieces;
	}

	private static void FindcDNAinGene(ArrayList<String> pieces, String Gene) {
		String search = "";
		ArrayList<String> where = new ArrayList<String>();
		for (int i = 0; i < pieces.size(); i++) {
			for (int j = 0; j < pieces.get(i).length(); j++) {
				search = pieces.get(i).substring(0,pieces.get(i).length()-j);

				if (Gene.contains(search)){

					where.add(FindWhere(search, Gene));
					break;
				}

			}
		}

		createDoc(where,Gene);
	}

	private static void createDoc(ArrayList<String> where, String gene) {
		XWPFDocument document = new XWPFDocument();
		XWPFParagraph tmpParagraph = document.createParagraph();
		XWPFRun tmpRun;
		XWPFRun tmpRun2;
		int start=0;
		int stop =0;
		int nextGo = 0;
		String temp[]=new String[2];
		ArrayList<String> temp2 = new ArrayList<String>();
		where.add((gene.length())+"-"+(gene.length()));
		String beforeStart = "";
		String startw = "";
		for (int i = 0; i < where.size(); i++) {
			temp = where.get(i).split("-");
			start = Integer.parseInt(temp[0]);
			stop = Integer.parseInt(temp[1]);
			beforeStart = gene.substring(nextGo,start);
			startw = gene.substring(start,stop);
			temp2.add(beforeStart);
			temp2.add(startw);
			beforeStart = "";
			startw = "";
			nextGo = stop;
		}

		for (int i = 0; i < temp2.size(); i++) {
			if (i%2==0){
				tmpRun = tmpParagraph.createRun();
				tmpRun.setFontSize(18);
				tmpRun.setColor("FF0000");
				tmpRun.setText(temp2.get(i));
			}
			else{
				tmpRun2 = tmpParagraph.createRun();
				tmpRun2.setColor("0000FF");
				tmpRun2.setFontSize(18);
				tmpRun2.setText(temp2.get(i));
			}
		}




		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("Gene.doc"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			document.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String FindWhere(String search, String gene) {
		int place = 0;
		
		for (int i = 0; i < gene.length()-search.length(); i++) {

			if (search.equals(gene.substring(i,i+search.length()))){
				place = i;
				
				break;
			}
		}
		return place+"-"+(place+search.length());
	}
}
