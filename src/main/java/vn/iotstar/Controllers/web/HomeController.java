package vn.iotstar.Controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	@GetMapping("/admin/home")
	public String index() {
		return "web/home";
	}
}