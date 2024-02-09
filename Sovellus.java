class Sovellus{
	private ArrayList<Asiakas> kayttajat;
	private ArrayList<Esiintyja> esiintyjat;
	private ArrayList<Varaukset> varaukset;
	private Asiakas kayttaja;

	public Sovellus(){
		this.kayttajat = ArrayList<>();
		this.esiintyjat = ArrayList<>();
		this.varaukset = ArrayList<>();
		this.Asiakas = null;
	}
	
	public void lisaaEsiintyja()

	public void lisaaVaraus()

	public void lisaaKayttaja(String nimi, String salasana, String sahkoposti){}	
	//Etsii Asiakkaista saman nimen, tarkistaa salasanan ja asettaa this.kayttaja. Jos onnistuu palauttaa true, muuten false.
	public boolean kirjaudu(String nimi, String salasana){}	
	//asettaa this.kayttaja nulliin
	public void kirjauduUlos(){}
	//Palauttaa this.kayttaja tekemät varaukset
	public ArrayList<Varaus> getKayttajanVaraukset(){}

	public ArrayList<Esiintyja> getEsiintyjat(){}

	public void varaaEsiintyja(Tilaisuus tilaisuus, Esiintyja esiintyja){}
	// tarkistaa, että esiintyjää ei samanaikaisesti varattu muualle
	// suorittaa, tarkistaa maksun onnistuneisuuden ja luo Varaus-objektin 	
	// Jos ei onnistunut, heittää virheen.
	
}
