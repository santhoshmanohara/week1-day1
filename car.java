package week1day2;

public class car {
	
    public void applybreak() {
    	System.out.println("applybreak");
    }
    public void applygear() {
    	System.out.println("applygear");
    }
    public void switchonAc() {
    	System.out.println("switchonAc");
    }
    public void applyacclerate() {
    	System.out.println("applyacclerate");
    }
    public static void main(String[] args) {
		car mycar=new car();
		mycar.applybreak();
		mycar.applygear();
		mycar.switchonAc();
		mycar.applyacclerate();
		
}

}

