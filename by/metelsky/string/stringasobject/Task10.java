package by.metelsky.string.stringasobject;

/*10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, 
 * восклицательным или вопросительным знаком. Определить количество предложений в строке X.*/
public class Task10 {

	public static void main(String[] args) {
		String string = "First sentence. Second sentence! Third  sentence?Fourth sentence.";
		System.out.println(countSentences(string));

	}

	private static int countSentences(String string) {
		int counter = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '.' || string.charAt(i) == '?' || string.charAt(i) == '!') {
				counter++;
			}
		}
		return counter;
	}
}
