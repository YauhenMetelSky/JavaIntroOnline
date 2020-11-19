package by.metelsky.classes.agregationcomposition.task1;

import java.util.LinkedList;
import java.util.List;

public class Sentence {
	private List<Word> sentence = new LinkedList<Word>();

	public Sentence() {

	}

	public Sentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}
	
	public boolean addWord(Word word) {
		return sentence.add(word);
	}
	public boolean removeWord(Word word) {
		return sentence.remove(word);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}
	
	

}
