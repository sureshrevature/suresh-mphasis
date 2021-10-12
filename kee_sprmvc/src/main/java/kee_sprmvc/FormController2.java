package kee_sprmvc;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.*;
@Controller
public class FormController2
{
	@RequestMapping("/keerthi")
	public String Admin(HttpServletRequest request,Model val)
	
	{
		
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String pno=request.getParameter("pno");
		if(user.equals("admin") && pass.equals("admin"))
		{
			val.addAttribute("welcome","welcome successfully logged in!!!");
			
			return "correct";			
		}
		else
		{
			val.addAttribute("Error","User and password are not authenticated");
			return "error";
		}
		
	}

}
