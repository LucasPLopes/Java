package com.youtube.michellebrito.webflux;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.youtube.michellebrito.webflux.document.Playlist;
import com.youtube.michellebrito.webflux.repository.PlaylistRepository;

import reactor.core.publisher.Flux;


@Component
public class DummieData implements CommandLineRunner {

	private PlaylistRepository playlistRepository;
	
	public DummieData(PlaylistRepository playlistRepository) {
		super();
		this.playlistRepository = playlistRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		playlistRepository.deleteAll().thenMany(Flux
				.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud", "Java 8", "Github",
						"Spring Security", "Web Service RESTFULL", "Bean no Spring Framework")
				.map(nome -> new Playlist(UUID.randomUUID().toString(), nome)).flatMap(playlistRepository::save))
				.subscribe(System.out::println);
	}

}
