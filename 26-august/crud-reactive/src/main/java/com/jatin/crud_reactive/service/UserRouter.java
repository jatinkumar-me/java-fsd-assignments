package com.jatin.crud_reactive.service;

import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * UserRouter
 */
@Configuration
public class UserRouter {

	public RouterFunction<ServerResponse> userRoutes(UserHandler userHandler) {
		return route(GET("/users"), userHandler::getAllUsers)
				.andRoute(GET("/users/{id}"), userHandler::getUserById)
				.andRoute(POST("/users"), userHandler::createUser)
				.andRoute(PUT("/users/{id}"), userHandler::updateUser)
				.andRoute(DELETE("/users/{id}"), userHandler::deleteUser);
	}
}
