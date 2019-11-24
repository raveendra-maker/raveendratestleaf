package day1.classroom;

public class Mobile {

	public boolean makeCall(){
		return false;
		
	}
	
	public String sendSms(){
		return "sometext";
		
	}
	
	public String shutDown(){
		return "swithoff";
		
	}
	public static void main(String[] args) {
		
	
	Mobile sms = new Mobile();
	boolean name = sms.makeCall();
	System.out.println(name);
	
	String name1 = sms.sendSms();
	System.out.println(name1);
	
	String name2 = sms.shutDown();
	System.out.println(name2);
	
	
}
}
