/**
 * Design a Television class, refer below hints for its state and behavior and test it Using JUnit:-
 state (on/off), 
 current volume, 
 current channel, 
 increase and decrease volume and 
 change channel
 turn it on and off.  
Design this class, create an instance, turn on, increase and decrease the volume, change channels..get information about state, volume and channel..finally turn it off.
 */
package assignment.television;

/**
 * @author ugawari
 *
 */
public class Television {

	private boolean state;
	private int volume;
	private int channel;
	
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
	/**
	 * to check current state of power
	 * @return 
	 */
	public boolean getCurrentState() {
		return this.state;
	}
	
	/**
	 * checks current state of power and w.r.t changes
	 * @return
	 */
	public boolean changeState() {
		if(state)
			return state=false; 
		else
			return state=true;
	}

	/**
	 * checks current volume
	 * @return
	 */
	public int getCurrentVolume() {
		if(state)
			return this.volume;
		else
			return 0;
	}
	
	/**
	 * increase current volume by one if power is on
	 * @return
	 */
	public int increaseVolume() {
		if(state)
			 this.volume=getCurrentVolume()+1;
		return this.volume;
	}
	
	/**
	 * decrease current volume by one and prevent to below 0 if power is on
	 * @return
	 */
	public int decreaseVolume() {
		if(state)
			this.volume=getCurrentVolume()-1;
			return this.volume;
		
	}
	
	/**
	 * to get current channel
	 * @return
	 */
	public int getCurrentChannel() {
		return this.channel;
	}
	
	/**
	 * @return to increase current channel by one if power is on
	 */
	public int increaseCurrentChannel() {
		if(state)
			channel=getCurrentChannel()+1;
		return channel;
	}
	
	/**
	 * @return to decrease current channel by one if power is on
	 */
	public int decreaseCurrentChannel() {
		if(state)
			channel=getCurrentChannel()-1;
		return channel;
	}
	
	/**
	 * method to  changes given channel 
	 */
	public void changeChannel(int channelNumber) {
		 if(state)
			channel=channelNumber;
	}
	
	/*public static void main(String [] args){
		System.out.println(getCurrentState());
		System.out.println(television.changeState());
		System.out.println(television.getCurrentState());
		television.setVolume(5);
		System.out.println(television.getCurrentVolume());
		System.out.println(television.increaseVolume());
		System.out.println(television.getCurrentVolume());
		System.out.println(television.decreaseVolume());
		System.out.println(television.getCurrentVolume());
		television.setChannel(4);
		System.out.println(television.getCurrentChannel());
		System.out.println(television.increaseCurrentChannel());
		System.out.println(television.getCurrentChannel());
		System.out.println(television.decreaseCurrentChannel());
		System.out.println(television.getCurrentChannel());
		television.changeChannel(70);
		System.out.println(television.getCurrentChannel());
	}*/
	
}
