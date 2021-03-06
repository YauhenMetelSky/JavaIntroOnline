package by.metelsky.string.stringregular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять 
 * с текстом три различных операции: отсортировать абзацы по количеству предложений; 
 * в каждом предложении отсортировать слова по длине; 
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
 *  а в случае равенства – по алфавиту.
 */

public class Task1 {
	// Написать выбор действия свитч кейс

	public static void main(String[] args) {
		String text;
		String patternParagraf = "\\r\\n";
		String patternSentence = "\\s*[\\.|!|\\?|]\\s*";
		String patternWord = "\\s*[\\s;:,]\\s*";

		text = "First Mr and  Mrs  Dursley,  of  number  four,  Privet  Drive,  were  proud  to  say  that  they "
				+ " were  perfectly  normal,  thank  you  very  much.  They  were  the  last  people  you’d "
				+ " expect  to  be  involved  in  anything  strange  or  mysterious,  because  they  just  didn’t"
				+ "  hold  with  such  nonsense.\r\n"
				+ "    Second  Mr Dursley was the director of a firm called Grunnings, which made  drills."
				+ "  He  was  a  big,  beefy  man  with  hardly  any  neck,  although  he  did  have  a  very  large "
				+ " moustache.  Mrs  Dursley  was  thin  and  blonde  and  had  nearly  twice  the  usual  amount "
				+ " of  neck,  which came in very useful as she spent so much of her time craning over garden fences,"
				+ " spying on the neighbours. The Dursleys had a small  son  called  Dudley  and  in  their  opinion "
				+ " there  was  no  finer  boy anywhere.And another one. And one. And one again.\r\n"
				+ "    Third The  Dursleys  had  everything  they  wanted,  but  they  "
				+ "also  had  a  secret, and their greatest fear was that somebody would discover it. They didn’t think"
				+ " they could bear it if anyone found out about the  Potters.  Mrs  Potter  was  Mrs  Dursley’s  sister, "
				+ " but  they  hadn’t  met  for  several  years;  in  fact,  Mrs  Dursley  pretended  she  didn’t "
				+ " have a sister, because her sister and her good-for-nothing husband were  as  unDursleyish  as  "
				+ "it  was  possible  to  be.  The  Dursleys  shuddered  to  think  what  the  neighbours  would "
				+ " say  if  the  Potters  arrived  in  the  street.  The  Dursleys  knew  that  the  Potters  had "
				+ " a  small  son,  too,  but  they  had  never  even  seen  him.  This  boy  was  another  good "
				+ " reason  for  keeping  the  Potters  away;  they  didn’t"
				+ "  want Dudley mixing with a child like that. ";

		String[] words = text.split(patternWord);

		String[] sentences = text.split(patternSentence);

		String[] paragrafs = text.split(patternParagraf);

		int select;
		String symbol;

		while (true) {
			System.out.println("Введите 1 если хотите отсрортировать абзацы по количеству предложений(По возрастанию)");
			System.out.println("Введите 2 если хотите отсрортировать абзацы по количеству предложений(По убыванию)");
			System.out
					.println("Введите 3 если хотите в каждом предложении отсортировать слова по длине(По возрастанию)");
			System.out.println("Введите 4 если хотите в каждом предложении отсортировать слова по длине(По убыванию)");
			System.out.println(
					"Введите 5 если хотите отсортировать лексемы в предложении по убыванию количества вхождений заданного символа");

			Scanner sc = new Scanner(System.in);

			if (sc.hasNextInt()) {
				select = sc.nextInt();
				switch (select) {
				case 1:
					sortParagraf(paragrafs, 1, patternSentence);
					printArray(paragrafs);
					break;
				case 2:
					sortParagraf(paragrafs, 0, patternSentence);
					printArray(paragrafs);
					break;
				case 3:
					sortWord(sentences, 1, patternWord);
					printArray(sentences);
					break;
				case 4:
					sortWord(sentences, 0, patternWord);
					printArray(sentences);
					break;
				case 5:
					System.out.println("Введите искомый символ");
					Scanner sym = new Scanner(System.in);

					symbol = sym.next();
					sortBySymbol(words, symbol);
					printArray(words);

					break;
				default:
					break;
				}
			}
			break;
		}

	}

	public static int counter(String text, String pattern) {
		int counter = 0;

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		while (m.find()) {
			counter++;
		}

		return counter;
	}

	// howToSort: 0 - Descending sort, 1-Ascending sort
	public static void sortParagraf(String[] array, int howToSort, String pattern) {
		boolean needIteration = true;
		switch (howToSort) {
		case 0:
			while (needIteration) {
				needIteration = false;
				for (int i = 1; i < array.length; i++) {
					if (counter(array[i], pattern) > counter(array[i - 1], pattern)) {
						swap(i, i - 1, array);
						needIteration = true;
					}
				}

			}
			break;
		case 1:
			while (needIteration) {
				needIteration = false;
				for (int i = 1; i < array.length; i++) {
					if (counter(array[i], pattern) < counter(array[i - 1], pattern)) {
						swap(i, i - 1, array);
						needIteration = true;
					}
				}

			}
			break;
		}

	}

	public static void sortWord(String[] array, int howToSort, String pattern) {
		boolean needIteration;
		for (int j = 0; j < array.length; j++) {
			needIteration = true;
			String[] words = array[j].split(pattern);
			switch (howToSort) {
			case 0:
				while (needIteration) {
					needIteration = false;
					for (int i = 1; i < words.length; i++) {
						if (words[i].length() > words[i - 1].length()) {
							swap(i, i - 1, words);
							needIteration = true;
						}
					}

				}
				break;
			case 1:
				while (needIteration) {
					needIteration = false;
					for (int i = 1; i < words.length; i++) {
						if (words[i].length() < words[i - 1].length()) {
							swap(i, i - 1, words);
							needIteration = true;
						}
					}

				}
				break;
			}
			String str = "";
			for (int x = 0; x < words.length; x++) {
				str = str + words[x] + " ";
			}
			array[j] = str;
		}
	}

	public static void sortBySymbol(String[] array, String symbol) {
		boolean needIteration = true;

		while (needIteration) {
			needIteration = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (counter(array[i], symbol) < counter(array[i + 1], symbol)) {
					swap(i, i + 1, array);
					needIteration = true;
				}
				if (counter(array[i], symbol) == counter(array[i + 1], symbol)) {

					for (int index = 0; index < minWord(array[i], array[i + 1]).length() - 1;) {
						if (Character.toLowerCase(array[i].charAt(index)) == Character
								.toLowerCase(array[i + 1].charAt(index))) {
							index++;

						}

						if (Character.toLowerCase(array[i].charAt(index)) > Character
								.toLowerCase(array[i + 1].charAt(index))) {
							swap(i, i + 1, array);
							needIteration = true;
							break;
						}
						if (Character.toLowerCase(array[i].charAt(index)) < Character
								.toLowerCase(array[i + 1].charAt(index))) {
							break;
						}

					}

				}
			}
		}

	}

	public static String minWord(String one, String two) {
		if (one.length() < two.length()) {
			return one;
		} else {
			return two;
		}
	}

	public static void swap(int indexOne, int indexTwo, String[] arr) {
		String tmp;
		tmp = arr[indexOne];
		arr[indexOne] = arr[indexTwo];
		arr[indexTwo] = tmp;

	}

	public static void printArray(String[] array) {
		for (String element : array) {
			System.out.println("<" + element + ">");
		}
	}

}
