package com.youtube.michellebrito.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.youtube.michellebrito.webflux.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist,String>{
	

}
