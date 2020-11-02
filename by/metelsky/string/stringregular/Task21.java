package by.metelsky.string.stringregular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * Напишите анализатор, позволяющий последовательно возвращать 
 * содержимое узлов xml-документа и его тип (открывающий тег, закрывающий тег, 
 * содержимое тега, тег без тела). Пользоваться готовыми парсерами 
 * XML для решения данной задачи нельзя.
 */
public class Task21 {

	public static void main(String[] args) {
		String text ="<notes>\r\n" + 
				"<note id = \"1\">\r\n" + 
				"<to>Вася</to>\r\n" + 
				"<from>Света</from>\r\n" + 
				"<heading>Напоминание</heading>\r\n" + 
				"<body>Позвони мне завтра!</body>\r\n" + 
				"</note>\r\n" + 
				"<note id = \"2\">\r\n" + 
				"<to>Петя</to>\r\n" + 
				"<from>Маша</from>\r\n" + 
				"<heading>Важное напоминание</heading>\r\n" + 
				"<body/>\r\n" + 
				"</note>\r\n" + 
				"</notes>";
		String text2 ="<notes><note id = \"1\"><to>Вася</to><from>Света</from><heading>Напоминание</heading><body>Позвони мне завтра!</body></note><note id = \"2\"><to>Петя</to><from>Маша</from><heading>Важное напоминание</heading><body/></note></notes>";
		String patternFindTeg="<([A-Za-z][A-Za-z0-9]*).*?>.*?</\\1>";
//		System.out.println(counter(text,patternFindTeg));
		counter(text2,patternFindTeg);

	}
	public static int counter(String text, String pattern) {
		int counter = 0;

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
	
		printGroup(m);
	
		
//for(int i=-1; i<text.length();) {
//	
//		while (m.find(i+1)) {
//			i = m.start();
//			int end = m.end();
//			System.out.println("Start = " + i + " end= " + end);
//			counter++;
//			System.out.println("Find"+counter+"! "+ m.group());
//		}
//		
//}

		return counter;
	}
	
	
	public static void printGroup(Matcher m) {
		while(m.find()) {
			System.out.println(m.group());
			
		}
	
		
	}

}
