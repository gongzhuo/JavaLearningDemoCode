package linkList;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcretLinkedListTest {

	@Test
	public void testAddNode() {
		ConcretLinkedList demo = new ConcretLinkedList();
		
		for(int i = 0; i < 5; i++){
			demo.add(new Node(5 - i));
		}
		demo.add(new Node(5));
		demo.add(new Node(8));
		demo.add(new Node(10));
		assertTrue(demo.count() == 8);
		System.out.println(demo);
		
	}

}
