package by.metelsky.classes.agregationcomposition.task1;

import java.util.LinkedList;
import java.util.List;

public class Text {
	List<Sentence> text = new LinkedList<Sentence>();
	private String header;

	public Text() {
	}
	public Text(Sentence sentence, String header) {
		this.text.add(sentence);
		this.header = header;
	}

	public Text(List<Sentence> text, String header) {
		super();
		this.text = text;
		this.header = header;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	public boolean addSentence(Sentence sentence) {
		return text.add(sentence);
	}

	public boolean removeSentence(Sentence sentence) {
		return text.remove(sentence);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		Text other = (Text) obj;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	

}
