package banner;

public class RegularBanner {
	private double width;
	private double height;

	public RegularBanner(double w,double h) {
		width = w;
		height = h;
	}

	public boolean Resize() {
		boolean flag = false;
		if(width>height) {
			flag = true;
		}
		flag = false;
		return flag;
	}
	public double Area() {
		return width * height;
	}
}
