
public class ExcelSheet {
	public static void main(String[] args) {

		int num = 0;
		StringBuilder sb = new StringBuilder();
		while (num > 0) {
			int chr = num % 26;
			if (chr != 0) {
				char c = (char) (chr-1 + 'A');
				sb.append(c);
				num = num/26;
			//	System.out.println(sb.toString());
			}
			if (chr == 0) {
				sb.append('Z');
				num=num/26 -1;
			//	System.out.println(sb.toString());
			}
		}
		
		System.out.println(sb.reverse());
	}

}
