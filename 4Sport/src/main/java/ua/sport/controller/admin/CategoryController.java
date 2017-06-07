package ua.sport.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import ua.sport.entity.Category;
import ua.sport.service.CategoryService;

@Controller
@RequestMapping("/admin/category")
@SessionAttributes("category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("categories", categoryService.findAll());
		return "admin-category";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		categoryService.delete(id);
		return "redirect:/admin/category";
	}
	
	@RequestMapping(method=POST)
	public String save(@RequestParam Category category){
		//�������� � ����� ��� ����������
		//��'���� Category
		categoryService.save(category);
		//���� ���� ������ � ������� ������� 
		//������� ������ �������, ��� ��������
		//�������� �������� �����
		//���� �������� �� ��������� ������ �������
		return "redirect:/admin/category";
	}
}