package televisionAssignment;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ugawari
 *
 */
public class TelevisionTest {
	private Television television;
	
	@Before
	public void setUp(){
		television=new Television();
	}
	
	@Test
	public void test() {
		System.out.println(television.getCurrentState());
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
	}

}
