package sample.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// JSPへ渡すオブジェクトを作成
		 String message = "JSPへ渡すメッセージ";
		 String message2 = "JSPへ渡されないメッセージ";

		 // リクエスト属性へ"message"の名前で格納
		 request.setAttribute("message", message);

		// RequestDispatcherを取得し、JSPへフォワードする。
		 RequestDispatcher rd = request.getRequestDispatcher("/SimpleJSP.jsp");

		 rd.forward(request,response);
	}
	}


