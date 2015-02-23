
class PointMutations {
	private static int good = 0;
	private static int bad = 0;
    public static String pointMut(String DNA1, String DNA2){
        int i = 0;
	    String mutations="";
	    while(i< DNA2.length()){
            if(DNA2.substring(i,i+1).equals(DNA2.substring(i, i + 1))){good++;}
            else{bad++; mutations += i +" ";}
            i++;
        }
        return bad + " mutations found at: " + mutations;
    }
}
