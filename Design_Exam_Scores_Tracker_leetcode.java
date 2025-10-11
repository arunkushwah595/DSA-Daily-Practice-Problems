package LEETCODE;

import java.util.HashMap;

public class Design_Exam_Scores_Tracker_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class ExamTracker {

		private HashMap<Integer, Integer> map;

		public ExamTracker() {
			map = new HashMap<>();
		}

		public void record(int time, int score) {
			map.put(time, score);
		}

		public long totalScore(int startTime, int endTime) {
			long score = 0l;
			for (int time : map.keySet()) {
				if (time >= startTime && time <= endTime) {
					score += map.get(time);
				}
			}
			return score;
		}
	}

	/**
	 * Your ExamTracker object will be instantiated and called as such: ExamTracker
	 * obj = new ExamTracker(); obj.record(time,score); long param_2 =
	 * obj.totalScore(startTime,endTime);
	 */

}
