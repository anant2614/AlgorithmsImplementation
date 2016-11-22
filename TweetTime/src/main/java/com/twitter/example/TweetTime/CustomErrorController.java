package com.twitter.example.TweetTime;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class CustomErrorController implements ErrorController{

	  @RequestMapping(value = "/error")
	    public void error(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	        resp.sendRedirect("/404");
	    }
	
	@Override
	public String getErrorPath() {
		return "/error";
	}

}
