package kee_sprmvc;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class EmployeeController
{
	@RequestMapping("/connect")
	public String display(Model m)
	{
		m.addAttribute("emp", new Employee());
		return "viewpage"; 
		
	}
	@RequestMapping("/connectagain")
	public String submitting(@Valid @ModelAttribute("emp") Employee e, BindingResult br)
	{
		if(br.hasErrors()) 
		{
			return "viewpage";
		}
		else
		{
			return "final";
		}
	}
	

	
}
