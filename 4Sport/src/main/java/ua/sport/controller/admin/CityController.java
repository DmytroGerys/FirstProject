package ua.sport.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import ua.sport.entity.City;
import ua.sport.service.CityService;

@Controller
@RequestMapping("/admin/city")
public class CityController {

	@Autowired
	private CityService cityService;
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("city", cityService.findAll());
		return "admin-city";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		cityService.delete(id);
		return "redirect:/admin/city";
	}
	
	@RequestMapping(method=POST)
	public String save(@RequestParam City city){
		cityService.save(city);
		return "redirect:/admin/city";
	}
	
	
}
