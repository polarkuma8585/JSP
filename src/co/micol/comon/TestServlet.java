package co.micol.comon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 브라우저와 서버간 전송구간 인코딩 타입 UTF-8로 정해줌.
		// 브라우저와 서버의 인코딩 타입이 UTF-8 이라도 네트워크 전송구간 인코딩 타입이 다르기 때문에 전송구간 인코딩 타입 역시 UTF-8로 맞춰줘야함.
		response.setContentType("text/html; charset=UTF-8"); //content type를 선행실행 해야 한글이 깨지지 않음.
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		System.out.println("Get 방식처리");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<p>입력된 ID = " + request.getParameter("id") + "<br />");
		out.print("입력된 PassWord = " + request.getParameter("pw") + "<p />");
		out.print("<a href='index.jsp'>홈으로 가기</a>");
		out.print("</body>");
		out.print("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
//		System.out.println("Post 방식으로 처리");
		
	}

}
