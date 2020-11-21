package by.metelsky.string.stringregular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*2. Дана строка, содержащая следующий текст (xml-документ):
 * Напишите анализатор, позволяющий последовательно возвращать содержимое 
 * узлов xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
 *  Пользоваться готовыми парсерами XML для решения данной задачи нельзя.*/
public class Task2 {

	public static void main(String[] args) {
		String text = "<notes>" + "<note id = \"1\">\r\n" + "<to>Вася</to>\r\n" + "<from>Света</from>\r\n"
				+ "<heading>Напоминание</heading>\r\n" + "<body>Позвони мне завтра!</body>\r\n" + "</note>\r\n"
				+ "<note id = \"2\">\r\n" + "<to>Петя</to>\r\n" + "<from>Маша</from>\r\n"
				+ "<heading>Важное напоминание</heading>\r\n" + "<body/>\r\n" + "</note>\r\n" + "</notes>";

		parseXML(text);

	}

	private static void parseXML(String text) {
		String[] lines = text.split("\n");
		for (int i = 0; i < lines.length; i++) {
			findTag(lines[i]);
		}
	}

	private static void findTag(String line) {
		Pattern startTag = Pattern.compile("<([^/].*?)>");
		Pattern endTag = Pattern.compile("<(/.*?)>");
		Pattern bodyTag = Pattern.compile(">(.+?)<");
		Matcher matcherStart = startTag.matcher(line);
		Matcher matcherEnd = endTag.matcher(line);
		Matcher matcherBody = bodyTag.matcher(line);
		while (line.length() > 1) {
			if (matcherStart.find()) {
				System.out.println(matcherStart.group() + " - open tag");
				System.out.println(matcherStart.group(1) + " - open tag content");
			} else if (matcherBody.find()) {
				System.out.println(matcherBody.group(1) + " - body content");
			} else if (matcherEnd.find()) {
				System.out.println(matcherEnd.group() + " - close tag");
				System.out.println(matcherEnd.group(1) + " - close tag content");
			} else {
				line = "";
			}

		}

	}

}
