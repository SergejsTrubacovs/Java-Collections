//A00212878
package grosspay;

class GrossPay {
	
	private String name;
	private String surname;
	private String department;
	private String position;
	private double rate;
	private double hours;
	private double grossPay;
	
	public GrossPay(String n, String s, String d,
					String p, double r, double h, double gp) {		
		name=n;
		surname=s;
		department=d;
		position=p;
		rate=r;
		hours=h;
		grossPay=gp;
	}

	public String readName() {return name;}
	public String readSurname() {return surname;}
	public String readDepartment() {return department;}
	public String readPosition() {return position;}
	public double readRate(){return rate;}
	public double readHours(){return hours;}
	public double readGrossPay(){return grossPay;}
	public void setNewRate(double r){rate=r;}

}
