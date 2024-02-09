class Varaus{
	private int id;
	private Tilaisuus tilaisuus;
	private Asiakas varaaja;
	private Esiintyja esiintyja;

	public Varaus(int id, Tilaisuus tilaisuus, Asiakas varaaja, Esiintyja esiintyja){
		this.id = id;
		this.tilaisuus = tilaisuus;
		this.varaaja = varaaja;
		this.esiintyja = esiintyja;
	}
	public int getId(){
		return this.id;	
	}	
	public Tilaisuus getTilaisuus(){
		return this.tilaisuus;	
	}
	public Asiakas getVaraaja(){
		return this.varaaja;
	}
	public Esiintyja getEsiintyja(){
		return this.esiintyja;	
	}
	//mahdollisesti lisäksi Tilaisuuden muuttaminen ja to_string metodi 
}
