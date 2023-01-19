class ProgramMain {

	public static void main(String[] args) {

		double totalbill = 0;
		int pid = Integer.parseInt(args[0]);
		String pname = args[1];
		int btype = Integer.parseInt(args[2]);
		int ndays = Integer.parseInt(args[3]);

		Patient p = new Patient(pid,pname,btype,ndays);
		totalbill = p.getBillAmount();
		if(totalbill == 0) {
		System.out.println("");
		}
		else {
		System.out.printf(" Patient Name\t: %s%n Pid\t\t: %d%n BedType\t: %d%n Admitted Days\t: %d%n Total Bill\t: %s%n",pname,pid,btype,ndays,totalbill);
	
		}
	}		

} 
