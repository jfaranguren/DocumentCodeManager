package model;

public class Document {

	private String name;
	private int year;
	private int[][] qr;
	private String code;

	public Document(String name, int year) {
		super();
		this.name = name;
		this.year = year;
		qr = null;
		code = null;

	}

	public String printQR() {
		String print = "";

		if(qr != null){

		for (int i = 0; i < qr.length; i++) {
			for (int j = 0; j < qr[0].length; j++) {
				print += qr[i][j] + " ";
			}
			print += "\n";
		}
		return print;
	}else{
		return "QR not generated yet\n";
	}
	}

	@Override
	public String toString() {
		return "\nName: " + name + "\nYear: " + year + "\nQR:\n" + printQR() + "Code: "
				+ code;
	}

}
