
import java.util.HashSet;

import java.util.Set;
public class Dictionary {
	
	private Set<String> dictionary = new HashSet(); 
	private StringBuilder output = new StringBuilder();
	private String inputstring="";
	private Set<String> insideWords= new HashSet();
	
	public Dictionary() {

	}
	
	public void combine() {         
		combine( 0 ); }
    private void combine(int start ){
        for( int i = start; i < inputstring.length(); ++i ){
            output.append( inputstring.charAt(i) );
            //.out.println( output +"--"+this.isEnglishWord(output.toString(),this.dictionary));
            if(this.isEnglishWord(output.toString(),this.dictionary)) {
            	//System.out.println( output);
            	this.insideWords.add(output.toString());
            }
            this.generatePermutation(output.toString(), 0, output.length());  

            if ( i < inputstring.length() )
            combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }
    
    public void sample(String str) {
        this.inputstring=str;
    	this.combine();
    	for (Object ob: this.insideWords)
            System.out.println(ob);

    }
    
    public  void generatePermutation(String str, int start, int end)  
    {  
        //Prints the permutations  
        if (start == end-1)  {
            //System.out.println(str);  
            if(this.isEnglishWord(str,this.dictionary)) {
            	//System.out.println( str);
            	this.insideWords.add(str.toString());
            }

        }
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                //Swapping the string by fixing a character  
                str = swapString(str,start,i);  
                //Recursively calling function generatePermutation() for rest of the characters   
                generatePermutation(str,start+1,end);  
                //Backtracking and swapping the characters again.  
                str = swapString(str,start,i);  
            }  
        }  
    }  
    public  String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  

	public void setDictionary(Set<String> dictionary) {
		this.dictionary = dictionary;
	}
	public  boolean isEnglishWord(String word, Set<String> dictionary)
	{
		if(dictionary.contains(word))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
