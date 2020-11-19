package by.metelsky.classes.agregationcomposition.task1;

import java.util.List;

public class View {
	public void printText(List<Sentence> text) {
		for(Sentence sentence : text) {
			for(Word word : sentence.getSentence()) {
				System.out.print(word.getWord());
			}
		}
	}

}
