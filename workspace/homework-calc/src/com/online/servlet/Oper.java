package com.online.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Oper
 */
@WebServlet("/Oper")
public class Oper extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Oper() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html; charset=UTF-8");
	String input = request.getParameter("input");
	String[] arTemp = null;
	String opers = "+-*/";
	Calc c = null;
	
	PrintWriter out = response.getWriter();
	
	int temp = 0, result = 0, count = 0;
	
	for(int i=0; i<opers.length(); i++) {
		for (int j = 0; j < input.length(); j++) {
			if(opers.charAt(i) == input.charAt(j)) {
				temp = i;
				count++;
			}
		}
	}
	
	out.print("<p>");
	if(count == 1) {
	
	arTemp = input.split("\\" + opers.charAt(temp));
	
	c = new Calc(Integer.parseInt(arTemp[0]), Integer.parseInt(arTemp[1]));
	
	switch(temp) {
	case 0:
		result = c.add();
		break;
	case 1:
		result = c.sub();
		break;
	case 2:
		result = c.mul();
		break;
	case 3:
		try {
			result = c.div();
		} catch (ArithmeticException e) {
			
		}
		break;
	}
	out.print("결과: " + result);
	}else if(count == 0) {
		out.print("연산자를 찾을 수 없습니다.");
	}else {
		out.print("두 정수의 연산만 가능합니다.");
	}
	out.print("</p>");
	out.print("<a href='calc'>jsp 페이지로 이동</a>");
	out.close();
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	
	}

}
