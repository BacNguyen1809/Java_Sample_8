/*
	* @author bacng
	* @ Date Jun 12, 2022
*/
package exercise3;

public class Truck extends Car {
	private int weight;
	double getSalePrice() {

		if(getWeight()>2000) {
			return super.getRegularPrice()*0.9;
		}else {
			setRegularPrice(getSalePrice()*0.8);
		}
		return getRegularPrice();
	}
	public Truck() {
		super();
	}
	public Truck(int weight) {
		super();
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
;
}
