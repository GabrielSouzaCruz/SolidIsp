package model;

public class StandardPrinter implements Printerable {
	
	public void printDocument(String content) {
		System.out.println("SP: Imprimindo documento: \n" + content);
	}
}
