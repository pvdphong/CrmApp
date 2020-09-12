package com.java.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.RoleDao;
import com.java.dao.UserDao;
import com.java.model.User;
import com.sun.source.tree.Tree;

@WebServlet(urlPatterns = {"/user", "/user/add", "/user/detail", "/user/delete", "/user/edit"})
public class UserController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private UserDao userDao = null; 
	private RoleDao roleDao = null;
	
	@Override
	public void init() throws ServletException {
		userDao = new UserDao(); 
		roleDao = new RoleDao(); 
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
			req.setAttribute("roles", roleDao.findAll());
			req.getRequestDispatcher("/WEB-INF/views/user/add.jsp").forward(req, resp);
			break; 
		case "/user/edit": 
			String idEdit = req.getParameter("id"); 
			User model = userDao.findById(idEdit); 
			req.setAttribute("user", model);
			req.setAttribute("roles", roleDao.findAll());
			req.getRequestDispatcher("/WEB-INF/views/user/edit.jsp").forward(req, resp);
			break; 
		case "/user/delete":
			String id = req.getParameter("id"); 
			if(userDao.delete(id) > 0) {
				System.out.println("delete thanh cong!");
			}
			resp.sendRedirect(req.getContextPath() + "/user");
			break; 
		case "/user/detail": 
			String idDetail = req.getParameter("id"); 
			User user = userDao.findById(idDetail); 
			req.setAttribute("user", user);
			req.getRequestDispatcher("/WEB-INF/views/user/detail.jsp").forward(req, resp);
			break; 	
		default:
			break; 
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		User model = new User(); 
		model.setEmail(req.getParameter("email"));
		model.setPassword(req.getParameter("password"));
		model.setFullname(req.getParameter("fullname"));
		model.setPhone(req.getParameter("phone"));
		model.setAddress(req.getParameter("address"));
		model.setAvatar(req.getParameter("avatar"));
		model.setRole_id(Integer.valueOf(req.getParameter("role")));
		
		String action = req.getServletPath(); 
		switch (action) {
			case "/user/edit": 
				userDao.update(model);
				break; 
			case "/user/add": 
				if(userDao.insert(model) > 0){
					System.out.println("insert thanh cong");
				}
				else {
					System.out.println("insert that bai");
				}
				break; 
			default:
				break; 
		}
		resp.sendRedirect(req.getContextPath() + "/user");
	}
}
