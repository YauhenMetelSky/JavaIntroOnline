package by.metelsky.basicofoop.task1;

public class View {
	
	public void printContent(TextFile file) {
		System.out.println(file.getContent());
	}
	public void printDirectories(Directory directory) {
		System.out.println(directory.getName());
		for(Directory dir : directory.getDirectories()) {
			System.out.println(dir.getName());
			printFilesFromDirectory(dir);
		}
		
	}
public void printFilesFromDirectory(Directory directory) {
		for(File file : directory.getFiles()) {
			System.out.println(file);
		}
	}

}
