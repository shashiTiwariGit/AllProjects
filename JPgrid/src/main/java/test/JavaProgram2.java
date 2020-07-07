package test;

public class JavaProgram2 {
	static int temp = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hey , r u jhfglhgjh                     ghfkgk";
		while (s.contains("  ")) {

			s = s.replace("  ", " ");

		}

		String[] a = s.split(" ");
		System.out.println(a.length - 1);

		String t = "bsdlabfl2jbkjbb4578bhbbu6jbujbb788";
		char[] b = t.toCharArray();

		for (int i = 0; i < b.length; i++) {

			if (Character.isDigit(b[i])) {

				temp = temp + 1;
				if (i < b.length - 1) {
					while (Character.isDigit(b[i + 1]))
						i = i + 1;
				}

			}

		}
		System.out.println(temp);

	}

}
