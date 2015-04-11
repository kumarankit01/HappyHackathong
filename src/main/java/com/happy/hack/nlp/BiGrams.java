/**
 * 
 */
package com.happy.hack.nlp;

import com.happy.hack.hibernate.dao.LuxuryHotelDAOImpl;
import com.happy.hack.hibernate.entity.LuxuryHotel;


/**
 * @author saurabhshashank
 * <p>A Simple consecutive words bi-gram alogrithm</p>
 *
 */
public class BiGrams {
	public void biGramsConnection() {}

	public static void biGramEngine(LuxuryHotel hotel) throws Exception {
		// the line are sep by ||
				
		String content=StopWordRemoval.getStopWordRemoval(hotel.getContent());
		StringBuffer biGrams = new StringBuffer();
		String[] lines = content.split("\\|\\|");
		for (String line : lines) {
			String[] words = line.trim().split(" ");
			for (int i = 0; i < words.length; i++) {
				if (i == words.length - 1) {
					continue;
				}
				biGrams.append(words[i] + "-" + words[i + 1] + " ");
//				Persist the data in the tables
				System.out.println(biGrams);
				biGrams=new StringBuffer();
			}
		}

		
	}
	public static void main(String[] args) throws Exception {
		LuxuryHotelDAOImpl DAO=new LuxuryHotelDAOImpl();
		DAO.getAllData();
		for (LuxuryHotel lh : DAO.getAllData()) {
			biGramEngine(lh);
		}
	}
}
