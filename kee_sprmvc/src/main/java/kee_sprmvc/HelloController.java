package kee_sprmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.*;
@Controller


public class HelloController 
{
	//@Request(value="/welcome",RequestMethod.GET)
	//@RequestMapping(method = RequestMethod.GET)
	@RequestMapping("/welcome")
	public ModelAndView pass()
	{
		String str="New input";
		return new ModelAndView("hello1","strmsg",str);
		
	}
	@RequestMapping("/hello")
	public String print(ModelMap mp)
	{
		//mp.addAttribute("msg","This is my first input");
		return "hello";
	}

}
