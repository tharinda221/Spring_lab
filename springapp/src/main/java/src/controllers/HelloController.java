package src.controllers;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import src.models.greetMsgModel;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello" ,method = RequestMethod.GET)
	public String helloWorld(Model model) {

//		ModelAndView home = new ModelAndView("home");
//
//		home.addObject("greet", new greetMsgModel());

//		return home;
		model.addAttribute("greet", new greetMsgModel());
		return "simpleForm";
	}
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public ModelAndView greetingForm(@ModelAttribute("greet") greetMsgModel greet, Model model) {

		ModelAndView home = new ModelAndView("home");

		home.addObject("greet", greet);

		return home;
//		return "home";
	}



}