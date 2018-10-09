package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Category;

class CategoryTest {

	@Test
	void test() {
		Category category1 = new Category(0, "Books");
		Category category2 = new Category(1, "Electronics");
		assertEquals(category1.getCategoryName(), "Books");
		assertEquals(category1.getCategoryId(), 0);
		assertEquals(category2.getCategoryId(), 1);
	}

}
