//package com.hexagon.cloudgateway;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GatewayConfig {
//
//	@Autowired
//	private JwtAuthenticationFilter jwtFilter;
//
//	@Bean
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes().route("student-service", r -> r.path("/student/**").filters(f -> f.filter(jwtFilter)) // attach
//																														// custom
//																														// filter
//				.uri("lb://STUDENT-SERVICE"))
//				.route("school-service",
//						r -> r.path("/school/**").filters(f -> f.filter(jwtFilter)).uri("lb://SCHOOL-SERVICE"))
//				.build();
//	}
//}
