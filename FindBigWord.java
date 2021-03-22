


import java.io.*;
import java.util.StringTokenizer;

public class FindBigWord {
	
	 
	public FindBigWord() {
		
	}
	//Used inbuilt reverse function of the StringBuilder class
    public String doStringRev(String revInput){
        return new StringBuilder(revInput).reverse().toString();
    }
    //Custom function to reverse a string
    public String doCustomRev(String revInput) {

        char[] revStr = new char[revInput.length()];
        int j = 0;
        // iterating the bigWord from last index to first
        for(int i = revInput.length(); i > 0; i--) {
            //storing the last char to new char Array as first char
            revStr[j] = revInput.charAt(i-1);
            j++;
        }
        return new String(revStr);
    }

    public String doFindBigWord(String inputFile) {
    	String bigWord = "";
        try{                                                                            
            
            FileInputStream fin = new FileInputStream(inputFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(fin));
            

            String line = br.readLine();
            while(line != null ){

                if (!line.isEmpty()) {
                    StringTokenizer tokens = new StringTokenizer(line);

                    while (tokens.hasMoreTokens()) {
                        String currWord = tokens.nextToken();
                        if (bigWord.length() < currWord.length()) {
                            bigWord = currWord;
                        } else {
                            bigWord = bigWord;
                        }
                    }
                }
                line = br.readLine();
            }
            System.out.println("Largest Word  :  " + bigWord);
            System.out.println("Transposed Largest Word using reverse fn. :  " + doStringRev(bigWord));
            System.out.println("Transposed Largest Word using custom fn. :  " + doCustomRev(bigWord));

            
        }
        catch(FileNotFoundException fEx) {
            fEx.printStackTrace();
        }
        catch(IOException ioex){
            ioex.printStackTrace();
        }
		/*
		 * catch(Exception ex){ ex.printStackTrace(); }
		 */
        return bigWord;
    }

    public static void main(String args[]) {

        FindBigWord findobj = new FindBigWord();
        findobj.doFindBigWord("inputFile.txt");

    }

}