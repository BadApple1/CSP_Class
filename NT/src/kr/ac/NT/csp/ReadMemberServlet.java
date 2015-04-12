package kr.ac.NT.csp;

import java.io.IOException; 
import java.util.List; 
import javax.servlet.http.*; 
 

public class ReadMemberServlet extends HttpServlet{ 
 	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
 			throws IOException { 
 		String name = req.getParameter("name"); 
 		 
 		List<Member> namedMemberList = MemberManager.getMemberByName(name); 
 		Member m = namedMemberList.get(0); 
 		 
 		resp.setCharacterEncoding("UTF-8"); 
 		resp.setContentType("text/plain");  
 		 
 		resp.getWriter().println("<html>"); 
 		resp.getWriter().println("<body>"); 
 		resp.getWriter().println("이름 : "+m.getName() +"<br>"); 
 		resp.getWriter().println("학번 : "+m.getStuid() +"<br>"); 
 		resp.getWriter().println("전화번호 : "+m.getPhone() +"<br>"); 
 		resp.getWriter().println("이메일 : "+m.getEmail() +"<br>"); 
 		resp.getWriter().println("카카오톡 : "+m.getKakao() +"<br>"); 
 		resp.getWriter().println("gitid : "+m.getGitid() +"<br>");
 		if(m.getLeader() == null)
			resp.getWriter().println("팀장 아님");
		else
			resp.getWriter().println("팀장");
 		
 		resp.getWriter().println("</body>"); 
 		resp.getWriter().println("</html>");
 		 
 	} 
 
 
} 

