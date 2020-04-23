package test;

import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class HugeFileReading {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

		File f = new File("C:/Users/suraj.kumar.awasthi/java/SOLD_HackerEarth/src/buyerModel/");// your
																								// folder
																								// path

		HashMap<String, StringBuilder> hash = new HashMap<String, StringBuilder>(1000000);
		// **Edit** It is array of Strings
		String[] fileList = f.list(); // It gives list of all files in the folder.

		for (String str : fileList) {
			if (str.endsWith(".java")) {

				// Read the content of file "str" and store it in some variable

				File file = new File("C:/Users/suraj.kumar.awasthi/java/SOLD_HackerEarth/src/buyerModel/" + str);
				MessageDigest md5Digest = MessageDigest.getInstance("MD5");
				String hashtext = CheckSum.getFileChecksum(md5Digest, file);

				if (hash.get(hashtext) != null) {
					StringBuilder sb = hash.get(hashtext);
					hash.put(hashtext, sb.append(", " + str));
				} else {
					hash.put(hashtext, new StringBuilder(str));
				}

			}
		}
		System.out.println(hash);
	}

}
