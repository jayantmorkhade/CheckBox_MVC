package com.example.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mvc.Entity.Language;
import com.example.mvc.Entity.User;
import com.example.mvc.Service.ServiceImpl;

@Controller
public class UserController extends HttpServlet{
	@Autowired
	private ServiceImpl service;

	@RequestMapping(value = "/")
	public String loginpage() {
		return "front_Page";
	}

	@RequestMapping(value = "/adduserpage")
	public String adduser() {
		return "addUser";
	}

	@PostMapping(value = "/addUser")
	public String addUser(HttpServletRequest request, @ModelAttribute User user, Model model) {
//		String[] language= request.getParameterValues("language");
//		List<Language> languages=new ArrayList<>();
//		for (String languageId : language) {
////			Language lang=new 
//			
//			
//		}
		
		
// System.out.println(user.getLanguage());
		User user1 = service.getUsersByEmail(user.geteMail().toLowerCase());
		if (user1 == null) {

			user.seteMail(user.geteMail().toLowerCase());
			boolean saved = service.addUser(user);
			if (saved) {
				model.addAttribute("Status", "User " + user.getfName() + " added successfully");
				List<User> list = service.getUsers();
				model.addAttribute("Users", list);
				return "list_Of_User";
			} else {
				model.addAttribute("Status", "Something goes WRONG or User present Already, Try again!");

				List<User> list = service.getUsers();
				model.addAttribute("Users", list);
				return "list_Of_User";

			}
		} else {
			model.addAttribute("Status", user.geteMail() + " is allready Present,try with another E-Mail ID");
			return "addUser";
		}
	}

	@PostMapping(value = "/getuser")
	public String getUser(@RequestParam("userName") String eMail, Model model) {
		
		User user1 = service.getUsersByEmail(eMail);
		if (user1 != null) {
			model.addAttribute("user", user1);
			return "user";

		} else {
			model.addAttribute("msg", "Invalid Input");
			return "front_Page";
		}

	}

	@GetMapping(value = "/userlist")
	public String getUsers(Model model) {
		//System.out.println("i am in userlist");
		List<User> list = service.getUsers();
		model.addAttribute("Users", list);

		return "list_Of_User";
	}

	@GetMapping(value = "/delete")
	public String deleteUser(@RequestParam String userName, Model model) { 
		User user=service.getuser(userName);
		if(user!=null) {
		boolean flag = service.deleteUser(userName);

		if (flag) {
			List<User> list = service.getUsers();
			model.addAttribute("Users", list);
			model.addAttribute("status", "Deleted successfully");
			return "list_Of_User";
		} else {
			List<User> list = service.getUsers();
			model.addAttribute("Users", list);
			model.addAttribute("status", "User not Deleted Try again!");

			return "list_Of_User";
		}}
return"list_Of_User"; 
	}

	@GetMapping(value = "/updatepage")
	public String getDetails(@RequestParam String userName, Model model) {
		User user = service.getDetails(userName);
		model.addAttribute("user", user);
		return "update";
	}

	@PostMapping(value = "/update")
	public String updateUser(@ModelAttribute User user, Model model) {
		User user1 = service.getUsersByEmail(user.geteMail().toLowerCase());
		// System.out.println(user1+" getuser by mail id");
		if ((user1 == null)
				|| (user1.geteMail().equals(user.geteMail()) && (user1.getuserName().equals(user.getuserName())))) {

			boolean isUpdated = service.updateUser(user);
			if (isUpdated) {
				model.addAttribute("Status", "Updated");
				List<User> list = service.getUsers();
				model.addAttribute("Users", list);

				return "list_Of_User";
			} else {
				List<User> list = service.getUsers();
				model.addAttribute("Users", list);

				model.addAttribute("Status", "Failed to Update");
				return "list_Of_User";

			}

		} else {
			model.addAttribute("Status", user.geteMail() + " is allready Present, try with another E-Mail ID");
			List<User> list = service.getUsers();
			model.addAttribute("Users", list);

			return "list_Of_User";
		}

	}

}
