package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @RequestMapping Class(Type) + Hander(Method) 방식
 *
 */

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {

	@ResponseBody
	@RequestMapping("")
	public String list() {
		return "GuestbookController.list()";
	}
	
	@ResponseBody
	@RequestMapping("delete")
	public String delete() {
		return "GuestbookController.delete()";
	}
	
	@ResponseBody
	@RequestMapping("update")
	public String update() {
		return "GuestbookController.update()";
	}
	
}
