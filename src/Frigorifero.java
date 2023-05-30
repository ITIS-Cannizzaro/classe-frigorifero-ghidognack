
public class Frigorifero {
	  private String classe;
	    private double capienza;
	    private double moltiplicatore;
	    private double price;
	    public Frigorifero(String classe, double capienza) {
	        this.classe = classe;
	        this.capienza = capienza;

	    }
	    public String getClasse() {
	        return classe;
	    }
	    public double getCapienza() {
	        return capienza;
	    }
	    public String toString() {
	        return "Classe: "+classe+"\n"+"Capienza: "+capienza;
	        }
	    public double getMoltiplicatore() {
	        return moltiplicatore;
	    }
	    public double getPrice() {
	        if(classe == "A") {
	            moltiplicatore = 5;
	        }
	        else if(classe == "A+") {
	            moltiplicatore = 1.5;
	        }
	        else if(classe == "A++") {
	            moltiplicatore = 2;
	        }

	        return price = 5 * capienza * moltiplicatore;
	    }
	}
	

