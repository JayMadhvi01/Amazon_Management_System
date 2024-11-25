package AmazonSystem;

public class AmazonUtil {
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

	public static String[] lineReader(String string, int convertFieldIndex) {
		String[] str = new String[10];
		int index = 0;
		final char chComma = ',';
		final char chQuotes = '"';
		int start = 0;
		int end = string.indexOf(chComma);
		String value;
		while (end != -1) {
			if (string.charAt(start) == chQuotes) {
				start++;
				end = string.indexOf(chQuotes, start);
			}
			value = string.substring(start, end).trim();
			if (index == convertFieldIndex) {
				value = String.valueOf((value));
			}
			str[index++] = value;
			if (end + 1 < string.length() && string.charAt(end + 1) == chComma) {
				start = end + 2;
			} else {
				start = end + 1;
			}
			end = string.indexOf(chComma, start);
		}
		if (start < string.length()) {
			value = string.substring(start).trim();
			if (index == convertFieldIndex) {
				value = String.valueOf((value));
			}
			str[index++] = value;
		}
		return str;
	}

}

