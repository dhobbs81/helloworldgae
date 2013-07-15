package com.hellowordgae.mdh;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HelloWorldGAEServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, Dynamic Confusion! And here's a demotivational quote:\nHe who chases rainbows may eventually catch tornadoes!!!");
	}
}
