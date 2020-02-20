
public class Animal {
	private String tipAnimal;
	private String culoare;
	private int varsta;

	public Animal(){
		tipAnimal="";
		culoare="";
		varsta=0;
	}
	public Animal ( String tipAnimal, String culoare, int varsta) {
		
		this.tipAnimal = tipAnimal;
		this.culoare = culoare;
		this.varsta = varsta;
		
	}
	public void setTipAnimal(String tipAnimal) {
		this.tipAnimal = tipAnimal;
	}


	public String getTipAnimal() {
		return this.tipAnimal;
	}



	public Animal ( String tipAnimal) {
		this.tipAnimal = tipAnimal;
		culoare ="";
		varsta = 0;
	}



	public Animal(String tipAnimal, String culoare) {
		this.tipAnimal = tipAnimal;
		this.culoare = culoare;
		varsta = 0;
	}

	public void setCuloare(String culoare) { 
		this.culoare = culoare;
		
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getCuloare() {
		return this.culoare;
	}

	public int getvarsta() {
		return this.varsta;
	}

	}



