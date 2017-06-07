package ua.sport.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.sport.entity.Commodity;
import ua.sport.service.CommodityService;

public class CommodityValidator implements Validator{

	private final CommodityService commodityService;

	public CommodityValidator(CommodityService ingredientService) {
		this.commodityService = ingredientService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return Commodity.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Commodity ingredient = (Commodity) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Can't be empty");
		if(commodityService.findByName(ingredient.getName())!=null){
			errors.rejectValue("name", "", "Already exist");
		}
	}
}