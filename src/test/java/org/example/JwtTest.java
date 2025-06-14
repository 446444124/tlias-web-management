package org.example;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {


    @Test
    public void  testGenerateJwt(){
        Map<String, Object> dataMap= new HashMap<>();
        dataMap.put("id",1);
        dataMap.put("name","admin");
        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "aXRoZWltYQ==")
                .addClaims(dataMap)
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .compact();

        System.out.println(jwt);
    }

    @Test
    public void testParseJwt(){
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiYWRtaW4iLCJpZCI6MSwiZXhwIjoxNzQ3NDY4NDM4fQ._lC7zqWR13Bt1Qqe8yIGxAIVxhkuHW2JMCBDnOWTepk";
        Claims claims = Jwts.parser()
                .setSigningKey("aXRoZWltYQ==")
                .parseClaimsJws(token)
                .getBody();
        System.out.println(claims);
    }
}
