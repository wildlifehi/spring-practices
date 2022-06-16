package com.douzone.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.guestbook.repository.GuestbookRepository;
import com.douzone.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController {

	@Autowired
	private GuestbookRepository guestbookRepository;
	
	@RequestMapping("")
	public String index(Model model) {
		List<GuestbookVo> list = guestbookRepository.findAll();
		model.addAttribute("list", list);
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String index2(Model model) {
		List<GuestbookVo> list = guestbookRepository.findAll();
		model.addAttribute("list", list);
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping(value="/delete/{no}", method=RequestMethod.GET)
	public String delete(@PathVariable("no") Long no, Model model) {
		model.addAttribute("no", no);

		return "/WEB-INF/views/delete.jsp";
  	}
	
	@RequestMapping(value="/delete/{no}", method=RequestMethod.POST)
	public String delete(@PathVariable("no") Long no, String password) {
		
		return "redirect:/";
  	}

	
	
//	@RequestMapping("")
//	public String index(Model model) {
//		List<EmaillistVo> list = emaillistRespository.findAll();
//		model.addAttribute("list", list);
//		return "/WEB-INF/views/index.jsp";
//	}
//	

//	
//	@RequestMapping(value="/add", method=RequestMethod.POST)
//	public String add(EmaillistVo vo) {
//		emaillistRespository.insert(vo);
//		return "redirect:/";
//		
//	}
	

}


/*
 * 
 * 1) index
GET /guestbook                     - list 할 때, 
> index.jsp로 


2) delete(@PathVariable("no") Long on)
GET /guestbook/delete/10        - deleteform 할 때, 
> delete.jsp로 forward 작업

3) delete(
		@PathVariable("no") Long on,
		@RequestParam(value="password", required=true, defaultValue="") String password)
POST /guestbook/delete/5        - delete 할 때
redirect:/ 작업


4) insert
POST /guestbook                   - insert할 때,
redirect:/
 * 
 */
