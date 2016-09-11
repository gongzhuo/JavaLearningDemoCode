package linkList;

import static org.junit.Assert.assertTrue;

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
	}

	@Test
	public void testRemove() {
		ConcretLinkedList demo = new ConcretLinkedList();
		for (int i = 0; i < 5; i++) {
			demo.add(new Node(5 - i));
		}
		System.out.println(demo);
		for (int j = 0; j < 5; j++) {
			demo.remove();
			System.out.println(demo + " length = " + demo.count());
		}
	}

	@Test
	public void testRemoveI() {
		ConcretLinkedList demo = new ConcretLinkedList();
		for (int j = 0; j < 5; j++) {
			demo.add(new Node(5 - j));
		}
		demo.add(new Node(5));
		demo.add(new Node(8));
		demo.add(new Node(10));
		System.out.println(demo);
		demo.remove(5);
		System.out.println(demo + " length = " + demo.count());
	}

	@Test
	public void testAddNodeI() {
		ConcretLinkedList demo = new ConcretLinkedList();
		for (int j = 0; j < 5; j++) {
			demo.add(new Node(5 - j));
		}
		demo.add(new Node(5));
		demo.add(new Node(8));
		demo.add(new Node(10));
		System.out.println(demo);
		demo.add(new Node(9), 5);
		System.out.println(demo + " length = " + demo.count());
	}

	@Test
	public void testAddList() {
		ConcretLinkedList demo = new ConcretLinkedList();
		for (int j = 0; j < 5; j++) {
			demo.add(new Node(5 - j));
		}
		System.out.println(demo);
		ConcretLinkedList b = new ConcretLinkedList();
		b.add(new Node(5));
		b.add(new Node(8));
		b.add(new Node(10));
		System.out.println(b);
		demo.add(b);
		System.out.println(demo + " length = " + demo.count());
	}

	@Test
	public void testExist() {
		ConcretLinkedList demo = new ConcretLinkedList();
		for (int i = 0; i < 5; i++) {
			demo.add(new Node(5 - i));
		}
		demo.add(new Node(5));
		demo.add(new Node(8));
		demo.add(new Node(10));
		System.out.println(demo);
		assertTrue(demo.exist(new Node(4)));
		assertTrue(demo.exist(new Node(5)));
		assertTrue(demo.exist(new Node(11)) == false);
		System.out.println(demo.exist(new Node(5)));
		System.out.println(demo.exist(new Node(11)));
	}

}
