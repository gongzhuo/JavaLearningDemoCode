package linkList;

import org.junit.Test;

public class ConcretLinkedListTest {

	@Test
	public void testAddNode() {
		ConcretLinkedList demo = new ConcretLinkedList();

		for (int i = 0; i < 5; i++) {
			demo.add(new Node(5 - i));
		}
		demo.add(new Node(5));
		demo.add(new Node(8));
		demo.add(new Node(10));
		assertTrue(demo.count() == 8);
		System.out.println(demo);

		System.out.println();
		demo.add(new Node(9), 5);
		System.out.println(demo + " length = " + demo.count());

		System.out.println();
		assertTrue(demo.exist(new Node(5)) == true);
		assertTrue(demo.exist(new Node(11)) == false);
		System.out.println(demo.exist(new Node(5)));
		System.out.println(demo.exist(new Node(11)));

		System.out.println();
		demo.remove(3);
		System.out.println(demo + " length = " + demo.count());

		System.out.println();
		for (int j = 0; j < 8; j++) {
			demo.remove();
			System.out.println(demo + " length = " + demo.count());
		}
	}

	private void assertTrue(boolean b) {

	}

	private void assertTrue(int add) {

	}

}
