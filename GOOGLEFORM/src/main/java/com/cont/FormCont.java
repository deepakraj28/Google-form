package com.cont;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.StuDao;
import com.model.Student;


@WebServlet("/FormCont")
public class FormCont extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String regno=request.getParameter("regno").trim();
		String name=request.getParameter("name").trim();
		String gender=request.getParameter("gender");
		String dept=request.getParameter("dept");
		String address=request.getParameter("addr").trim();
		String a=request.getParameter("age").trim();
		int age=Integer.parseInt(a);
		List<String> li=new ArrayList<>();
		if(regno.length()==0){
			li.add("enter valid regno");
		}
		if(name.length()==0){
			li.add("name field must be filled");
		}
		
		if(gender.length()==0){
			li.add("gender must be filled");
		}
		if(dept.length()==0){
			li.add("enter the valid dept");
		}
		if(address.length()==0){
			li.add("enter valid address");
		}
		if(age<18){
			li.add("u r not allowed");
		}
		if(!li.isEmpty())
		{
			request.setAttribute("error", li);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		Student s=new Student(regno,name,gender,dept,address,age);
		StuDao  sd=new StuDao();
		sd.Storedata(s);
		RequestDispatcher rd1=request.getRequestDispatcher("view.jsp");
		rd1.forward(request,response);
	}
	

}
