class Tilaisuus{
	private id;
	private String nimi;
	private String tyyppi;	
	private int[] paivamaara; //muotoa [d, m, y]
	private int[] aika; //muotoa [h, m, h, m]

	public Tilaisuus(String nimi, String tyyppi, int[] paivamaara, int[] aika, int id){
		this.id = id;
		this.nimi = nimi;
		this.tyyppi = tyyppi;
		this.paivamaara = paivamaara;
		this.aika = aika;
	}	
	public int getId(){
		return this.id;
	}
	public String getNimi(){
		return this.nimi;	
	}
	public String getTyyppi(){
		return this.tyyppi;
	}
	public String getPaivamaara(){
		return this.paivamaara;
	}
	public String getAika(){
		return this.aika;
	}

	//Varauksissa voi muokata tilaisuuden päivämäärää tai aikaa
	public void setPaivamaara(int[] paivamaara){
		if(paivamaara.length==3 && paivamaara[0]<=32 && paivamaara[1]<=12){
			this.paivamaara = Arrays.copyOf(paivamaara, paivamaara.length);
		}	
		else{
			throw new IllegalArgumentException("Päivämäärä ei vastaa oikeaa päivämäärää");
		}

	}
	public void setAika(int[] aika){
		if(aika.length==4 && aika[0]<=24 && aika[1]<=60 && aika[3]<=24 && aika[4]<=60){
			this.aika = Arrays.copyOf(aika, aika.length);
		}	
		else{	
			throw new IllegalArgumentException("Aika ei vastaa oikeaa aikaa");	
		}
	}
}

