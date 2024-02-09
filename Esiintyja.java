class Esiintyja{
	private int id;
	private String nimi;
	private double provisio;
	private String erikoistuminen 
	private String tilinumero

	public Esiintyja(String nimi, double provisio, String erikoistuminen, int id, String tilinumero){
		this.nimi = nimi;
		this.provisio = provisio;
		this.erikoistuminen = erikoistuminen;		
		this.tilinumero = tilinumero;
		this.id = id;
	}
	
	public String getNimi(){
		return this.nimi;	
	}
	public int getId(){
		return this.id;
	}
	public String getTilinumero(){
		return this.tilinumero;
	}
	public double getProvisio(){
		return this.provisio;
	}
	public String getErikoistuminen(){
		return this.erikoistuminen;
	}
	public void setNimi(String nimi){
		this.nimi = nimi;	
		}
	public void setProvisio(int provisio){
		this.provisio = provisio;
	}
	public void setTilinumero(String tilinumero){
		this.tilinumero = tilinumero;
	}
	public void setErikoistuminen(int erikoistuminen){
		this.erikoistuminen = erikoistuminen;
	}
	//lisäksi to_string metodi
	
}
