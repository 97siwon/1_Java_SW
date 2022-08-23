package edu.kh.poly.ex1.model.vo;

public class Spark extends Car {

	private  double disCountOffer; // 할인혜책
	
	public Spark() {}

	public Spark(int wheel, int seat, String fuel, double disCountOffer) {
		super(wheel, seat, fuel);
		this.disCountOffer = disCountOffer;
	}

	public double getDisCountOffer() {
		return disCountOffer;
	}

	public void setDisCountOffer(double disCountOffer) {
		this.disCountOffer = disCountOffer;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / 할인혜택 : " + disCountOffer;
	}
	
	
	public void dc() {
		System.out.println(disCountOffer * 100 + "% 할인 됩니다.");
	}
}
