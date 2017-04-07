package abstraction.transformateur.europe;

public class Stock {

	private double stockcacao;
	private double stockchocolat;
	
	public Stock(double stockcacao,double stockchocolat){
		this.stockcacao=stockcacao;
		this.stockchocolat=stockchocolat;
	}
	
	public double getstockcacao(){
		return this.stockcacao;
	}
	
	public double getstockchocolat(){
		return this.stockchocolat;
	}
	
	public void setstockcacao(double stockcacao){
		this.stockcacao=stockcacao;
	}
	
	public void setstockchocolat(double stockchocolat){
		this.stockchocolat=stockchocolat;
	}
	
	public String toString(){
		return "stock de cacao: "+this.stockcacao+"   stock de chocolat: "+this.stockchocolat;
	}
	
	
}


