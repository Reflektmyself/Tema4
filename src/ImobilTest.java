
public class ImobilTest {

	public static void main(String[] args) {
		
		Imobil casa = new Imobil();
		casa.setTipCasa("Casa");
		casa.setEtaj(1);
		casa.setPret(100.50);
		
		Imobil bloc = new Imobil();
		bloc.setTipCasa("Bloc");
		bloc.setEtaj(20);
		bloc.setPret(400.50);
		
		Imobil vila = new Imobil();
		vila.setTipCasa("Vila");
		vila.setEtaj(2);
		vila.setPret(200.30);
		
		
		System.out.println("Tip Imobil: " + casa.getTipCasa() + "\nNr.etaje: " + casa.getEtaj() + "\nPret: " + casa.getPret() + " lei");
		System.out.println("");
		System.out.println("Tip Imobil: " + bloc.getTipCasa() + "\nNr.etaje: " + bloc.getEtaj() + "\nPret: " + bloc.getPret()+ " lei");
		System.out.println("");
		System.out.println("Tip Imobil: " + vila.getTipCasa() + "\nNr.etaje: " + vila.getEtaj() + "\nPret: " + vila.getPret()+ " lei");
		
	}

}
