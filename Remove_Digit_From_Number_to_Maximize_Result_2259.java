package Daily_Questions;

public class Remove_Digit_From_Number_to_Maximize_Result_2259 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "1231";
		char digit = '1';
		System.out.println(removeDigit(number, digit));
	}

	public static String removeDigit(String number, char digit) {
		String ans = "";
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) == digit) {
				String s = number.substring(0, i) + number.substring(i + 1);
				if (s.compareTo(ans) > 0) {
					ans = s;
				}
			}
		}
		return ans;
	}

}
