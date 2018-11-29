package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SongTest {
	
	private Song test = new Song();
	
	@Test
	void testPossibleFailSetDurationInSeconds() {
		try {
			test.setDurationInSeconds(-500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(0, test.getDurationInSeconds());
	}
	
	@Test
	void testSetDurationInSeconds() {
		try {
			test.setDurationInSeconds(3600);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(3600, test.getDurationInSeconds());
	}
}
