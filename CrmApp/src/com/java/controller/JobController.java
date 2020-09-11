package com.java.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.JobDao;

@WebServlet(urlPatterns = {"/job", "/job/add", "/job/detail"})
public class JobController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private JobDao jobDao = null; 
	
	@Override
	public void init() throws ServletException {
		jobDao = new JobDao(); 
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String action = req.getServletPath(); 
		
		switch (action) {
		case "/job": 
			req.setAttribute("jobs",jobDao.findAll());
			req.getRequestDispatcher("/WEB-INF/views/job/index.jsp").forward(req, resp);
			break; 
		case "/job/add": 
			req.getRequestDispatcher("/WEB-INF/views/job/add.jsp").forward(req, resp);
			break; 
		case "/job/delete": 
			req.getRequestDispatcher("/WEB-INF/views/job/add.jsp").forward(req, resp);
			break; 
		case "/job/detail": 
			req.getRequestDispatcher("/WEB-INF/views/job/detail.jsp").forward(req, resp);
			break; 
		default:
			break; 
		}
		
	}
}
