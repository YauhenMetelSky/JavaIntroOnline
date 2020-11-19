package by.metelsky.classes.agregationcomposition.task1;
/*
 * 1. Создать объект класса Текст, используя классы Предложение, Cлово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Task1 {

	public static void main(String[] args) {
		Word word1 = new Word("Создать ");
		Word word2 = new Word("объект ");
		Word word3 = new Word("класса ");
		Word word4 = new Word("Текст, ");
		Word word5 = new Word("используя ");
		Word word6 = new Word("классы ");
		Word word7 = new Word("Предложение, ");
		Word word8 = new Word("Слово. ");
		Word word9 = new Word("Методы: ");
		Word word10 = new Word("дополнить ");
		Word word11 = new Word("текст, ");
		Word word12 = new Word("вывести ");
		Word word13 = new Word("на ");
		Word word14 = new Word("консоль ");
		Word word15 = new Word("текст, ");
		Word word16 = new Word("заголовок ");
		Word word17 = new Word("текста.");
		
		Sentence sentence1 = new Sentence();
		sentence1.addWord(word1);
		sentence1.addWord(word2);
		sentence1.addWord(word3);
		sentence1.addWord(word4);
		sentence1.addWord(word5);
		sentence1.addWord(word6);
		sentence1.addWord(word7);
		sentence1.addWord(word8);
		Sentence sentence2 = new Sentence();
		sentence2.addWord(word9);
		sentence2.addWord(word10);
		sentence2.addWord(word11);
		sentence2.addWord(word12);
		sentence2.addWord(word13);
		Sentence sentence3 = new Sentence();
		sentence3.addWord(word14);
		sentence3.addWord(word15);
		sentence3.addWord(word16);
		sentence3.addWord(word17);
		Text text = new Text(sentence1,"Task1");
		text.addSentence(sentence2);
		text.addSentence(sentence3);
		View view = new View();
		System.out.println(text.getHeader());
		view.printText(text.getText());
		
		

	}

}
