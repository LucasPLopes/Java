package com.youtube.michellebrito.webflux.controller;

import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.michellebrito.webflux.document.Playlist;
import com.youtube.michellebrito.webflux.services.PlaylistService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
@RequestMapping("playlist")
public class PlaylistController {

	@Autowired
	PlaylistService service;

	@GetMapping(value = "/"	)
	public Flux<Playlist> getPlaylists() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Mono<Playlist> getPlaylistById(@PathVariable String id) {
		return service.findById(id);
	}

	@PostMapping("/")
	public Mono<Playlist> savePlaylist(@RequestBody Playlist playlist) {
		return service.save(playlist);
	}
	
	@GetMapping(value= "/webflux", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Tuple2<Long,Playlist>> getPlaylistByWebFlux(){
		System.out.println("---Start get Playlists by WEBFLUX--- " + LocalDateTime.now());
		Flux<Long> interval = Flux.interval(Duration.ofSeconds(3));
		Flux<Playlist> playlistFlux = service.findAll();
		
		return Flux.zip(interval,playlistFlux);

	}
	
}
