/*
	* @author bacng
	* @ Date Jun 12, 2022
*/
package exercise3;

public class Sedan extends Car {
	private int legth;
	double getSalePrice() {
		if(legth>20) {
			return getRegularPrice()*0.95;
			
		}else {
			return getRegularPrice()*0.9;
		}
	}
	public Sedan(int legth) {
		super(150,20000,"do");
		this.legth = legth;
	}
	public Sedan() {
		super();
	}
	public int getLegth() {
		return legth;
	}
	public void setLegth(int legth) {
		this.legth = legth;
	}
	@Override
	public String toString() {
		return "Sedan [legth=" + legth + ", getSalePrice()=" + getSalePrice() + ", getSpeed()=" + getSpeed()
				+ ", getColor()=" + getColor() + "]";
	}
	
	
	
}
