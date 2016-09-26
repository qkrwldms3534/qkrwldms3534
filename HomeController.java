package home.main.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/main")
public class HomeController {
	
	@RequestMapping(value="index.do")
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response, Model model){
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="mate.do")
	public ModelAndView mate(HttpServletRequest request, HttpServletResponse response, Model model){
		return new ModelAndView("mate");
	}
	
	
}
