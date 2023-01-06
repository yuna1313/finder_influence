package com.finder.influence.controller.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CommonViewController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginView(@RequestParam Map<String, Object> input, HttpServletRequest req) throws Exception {
		ModelAndView mv = new ModelAndView("view/common/login");
		return mv;
	}
}
