package com.duoduo.app.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.duoduo.system.Constants;
import com.duoduo.system.security.SessionUser;
import com.duoduo.system.security.UserContext;
import com.duoduo.system.service.ResourceService;
import com.duoduo.system.vo.ResourceVO;

@Controller
public class AppController {

	private String homePage = "/home";

	@Resource
	private ResourceService resourceService;

	@RequestMapping("/home")
	public String toHome(HttpServletRequest request, ModelMap model) {
		SessionUser currentUser = UserContext.getCurrentUser();
		List<ResourceVO> allMenus = resourceService.listByUserId("" + currentUser.getUser().getId());
		model.addAttribute("currentUser", currentUser);
		model.addAttribute("rootMenuId", Constants.ROOT_MENU_ID);
		model.addAttribute("allMenus", JSONArray.fromObject(allMenus).toString());
		return homePage;
	}
}
