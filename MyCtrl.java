package sample.myproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sample.myproj.model.User;

@Controller
public class MyCtrl {
	
	
	
	@RequestMapping(value = "/Home")
	public ModelAndView goToHome(){
		
		ModelAndView hm = new ModelAndView("Home");
		return hm;
	}
@RequestMapping("/signup")
	public ModelAndView goToSucc(){
		ModelAndView mv=new ModelAndView("signup","command",new User());
		return mv;
	}

@RequestMapping("/signin")
public ModelAndView signin()
{
    ModelAndView hj=new ModelAndView("signin");
	return hj;
	
}
@RequestMapping("/category")
public ModelAndView category()
{
    ModelAndView fj=new ModelAndView("category");
	return fj;
	
}
@RequestMapping("/About us")
public ModelAndView aboutus()
{
    ModelAndView aj=new ModelAndView("About us");
	return aj;
	
}

@RequestMapping("/login")
public ModelAndView signup()
{
	ModelAndView lj=new ModelAndView("category");
	return lj;
	
}

	
/*@RequestMapping("/login")
public String signin(Model model)
{
	model.addAttribute("userClickedsignin","true");
	return "signin";	
}
*/

/*@RequestMapping("/validate")
public String validate(@RequestParam(name="userId") String id,
		@RequestParam(name="password") String pwd,
		Model model)
{
	if(id.equals("meena") && pwd.equals("me"))
	{
		model.addAttribute("Successmsg", "you have logged in");
		return "two";
	}
	else{
		
		model.addAttribute("errormessage","Invalid details...pls try again");
		return "two";
		
	}
	
}
*/
	
}
