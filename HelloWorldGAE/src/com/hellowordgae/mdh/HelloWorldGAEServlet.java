package com.hellowordgae.mdh;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HelloWorldGAEServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, Dynamic Confusion! And here's a demotivational quote:\nHe who chases rainbows may eventually catch tornadoes!!!");
		resp.getWriter().println("Hello, Dynamic Confusion! And here's a demotivational quote:\nLife is like a box of chocolates. It doesn't last as long for fat people.");
		resp.getWriter().println("\\m/ Long Live Metal! \\m/!");
	}
}
