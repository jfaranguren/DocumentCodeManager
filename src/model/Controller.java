package model;

import java.util.ArrayList;

public class Controller {

	ArrayList<Document> documentList;

	public Controller() {
		this.documentList = new ArrayList<Document>();
	}

	public boolean registerDocument(String name, int year) {

		return documentList.add(new Document(name, year));

	}

	public String showDocuments() {
		String out = "";
		int n = 1;

		for (Document document : documentList) {
			
			out += "\n"+n+".\n"+document.toString();
			n++;
		}



		return out;
	}

}
