package helpersbaseservlet;

import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class BaseServlet
 * @author shulu
 */
@WebServlet(loadOnStartup=1)
public class BaseServlet extends HttpServlet {
 @Override
public void init(){
	WebApplicationContextUtils.getWebApplicationContext(this.getServletContext()).getAutowireCapableBeanFactory().autowireBean(this);
}

}
