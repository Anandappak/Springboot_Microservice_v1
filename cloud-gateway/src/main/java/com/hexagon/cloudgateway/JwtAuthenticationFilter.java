//package com.hexagon.cloudgateway;
//
//import java.nio.charset.StandardCharsets;
//import org.springframework.core.io.buffer.DataBuffer;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.gateway.filter.GatewayFilter;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//
//import com.google.common.net.HttpHeaders;
//
//import reactor.core.publisher.Mono;
//
//@Component
//public class JwtAuthenticationFilter implements GatewayFilter {
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//
//        ServerHttpRequest request = exchange.getRequest();
//
//        // Allow login endpoint
//        if (request.getURI().getPath().contains("/auth/login")) {
//            return chain.filter(exchange);
//        }
//
//        // Check Authorization header
//        if (!request.getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
//            return onError(exchange, "Missing Authorization Header");
//        }
//
//        String authHeader = request.getHeaders().getFirst(HttpHeaders.AUTHORIZATION);
//
//        if (!authHeader.startsWith("Bearer ")) {
//            return onError(exchange, "Invalid Authorization Header");
//        }
//
//        String token = authHeader.substring(7);
//
//        try {
//            jwtUtil.validateToken(token);
//        } catch (Exception e) {
//            return onError(exchange, "Invalid/Expired Token");
//        }
//
//        return chain.filter(exchange);
//    }
//
//    private Mono<Void> onError(ServerWebExchange exchange, String message) {
//        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//        byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
//        DataBuffer buffer = exchange.getResponse().bufferFactory().wrap(bytes);
//
//        return exchange.getResponse().writeWith(Mono.just(buffer))
//                .onErrorResume(e -> exchange.getResponse().setComplete());
//    }
//
//}
