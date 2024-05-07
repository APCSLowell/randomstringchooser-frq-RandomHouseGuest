public class RandomLetterChooser extends RandomStringChooser
{
	private String[] words;
	public RandomLetterChooser(String str)
	{ 
		super(setSingleLetters(str));
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
