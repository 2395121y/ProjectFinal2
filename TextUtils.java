/**
 * @author Shawn Yeng Wei Xen (2395121Y)
 * This class helps in replacing or removing certain characters in a line when being read
 * from a tweet.
 */
public class TextUtils {

	/**
	 * This function imports a String, usually a token, and processes it, removing or replacing some characters.
	 * @param text Usually the token from a tweet.
	 * @return A processed token from the text.
	 */
	public static String normaliseString(String text) {
		boolean ignore = false;
		String normaltext = text.toLowerCase();
		if (normaltext.contains("http")) ignore = true;
		if (normaltext.startsWith("@")) normaltext="*MENTIONS*";
		if (normaltext.startsWith("$")) normaltext="*CASH*";
		if ( (normaltext.startsWith("am")) || (normaltext.startsWith("pm")))
			normaltext="*TIME*";
		
		if (!ignore)
		{
		normaltext = normaltext.replace(".", " ");
		normaltext = normaltext.replace("/", " ");
		normaltext = normaltext.replace(":", " ");
		}
		normaltext = normaltext.replace("\\n", " ");
		normaltext = normaltext.replace("(", "");
		normaltext = normaltext.replace(")", "");
		normaltext = normaltext.replace("u201d", "");
		normaltext = normaltext.replace("\"", "'");
		normaltext = normaltext.replace("$", "DollarSymbol");
		normaltext = normaltext.replace("[", "");
		normaltext = normaltext.replace("]", "");
		normaltext = normaltext.replace(")", "");
		normaltext = normaltext.replace("(", "");
		normaltext = normaltext.replace("\\", "");
		normaltext = normaltext.replace("'", "");
		normaltext = normaltext.replace("...", "");
		normaltext = normaltext.replace("#", "");
		normaltext = normaltext.replace(";", "");
		normaltext = normaltext.replace(",", "");
		normaltext = normaltext.replace("?", " ");
		normaltext = normaltext.replace("!", " ");		
		normaltext = normaltext.replace("  ", " ");
	
		normaltext = normaltext.trim();
		return normaltext;
	}
	
	/**
	 * Similar to the first function, this one is performed on those that aren't related to URLs.
	 * @param text Usually the token from a tweet.
	 * @return A processed token from the text.
	 */
	public static String normaliseStringIgnore(String text) {
		String normaltext = text.toLowerCase();
		normaltext = normaltext.replace(".", " ");
		normaltext = normaltext.replace("/", " ");
		normaltext = normaltext.replace(":", " ");
		normaltext = normaltext.replace("-", " ");
		normaltext = normaltext.trim();
		return normaltext;
	}
	
}