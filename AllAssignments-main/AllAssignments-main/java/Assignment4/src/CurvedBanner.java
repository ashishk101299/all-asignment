package banner;

public class CurvedBanner extends RegularBanner {

	private double radius;

	public CurvedBanner (double w,double h, double r){
		super(w,h);
		radius = r;
	}

	public double Area(){
		return super.Area() - 0.86 * radius * radius;
	}
}
