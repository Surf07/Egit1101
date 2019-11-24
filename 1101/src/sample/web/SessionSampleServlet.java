
package sample.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionSample
 */
@WebServlet("/SessionSampleServlet")
public class SessionSampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		// セッションから"username"で格納された文字列を取得
		String username = (String)session.getAttribute("username");

		// セッションに"username"の名前で変数usernameの内容を格納
		session.setAttribute("username", username);

		// セッションIDの取得
		String id = session.getId();

		return;
	}
}
