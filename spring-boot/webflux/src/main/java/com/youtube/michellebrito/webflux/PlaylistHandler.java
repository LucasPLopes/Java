package com.youtube.michellebrito.webflux;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.youtube.michellebrito.webflux.document.Playlist;
import com.youtube.michellebrito.webflux.services.PlaylistService;

import reactor.core.publisher.Mono;

@Component 
public class PlaylistHandler {
	
	@Autowired
	PlaylistService service;
	
	public Mono<ServerResponse> findAll(ServerRequest req){
		return ok().contentType(MediaType.APPLICATION_JSON).body(service.findAll(),Playlist.class);
	}
	public Mono<ServerResponse> findById(ServerRequest req){
		String id = req.pathVariable("id");
		return ok().contentType(MediaType.APPLICATION_JSON).body(service.findById(id), Playlist.class);
		
	}
	public Mono<ServerResponse> save(ServerRequest req){
		final Mono<Playlist> playlist = req.bodyToMono(Playlist.class);
		return ok().contentType(MediaType.APPLICATION_JSON).body(fromPublisher(playlist.flatMap(service::save),Playlist.class));
	}
}
