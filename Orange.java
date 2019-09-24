public class Orange{
	private double prix;
	private String origine;
	
	public static void main(String[] args){
		Orange o1 = new Orange(1,"Antananarivo");
		System.out.println(o1.getPrix());
		System.out.println(o1.getOrigine());
	}
	
	public Orange(double p, String o){
		this.prix = Math.abs(p);
		this.origine = o;
	}
	
	public double getPrix(){return this.prix;}
	public String getOrigine(){return this.origine;}
}
