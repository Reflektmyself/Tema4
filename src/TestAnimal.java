
public class TestAnimal {

	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.setTipAnimal("Caine");
		dog.setCuloare("alb");
		dog.setVarsta(3);
		
		Animal mause = new Animal("Jerry");
		mause.setCuloare("Gri");
		mause.setVarsta(1);
		
		Animal owl = new Animal("Hank");
		owl.setCuloare("Pistrui");
		owl.setVarsta(4);
		
	
		
		System.out.println("Tip animal: " + dog.getTipAnimal() + "\nCuloare: " + dog.getCuloare() + "\nVarsta: " + dog.getvarsta());
		System.out.println("");
		System.out.println("Tip animal: " + owl.getTipAnimal() + "\nCuloare: " + owl.getCuloare() + "\nVarsta: " + owl.getvarsta());
		System.out.println("");
		System.out.println("Tip animal: " + mause.getTipAnimal() + "\nCuloare: " + mause.getCuloare() + "\nVarsta: " + mause.getvarsta());
	}
	}


