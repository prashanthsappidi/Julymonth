package july1st;

public class Reverse_Words_In_Sentence {

	public static void main(String[] args) {
		
		String s = "Prashanth is a QA automation engineer or SDET";
		
		String[] words = s.split("\\s+");

		String result = "";
		
		for(int i=words.length-1;i>=0;i--)
		{
			result=result+words[i]+" ";
		}
		
        System.out.println(result.trim());

	}

}
