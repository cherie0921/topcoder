import org.junit.Test;
import static org.junit.Assert.*;

public class TallPeopleTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] people = new String[] {"9 2 3",
 "4 8 7"};
		assertArrayEquals(new int[] { 4,  7 }, new TallPeople().getPeople(people));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] people = new String[] {"1 2",
 "4 5",
 "3 6"};
		assertArrayEquals(new int[] { 4,  4 }, new TallPeople().getPeople(people));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] people = new String[] {"1 1",
 "1 1"};
		assertArrayEquals(new int[] { 1,  1 }, new TallPeople().getPeople(people));
	}
}
