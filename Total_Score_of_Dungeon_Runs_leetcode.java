package LEETCODE;

public class Total_Score_of_Dungeon_Runs_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public long totalScore(int hp, int[] damage, int[] requirement) {
		long ans = 0;
		for (int i = 0; i < requirement.length; i++) {
			int chp = hp;
			int sum = 0;
			for (int j = i; j < requirement.length; j++) {
				chp -= damage[j];
				if (chp >= requirement[j]) {
					sum++;
				} else if (chp < 0) {
					break;
				}
			}
			ans += sum;
		}
		return ans;
	}

}
