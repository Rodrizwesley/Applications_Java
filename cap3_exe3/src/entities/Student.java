package entities;

public class Student {

	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double media() {
		double media = note1 + note2 + note3;
		return media;
	}
	
	public double missing() {
		if (media() >= 60 ) {
			return 0;
		}
		else {
			return 60 - media();
		}
	}
}
