package model;

public class Fax implements Faxable {

	public void faxDocument(String content) {
		System.out.println("FX: Enviando documento: \n" + content);
	}

}
