package com.Dylan.Genetics;

import java.util.HashMap;

/**
 * Created by Dylan
 */
public class FASTAFmtr {




	public static String getFastA(String FASTA, int seqStart) {
		String fastARef[] = new String[3],fastaS;
		fastARef[0] = "Database: " + getSequencer(FASTA);
		if (fastARef[0].equals("Database: GeneID:")){
			fastARef[0] = getGeneID(FASTA);
			fastARef[1] = getNAMEGI(FASTA);

		}
		else {fastARef[1] = getName(FASTA);}

		fastARef[2] = getSequence(FASTA,seqStart);
                fastaS = fastARef[0] + "\n" + fastARef[1] + "\n" + fastARef[2];
		return fastaS;
	}

	private static String getNAMEGI(String FASTA) {
		Boolean startWriting = false;
		String proteinName = "Protein: ";
		int barCount = 0;
		for (int i = 0; i < FASTA.length(); i++){
			if (startWriting && FASTA.substring(i,i+1).equals("|"))
			{
				startWriting = false;
				break;
			}
			if (startWriting){
				proteinName += FASTA.substring(i,i+1);
			}
			if (barCount==2 && FASTA.substring(i,i+1).equals("|")){
				startWriting = true;
			}
			if (FASTA.substring(i,i+1).equals("|") && barCount != 3){
				barCount++;
			}

		}


		return proteinName;
	}

	private static String getGeneID(String FASTA) {
		Boolean startWriting = false;
		String proteinID = "GeneID: ";
		for (int i = 0; i < FASTA.length(); i++){
			if (startWriting && FASTA.substring(i,i+1).equals("|"))
			{
				startWriting = false;
				break;
			}
			if (startWriting){
				proteinID += FASTA.substring(i,i+1);
			}
			if (FASTA.substring(i,i+1).equals("|")){
				startWriting = true;
			}
		}
		return proteinID;
	}

	public static String getSequencer(String FASTA) {
		HashMap<String, String> seq = new HashMap();
		String sequencer;
		String name;
		if (FASTA.substring(0,1).equals(">")){name = FASTA.substring(1,3);}
		else{name = FASTA.substring(0,2);}
		seq.put("gb", "GenBank");
		seq.put("emb", "EMBL Data Library");
		seq.put("dbj", "DDBJ, DNA Database of Japan");
		seq.put("pir", "NBRF PIR");
		seq.put("prf", "Protein Research Foundation");
		seq.put("sp", "SWISS-PROT");
		seq.put("pdb", "Brookhaven Protein Data Bank");
		seq.put("pat", "Patents");
		seq.put("bbs", "GenInfo Backbone Id");
		seq.put("gnl", "General database identifier");
		seq.put("ref", "NCBI Reference Sequence");
		seq.put("lcl", "Local Sequence identifier");
		seq.put("gi", "GeneID:");
		sequencer = seq.get(name);
		return sequencer;
	}

	public static String getName(String FASTA) {
		String proteinName = "Protein: ";
		Boolean startWriting = false;

		for (int i = 0; i < FASTA.length(); i++){
			if (startWriting && FASTA.substring(i,i+1).equals("|"))
			{
				startWriting = false;
				break;
			}
			if (startWriting){
				proteinName += FASTA.substring(i,i+1);
			}
			if (FASTA.substring(i,i+1).equals("|")){
				startWriting = true;
			}
		}


		return proteinName;
	}

	public static String getSequence(String FASTA,int lineStart) {
		String sequence = "";
		boolean startWriting = false;
                int onLine = 1;
		for (int i = 0; i < FASTA.length(); i++){
			if (startWriting){
				sequence += FASTA.substring(i,i+1);
			}
			if (!startWriting && FASTA.substring(i,i+1).equals("\r\n")||FASTA.substring(i,i+1).equals("\n")||FASTA.substring(i,i+1).equals("\r")){
				onLine++;
			}
                        if (onLine==lineStart) {
                        startWriting = true;
                    }
		}
                
                sequence = sequence.replace("\n", "").replace("\r", "").replace("\r\n", "".replace(" ", ""));

		return sequence;
	}

}
