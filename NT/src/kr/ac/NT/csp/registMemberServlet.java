package kr.ac.NT.csp;

import java.io.IOException;

import javax.servlet.http.*;


@SuppressWarnings("serial")
public class registMemberServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		String name = req.getParameter("name");
		String stuid = req.getParameter("stuid");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String kakao = req.getParameter("kakao");
		String leader = req.getParameter("leader");
		String gitid = req.getParameter("gitid");
		
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		
		Member m = MemberManager.addMember(name, stuid, phone, email, kakao, leader, gitid);
		
	}
}
