package HackerEearth;

public class Sample {
	public static void main(String[] args) {
		Long l = 5L; // 101
		char[] ch = Long.toBinaryString(5).toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '0') {
				ch[i] = '1';
			} else {
				ch[i] = '0';
			}
		}
		
		
		System.out.println(Long.parseLong(String.valueOf(ch), 2));
		

	}

}
