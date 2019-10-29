package co.micol.comon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ArrayTest")
public class ArrayTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ArrayTest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//		doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String hobby[] = request.getParameterValues("hobby");
		String gender = request.getParameter("gender");
		
		// 데이터 처리 작성 및 돌려보낼 페이지 만들기
		response.setContentType("text/html; charset=UTF-8");
//		response.setCharacterEncoding("UTF-8");
		PrintWriter out  = response.getWriter();
		out.print("이름: " + name + "<br />");
		out.print("나이: " + age + "<br />");
		out.print("취미 : ");
		for(int i =0 ; i <hobby.length; i++) {
			out.print(hobby[i] + " ");
		}
		out.print("<br /> 성별: " + gender+ "<br />");
		out.print("<a href='index.jsp'>홈으로 가기</a>");
	}

}
