
public class SnakeKopf {
	
	Directions ausrichtung;
	
	SnakeKopf() {
		this.ausrichtung = Directions.OBEN;
	}
	
	public String gibAusrichtungAus() {
		
		switch (ausrichtung) {
			case LINKS: System.out.println("Links!");
			case RECHTS: System.out.println("Rechts!");
		}
		return "";
	}
}
