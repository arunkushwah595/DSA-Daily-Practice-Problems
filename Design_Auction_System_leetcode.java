package LEETCODE;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Design_Auction_System_leetcode {

	class AuctionSystem {

		class Pair {
			int amt;
			int usr;

			public Pair(int amt, int usr) {
				this.amt = amt;
				this.usr = usr;
			}
		}

		private HashMap<Integer, HashMap<Integer, Integer>> map;
		private HashMap<Integer, PriorityQueue<Pair>> mp;

		public AuctionSystem() {
			map = new HashMap<Integer, HashMap<Integer, Integer>>();
			mp = new HashMap<Integer, PriorityQueue<Pair>>();
		}

		public void addBid(int userId, int itemId, int bidAmount) {
			if (!map.containsKey(itemId)) {
				map.put(itemId, new HashMap<>());
			}
			if (!mp.containsKey(itemId)) {
				mp.put(itemId, new PriorityQueue<>((a, b) -> (a.amt != b.amt) ? b.amt - a.amt : b.usr - a.usr));
			}
			map.get(itemId).put(userId, bidAmount);
			mp.get(itemId).offer(new Pair(bidAmount, userId));
		}

		public void updateBid(int userId, int itemId, int newAmount) {
			map.get(itemId).put(userId, newAmount);
			mp.get(itemId).offer(new Pair(newAmount, userId));
		}

		public void removeBid(int userId, int itemId) {
			map.get(itemId).remove(userId);
		}

		public int getHighestBidder(int itemId) {
			if (!map.containsKey(itemId)) {
				return -1;
			}
			PriorityQueue<Pair> pq = mp.get(itemId);
			HashMap<Integer, Integer> cur = map.get(itemId);
			while (!pq.isEmpty()) {
				Pair p = pq.peek();
				if (!cur.containsKey(p.usr) || cur.get(p.usr) != p.amt) {
					pq.poll();
				} else {
					return p.usr;
				}
			}
			return -1;
		}
	}

}
