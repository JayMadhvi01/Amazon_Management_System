package AmazonSystem;

public class AmazonUtil {
	private static final int NUMCOLS = 10;

	public static float convertStrToFloat(String str) {
		try {
			return Float.parseFloat(str.replace(",", ""));
		} catch (NumberFormatException e) {
			return 0.0f;
		}
	}

	public static boolean isValidFloat(String string) {
		if(string.isBlank() || string.isEmpty() || string == null)
			return false;
		try {
			float StrFloat = Float.parseFloat(string);
			if(StrFloat > 0) {
				return true;
			}
			else{
				return false;
			}
		}catch(NumberFormatException e) {
		}
		System.out.println("The Value must be a Positive float");
		return false;
	}

	public static boolean isValidInt(String string) {
		if(string.isBlank() || string.isEmpty() || string == null)
			return false;
		try {
			int StrInt = Integer.parseInt(string);
			if(StrInt > 0) {
				return true;
			}
			else{
				return false;
			}
		}catch(NumberFormatException e) {
		}
		System.out.println("The Value must be a Positive Integer");
		return false;
	}

	public static boolean isValidString(String string) {
		try{
			if(string.isBlank() || string.isEmpty() || string == null) {
				return false;
			}
			else {
				return true;
			}}catch(NumberFormatException e) {
			}
		System.out.println("The Value must be a Positive Integer");
		return false;
	}

	public static String [] lineReader(String string) {

		String[] str = new String[NUMCOLS];
		int index = 0;
		final char chComma = ',';
		final char chQuotes = '"';
		int start = 0;
		int end = string.indexOf(chComma);
		String value;
		while (start<end) {
			if (string.charAt(start)==chQuotes) {
				start++;
				end = string.indexOf(chQuotes, start+1); 
			}
			value = string.substring(start, end);
			value = value.trim();
			str[index++] = value;
			if (string.charAt(end)==chQuotes)
				start = end+2;
			else
				start = end+1;
			end = string.indexOf(chComma, start+1);
		}
		if (start < string.length()) {
			value = string.substring(start);
			str[index++] = value; 
		}
		return str;
	}



}

