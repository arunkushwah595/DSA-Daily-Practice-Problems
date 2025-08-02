package Daily_Questions;

public class Alternating_Groups_I_3206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] colors = { 0, 1, 0, 0, 1 };
		System.out.println(numberOfAlternatingGroups(colors));
	}

	public static int numberOfAlternatingGroups(int[] colors) {
		int c = 0;
		for (int i = 0; i < colors.length; i++) {
			if (colors[i] == colors[(i + 2) % colors.length] && colors[i] != colors[(i + 1) % colors.length]) {
				c++;
			}
		}
		return c;
	}

}
