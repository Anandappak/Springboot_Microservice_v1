//package com.hexagon.cloudgateway;
//
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//
//@Component
//public class JwtUtil {
//
//    @Value("${gateway.jwt.secret}")
//    private String secret;
//
//    @Value("${gateway.jwt.expiration}")
//    private long expiration;
//
//    public String generateToken(String username) {
//        return Jwts.builder()
//                .setSubject(username)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + expiration))
//                .signWith(SignatureAlgorithm.HS256, secret.getBytes())
//                .compact();
//    }
//
//    public Claims validateToken(String token) {
//        return Jwts.parser()
//                .setSigningKey(secret.getBytes())
//                .parseClaimsJws(token)
//                .getBody();
//    }
//}
