public class RandomLetterChooser extends RandomStringChooser
{
	private String[] words;
	public RandomLetterChooser(String str)
	{ 
		words = new String[str.length()];
		for(int i = 0; i < str.length(); i++){
			words[i] = str.substring(i, i+1);
		}
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
