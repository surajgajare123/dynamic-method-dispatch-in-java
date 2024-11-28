class Phone{
    public void greet(){
        System.out.println("Timing is 9am.........!");
    }
    public void on(){
        System.out.println("Moblie is oning...........!");
    }
    
}
class SmartPhone extends Phone{
    public void ShowTimes(){
        System.out.println("Timing is 8am.........!");
    }
    public void on(){
        System.out.println("Moblie is calling........!");
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("dynamic method dispatch......!");
		Phone obj = new SmartPhone();
		obj.on();
	    //obj.ShowTimes(); // Not Allowed 
	    obj.greet();
	}
}



