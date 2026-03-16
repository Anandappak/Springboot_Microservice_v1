//package com.hexagon.cloudgateway.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.hexagon.cloudgateway.JwtAuthenticationFilter;
//
//@Configuration
//public class GatewayConfig {
//
//    @Autowired
//    private JwtAuthenticationFilter jwtFilter;
//
//    @Bean
//    public RouteLocator routes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("employee-service", r -> r.path("/employees/**")
//                        .filters(f -> f.filter(jwtFilter))
//                        .uri("http://localhost:8082"))
//                .route("department-service", r -> r.path("/departments/**")
//                        .filters(f -> f.filter(jwtFilter))
//                        .uri("http://localhost:8081"))
//                .build();
//    }
//}
