package mybasicpractice;

interface RemoteControl {
	void powerOn();
	void powerOff();
}
class TVRemote implements RemoteControl{
	public void powerOn() {
		System.out.println("TV POWER  POWER ON");
	}
	public void powerOff() {
		System.out.println("TV POWER POWER OF");
	}
}

class ACRemote implements RemoteControl{
	public void powerOn() {
		System.out.println("ACREMOTE POWER ON");
	}
	public void powerOff() {
		System.out.println("ACREMOTE POWER OF");
	}
}

public class AbstractionViaInterfacePractice {

	public static void main(String[] args) {
		TVRemote s1 = new TVRemote();
		s1.powerOn();
		s1.powerOff();
		
		ACRemote s2 = new ACRemote();
		s2.powerOn();
		s2.powerOff();
	}

}
