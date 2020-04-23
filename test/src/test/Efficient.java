package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Efficient {
	static Set<String> wordList;
	static List<String> six_word_letters;
	static Set<String> less_then_six_dictionary;

	public static void main(String[] args) throws IOException {
		// get the file

		Date lStartTime = new Date();

		populateDictionaryData();
		for (String words : six_word_letters) {
			for (int start = 0; start < words.length(); start++) {
				String prefix = words.substring(0, start);
				if (less_then_six_dictionary.contains(prefix)) {
					String suffix = words.substring(start + 1);
					if (less_then_six_dictionary.contains(suffix)) {
						System.out.println(prefix + " + " + suffix + " => " + words);
					}
				}

			}
		}
		Date lEndTime = new Date();
		double lTimeInms = lEndTime.getTime() - lStartTime.getTime();

		System.out.println(Double.valueOf(lTimeInms / 1000 % 60) + " seconds");

	}

	

	private static Set<String> populateDictionaryData() throws IOException {
		Set<String> wordList = new HashSet<String>();
		six_word_letters = new ArrayList<String>();
		less_then_six_dictionary = new HashSet<String>();

		FileInputStream file = new FileInputStream("C:\\Users\\suraj.kumar.awasthi\\Downloads\\wordlist (1).txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(file));

		String line = reader.readLine();
		while (line != null) {
			line = reader.readLine();
			if (line != null &&  line.length() > 0 && line.length() <=6) {
				if (line.length() == 6) 
					six_word_letters.add(line.trim());
				less_then_six_dictionary.add(line.trim());
			}
		}
		return wordList;
		}

}
