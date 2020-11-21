package by.metelsky.basicofoop.task1;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	private String name;
	private List<Directory> directories;
	private List<File> files;

	public Directory() {
		directories = new ArrayList<>();
		files = new ArrayList<>();
	}

	public Directory(String name) {
		directories = new ArrayList<>();
		files = new ArrayList<>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Directory> getDirectories() {
		return directories;
	}

	public void setDirectories(List<Directory> directories) {
		this.directories = directories;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}
	public boolean AddFile(File file) {
		return files.add(file);
	}
	public boolean removeFile(File file) {
		return files.remove(file);
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + ", directories=" + directories + ", files=" + files + "]";
	}
	

}
