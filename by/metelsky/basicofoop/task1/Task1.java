package by.metelsky.basicofoop.task1;

import java.util.List;

/*Задача 1.
*Создать объект класса Текстовый файл, используя классы Файл, Директория.
*Методы: создать, переименовать, вывести на консоль содержимое, 
*дополнить, удалить.*/
public class Task1 {

	public static void main(String[] args) {
		
		Directory testDirectory = new Directory("TestDirectory");
		testDirectory.AddFile(new TextFile("First","1111111"));
		testDirectory.AddFile(new TextFile("Second","2222222"));
		testDirectory.AddFile(new TextFile("Third","333333"));
		testDirectory.AddFile(new TextFile("Fourth","444444"));
		testDirectory.AddFile(new TextFile("Fifth","555555"));
		View view = new View();
		view.printDirectories(testDirectory);
		view.printFilesFromDirectory(testDirectory);
		List<File> files=testDirectory.getFiles();
		TextFile textFile = (TextFile) files.get(0);
		textFile.addContent(" 000000");
		view.printFilesFromDirectory(testDirectory);
		
		
	}

}
