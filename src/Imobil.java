
public class Imobil {
	private String tipCasa;
	private int etaj;
	private double pret;


	public Imobil() {
	tipCasa = "";
	etaj = 0;
	pret = 0;
	}
	public Imobil(String tipCasa, int etaj, double pret) {
		this.tipCasa = tipCasa;
		this.etaj = etaj;
		this.pret = pret;
		
	}
	public void setTipCasa(String tipCasa) {
		this.tipCasa = tipCasa;
		
	}
	public String getTipCasa() {
		return this.tipCasa;
		
	}

	public Imobil(int etaj) {
		this.etaj = etaj;
			
	}
	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}
	public int getEtaj() {
		return this.etaj;
		
	}

	public Imobil(double pret) {
		this.pret = pret;
		
	}
	 public void setPret(double pret) {
		 this.pret = pret;
		 
	 }
	public double getPret() {
		return this.pret;
	}

}
