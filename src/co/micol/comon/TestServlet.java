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
		request.setCharacterEncoding("UTF-8"); // �������� ������ ���۱��� ���ڵ� Ÿ�� UTF-8�� ������.
		// �������� ������ ���ڵ� Ÿ���� UTF-8 �̶� ��Ʈ��ũ ���۱��� ���ڵ� Ÿ���� �ٸ��� ������ ���۱��� ���ڵ� Ÿ�� ���� UTF-8�� ���������.
		response.setContentType("text/html; charset=UTF-8"); //content type�� ������� �ؾ� �ѱ��� ������ ����.
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		System.out.println("Get ���ó��");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<p>�Էµ� ID = " + request.getParameter("id") + "<br />");
		out.print("�Էµ� PassWord = " + request.getParameter("pw") + "<p />");
		out.print("<a href='index.jsp'>Ȩ���� ����</a>");
		out.print("</body>");
		out.print("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
//		System.out.println("Post ������� ó��");
		
	}

}
