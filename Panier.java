import java.util.ArrayList;

public class Panier{

	public static void main(String[] args){
		Panier p = new Panier(2);
		System.out.println(p.estVide());
		p.ajoute(new Orange(15,"bleu"));
		p.ajoute(new Orange(12,"ayaa"));
		System.out.println(p.estPlein());
		System.out.println(p.getNbFruit());
	}
	
	private	ArrayList<Orange> liste;
	private int contenance;

	public Panier(int c){
		this.contenance = c;
		this.liste = new ArrayList<Orange>();
	}
	
	public void ajoute(Orange o){
		if(this.liste.size() < this.contenance)
			liste.add(o);
	}
	
	public boolean estPlein(){return this.liste.size() == this.contenance;}
	public boolean estVide(){return this.liste.size() == 0;}
	
	public int getNbFruit(){return this.liste.size();}
	public void setContenance(int c){this.contenance = c;}
}
