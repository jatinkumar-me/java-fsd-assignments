package com.jatin.crud_reactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.jatin.crud_reactive.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * UserHandler
 */
@Component
public class UserHandler {

	@Autowired
    private UserService userService;

    public Mono<ServerResponse> getAllUsers(ServerRequest request) {
        Flux<User> users = userService.getAllUsers();
        return ServerResponse.ok().body(users, User.class);
    }

    public Mono<ServerResponse> getUserById(ServerRequest request) {
        String id = request.pathVariable("id");
        Mono<User> user = userService.getUserById(id);
        return user.flatMap(stu -> ServerResponse.ok().bodyValue(stu))
                      .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> createUser(ServerRequest request) {
        Mono<User> userMono = request.bodyToMono(User.class);
        return userMono.flatMap(userService::createUser)
                          .flatMap(user -> ServerResponse.ok().bodyValue(user));
    }

    public Mono<ServerResponse> updateUser(ServerRequest request) {
        String id = request.pathVariable("id");
        Mono<User> userMono = request.bodyToMono(User.class);
        return userMono.flatMap(user -> userService.updateUser(id, user))
                          .flatMap(updatedUser -> ServerResponse.ok().bodyValue(updatedUser))
                          .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> deleteUser(ServerRequest request) {
        String id = request.pathVariable("id");
        return userService.deleteUser(id)
                             .flatMap(result -> ServerResponse.ok().build())
                             .switchIfEmpty(ServerResponse.notFound().build());
    }
}
