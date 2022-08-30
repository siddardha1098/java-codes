import java.util.regex.*;

class Sse {

	public static boolean isValidUsername(String name)
	{

		String regex = "^[A-Za-z]\\w{5,29}$";

		Pattern p = Pattern.compile(regex);

		if (name == null) {
			return false;
		}

		Matcher m = p.matcher(name);

		return m.matches();
	}

	public static void main(String[] args)
	{

		String str1 = "saveetha@11";
		System.out.println(isValidUsername(str1));

		String str3 = "saveetha11";
		System.out.println(isValidUsername(str3));

		String str5 = "saveetha_11";
		System.out.println(isValidUsername(str5));
	}
}
