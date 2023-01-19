import banner.*;
class BannerMain {

	public static double bannerPrice(RegularBanner info,int copies) {
	
		double rate = copies < 5 ? 0.8 : 0.75;
		return copies * rate * info.Area();
	}

	public static void main(String[] args) {
	
	double w = Double.parseDouble(args[0]);
	double h = Double.parseDouble(args[1]);
	double r = Double.parseDouble(args[2]);
	int c = Integer.parseInt(args[3]);
	
	var rb = new RegularBanner(w,h);
	//rb.Resize(w,h);
	var cb = new CurvedBanner(w,h,r);
	//cb.Resize(w,h);
	System.out.printf("Regular Banner cost : %.2f%n",bannerPrice(rb,c));
	System.out.printf("Curved Banner cost  : %.2f%n", bannerPrice(cb,c));
	}
}
