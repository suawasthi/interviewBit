package test;

import java.util.ArrayList;
import java.util.List;

public class Zinzag {

	public static void main(String[] args) {
		String A = "PtuifnIYa5EGd7WPxnkcMCKZNDYxOFLVMpgIgym1TTlnjHWjYSo1eZE7c5eBrqDdYNUQ8Yk3wZVf0akh7CE0JnhIKkuBnp0Nzy23sJ62zP5PDcryZhFQuHG0jahDYoJ4U7CNfcxbcqh8WZEmdP22OLdqU5iNbwbRHXsUpWrobMCF648R8i47tn54yJe45OczEZZM8mF7IgO8N2rwoaLA6m6PhLD9Xa4bDveAT76ztXAvCuTqLt1dLKagjJF5zEFHm5smHH4AFR6ObdkV3g0VrOCjDrRZgmriR1CFxTO53HgqtGJFsPeTKtvwZvL1DM0dpUCD149SSYMx5v7vs4icIa3pitFVBIhLKdhwGD2mP4YSGMRQB9lW7YHYZPENg1932EDxQSRzJlACPytavFNEG46hxVIwIqjmmRabVCscnLu7XcdZAZiWzkiEhnlW04ZM0kwOlH2TLnnRIYHPKSaIiIri30oMgfeDPldb7nHIQCQ8qRomU8K20bElgcWs4xLGuFWRNe8D5PuHwxKiMG99WCLM9MLAG6Q3NEbjW139HnZKoVgA5uj6UiNrhZhCns6eOwQJRejYvI9pJF0qm8H8CQbuq2tVCu6WRXciAf9A6gkjnpVVHjP7QliuIqbA2tfzKBwulogKD5SLD5jBAxLsKvUlgn5MyK2s351v4BCFyTkHaiz1FcgpKLdP9Gl9DLKQItD3Sv2puMtekOzRD9UFaEUAAO9sFFm3ceBkrQjOm2RSlb2qZ6";
		char[] ch = A.toCharArray();

		int siz = 25;
		int[][] lst = new int[siz][A.length()];
		int lenious = (siz - 1) * 2;

		for (int i = 0; i < siz - 1; i++) {
			lst[i][0] = i;
		}

		// lst.get(2).add(2);

		int count = 0;
		for (int i = lenious; i < A.length()-1; i = i + lenious) {
			lst[0][i] = i;
			count++;
		}

		for (int i = 1; i < siz - 1; i++) {

			int resrt = 0;
			for (int j = 1; j < count; j++) {
				lst[i][resrt++] = lst[i - 1][j] - 1;
				lst[i][resrt++] = lst[i - 1][j] + 1;

			}
			count = resrt;

		}

		for (int i = siz - 1; i < A.length(); i = i + lenious) {

			lst[siz - 1][i] = i;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lst.length; i++) {
			for (int j = 0; j < lst[i].length; j++) {
				if (lst[i][j] < ch.length)
					sb.append(String.valueOf(ch[lst[i][j]]));
			}
		}
		System.out.println(sb);
	}

}
