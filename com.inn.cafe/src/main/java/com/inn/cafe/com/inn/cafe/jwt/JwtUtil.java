package com.inn.cafe.com.inn.cafe.jwt;

import java.util.function.Function;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;

@Service
public class JwtUtil {
	
	private String secret = "btechdays";
	public <T> T extractClaims(String token,Function<Claims,T> claimsResolver)
	{
		final Claims claims = 
	}
	
	public Claims extractAll 
	

}
