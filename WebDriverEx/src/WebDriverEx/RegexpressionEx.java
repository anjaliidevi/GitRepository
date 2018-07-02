package WebDriverEx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpressionEx {
	/*
	 *alphabets:[a-z],[A-Z],[a-aA-z]
	 *numeric:[0-9]
	 *alphanumeric:[a-zA-z0-9]
	 */
	public static boolean RegEx(String pattern,String Content)
	{
		//Create a Pattern object
		Pattern r=Pattern.compile(pattern);
		//Now Create matcher object
		Matcher m=r.matcher(Content);
		if(m.matches())
		{
			return true;
			
		}
		else
		{
			return false;
		}
		
		}

	}

	


