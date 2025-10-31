package view;

import model.Fax;
import model.Faxable;
import model.IODevice;
import model.MultiFunctionalPrinter;
import model.Printerable;
import model.StandardPrinter;

public class Main {
	
	public static void main(String[] args) {
		String content = "Conteúdo para operação de I/O";
		IODevice device = new MultiFunctionalPrinter();
		Printerable print = new StandardPrinter();
		Faxable fax = new Fax();
		
		fax(fax, content);
		print(print,content);
		scann(device,content);
		xerox(device,content);
	}
	
	private static void fax(Faxable device, String content) {
		device.faxDocument(content);
	}
	
	private static void print(Printerable device, String content) {
		device.printDocument(content);
	}
	
	private static void scann(IODevice device, String content) {
		device.scanDocument(content);
	}
	
	private static void xerox(IODevice device, String content) {
		device.xeroxDocument(content);
	}
}
