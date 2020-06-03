package com.geekwise.cors.filter;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	private static final int[][] array = new int[][] { { 259, 770 }, { 448, 54 }, { 926, 667 }, { 184, 139 },
			{ 840, 118 }, { 577, 469 } };

	public static void main(String[] args) {
		new Solution().twoCitySchedCost(array);
	}

	public int twoCitySchedCost(int[][] costs) {
		Comparator<int[]> comparator = (a, b) -> Math.abs(b[0] - b[1]) - Math.abs(a[0] - a[1]);
		Arrays.sort(costs, comparator);
		int N = costs.length / 2, c1 = 0, // counter for the station A
				c2 = 0, // counter for the station B
				ans = 0, i = 0;
		while (i < 2 * N) {
			if ((costs[i][0] <= costs[i][1] && c1 < N) || c2 == N) {
				ans += costs[i++][0];
				c1++;
			} else {
				ans += costs[i++][1];
				c2++;
			}
		}
		return ans;
	}
}