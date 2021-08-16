package hackerrank.anagram;

public class Solution {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		int[] aFreq = new int[a.length()];
		int[] bFreq = new int[b.length()];
		int[] aFFreq = new int[a.length()];
		int[] bFFreq = new int[b.length()];

		// if length not equal, it is not analgram
		if (a.length() != b.length()) {
			return false;
		}
		// if length =1 then just compare and decide
		if (a.length() == 1 && a.length() == b.length()) {
			if (a.toLowerCase().equals(b.toLowerCase())) {

				return true;
			} else {
				return false;
			}
		}
		int count = 0;
		int bCount = 0;
		// create array
		char[] aArray = a.toLowerCase().toCharArray();
		char[] bArray = b.toLowerCase().toCharArray();
		char[] fArray = new char[a.length()];
		// count characters logic
		for (int i = 0; i < aArray.length; i++) {
			count += 1;
			bCount += 1;
			for (int j = i + 1; j < aArray.length; j++) {
				if (aArray[j] == aArray[i]) {
					count += 1;
					aArray[j] = '#';
				}
				if (bArray[j] == bArray[i]) {
					bCount += 1;
					bArray[j] = '#';
				}
			}
			aFreq[i] = count;
			bFreq[i] = bCount;
			count = 0;
			bCount = 0;
		}
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if (aArray[i] != '#') {
					if (aArray[i] == bArray[j]) {
						fArray[i] = aArray[i];
						aFFreq[i] = aFreq[i];
						bFFreq[i] = bFreq[j];
					}
				}
			}
		}

//		for (int i = 0; i < a.length(); i++) {
//			System.out.println(aArray[i] + " - " + bArray[i] + " : " + aFreq[i]
//					+ " : " + bFreq[i]);
//		}
//		for (int i = 0; i < a.length(); i++) {
//			System.out.println("Final array :" + fArray[i] + " : " + aFFreq[i]
//					+ " : " + bFFreq[i]);
//		}
		for (int i = 0; i < a.length(); i++) {
			if (fArray[i] != '#' && fArray[i] != 0) {
				if (aFFreq[i] == bFFreq[i]) {
					return true;
				} else
					return false;
			}
		}

		return false;
	}

	public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
		String a = "anagram";
		String b = "margana";
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		System.out.println("###################");
		a = "anagramm";
		b = "marganaa";
		ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		System.out.println("###################");
		a = "cat";
		b = "aCt";
		ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		System.out.println("###################");
		a = "aanananananananananannnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnaaaaa";
		b = "abcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcbcb";
		ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		System.out.println("###################");
		a = "A";
		b = "A";
		ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		System.out.println("###################");
		a = "AAA";
		b = "BBB";
		ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
