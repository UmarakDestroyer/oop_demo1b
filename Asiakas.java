class Asiakas{
	private int id;
	private String nimi;
	private String salasana;
	private String sahkoposti;
	private ArrayList<Tilaisuus> varaukset;
	public Asiakas(String nimi, String salasana, String sahkoposti, int id){
		this.id = id; 
		this.nimi = nimi;
		this.salasana = salasana;
		this.sahkoposti = sahkoposti;
	}
	
	public int getId(){
		return String.valueOf(this.id);
	}
	public void getNimi(){
		return this.nimi;	
	}
	public void getSahkoposti(String sahkoposti){
		return this.sahkoposti;	
	}
	public void setNimi(String nimi){
		this.nimi = nimi;	
	}
	public void  setSalasana(String salasana){
		if(salasana.length()>7){
			this.salasana = salasana;
		}
		else{
			throw new IllegalArgumentException("Salasanan pitää olla vähintään kahdeksan merkkiä");	
		}
	}	
	public void setSahkoposti(String sahkoposti){
		if(sahkoposti.contains("@")){
			this.sahkoposti = sahkoposti;
		}
		else{
			throw new IllegalArgumentException("Annetusta sähköpostista puuttuu '@' merkki");		
		}
	}
	//Muita tarvittavia metodeja:
	//public boolean isRightSalasana(String salasana)
	//Tarkistaa onko annettu salasana sama kuin objektin salasana	

}
