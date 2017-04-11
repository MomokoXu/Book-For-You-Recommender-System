/**
 * This code is for testing
 */
package com.momokoxu.myou.test_snippets;

import com.momokoxu.myou.recommender.*;

public class MasterRunner {
	public static void main(String[] args) {
		String folder = "data/";
		GenericRecommenderMaster master = new GenericRecommenderMaster(folder);
		master.run();
	}
}