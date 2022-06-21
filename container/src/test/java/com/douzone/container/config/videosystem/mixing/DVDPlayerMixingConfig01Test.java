package com.douzone.container.config.videosystem.mixing;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.douzone.container.videosystem.DVDPlayer;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= {DVDPlayerConfig.class})
public class DVDPlayerMixingConfig01Test {
	@Autowired
	private DVDPlayer dvdPlayer;
	
	@Test
	public void testPlayerNotNull() {
		assertNotNull(dvdPlayer);
	}
}