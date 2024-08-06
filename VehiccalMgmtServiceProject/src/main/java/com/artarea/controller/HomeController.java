package com.artarea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.artarea.model.JwtRequest;
import com.artarea.model.Response;
import com.artarea.service.UserService;
import com.artarea.service.customerService;
import com.artarea.utilty.JwtUtility;

@RestController
public class HomeController {

	@Autowired
    private JwtUtility jwtUtility;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;
    
    @Autowired
    private customerService customerService;
    
	@GetMapping("/")
    public String home() {
        return "Welcome to Exponent Coder....!!";
    }
	
	
	@GetMapping("/check")
    public String homeData() {
        return "Success";
    }
	@PostMapping("/authenticate")
    public Response authenticate(@RequestBody JwtRequest jwtRequest) throws Exception{

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getUsername(),
                            jwtRequest.getPassword()
                    )
            );
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
        Response response= customerService.getloginData(jwtRequest.getUsername(),jwtRequest.getPassword());

        final UserDetails userDetails
                = userService.loadUserByUsername(response.getUname());

        final String token =
                jwtUtility.generateToken(userDetails);
        
        response.setToken(token);
        
        return  response;
    }
	
	@GetMapping("/get")
    public String homeGETData() {
        return "Not Autherized Directly Access...!";
    }

}
