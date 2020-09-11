package com.java.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.UserDao;

@WebServlet(urlPatterns = {"/user", "/user/add", "/user/detail"})
public class UserController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private UserDao userDao = null; 
	
	@Override
	public void init() throws ServletException {
		userDao = new UserDao(); 
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String action = req.getServletPath(); 
		
		switch (action) {
		case "/user": 
			req.setAttribute("users", userDao.findAll());
			req.getRequestDispatcher("/WEB-INF/views/user/index.jsp").forward(req, resp);
			break; 
		case "/user/add": 
			req.getRequestDispatcher("/WEB-INF/views/user/add.jsp").forward(req, resp);
			break; 
		case "/user/delete": 
			req.getRequestDispatcher("/WEB-INF/views/user/add.jsp").forward(req, resp);
			break; 
		case "/user/detail": 
			req.getRequestDispatcher("/WEB-INF/views/user/detail.jsp").forward(req, resp);
			break; 
		default:
			break; 
		}
	}
}