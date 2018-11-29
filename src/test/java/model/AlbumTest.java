package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlbumTest {

	private Album album = new Album();
	
	@Test
	void testSetDurationInMinutes() {
		try {
			album.setDurationInMinutes(-4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(0, album.getDurationInMinutes());
		try {
			album.setDurationInMinutes(300);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(300, album.getDurationInMinutes());
	}

}
