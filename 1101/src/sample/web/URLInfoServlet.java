package sample.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class URLInfoServlet
 */
@WebServlet("/URLInfoServlet")
public class URLInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public URLInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// サーブレットパスの取得
		 String path = request.getServletPath();

		 // クエリ文字列の取得
		 String queryString = request.getQueryString();

		 // レスポンス情報の作成
		 PrintWriter out = response.getWriter();
		 out.print("<HTML>");
		 out.print("<BODY>");
		 out.print("ServletPath " + path);
		 out.print("<BR>");
		 out.print("QueryString " + queryString);
		 out.print("</BODY>");
		 out.print("</HTML>");
		 // 出力を閉じる
		 out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
