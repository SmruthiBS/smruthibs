package com.xworkz.pizza.service.helmet;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.Type;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.helmet.HelmetRepository;

public class HelmetServiceImplimentation implements HelmetService {
	private HelmetRepository repo;

	public HelmetServiceImplimentation(HelmetRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean saveAndVlidate(HelmetDTO dto) {
		String brand = dto.getBrand();
		Color colour = dto.getColour();
		Type type = dto.getType();
		Double price = dto.getPrice();
		boolean validBrand = false;
		boolean validType = false;
		boolean validColour = false;
		boolean validPrice = false;
		if (brand != null && brand.length() >= 4 && brand.length() <= 15) {
			System.out.println("brand is valid " + brand);
			validBrand=true;
		
			//System.out.println("brand is created");
		} else {
			System.out.println("brand is invalid " + brand);

		}
		if (type != null) {
			System.out.println("type is valid " + type);
			validType=true;
		} else {
			System.out.println("type is invalid " + type);
		}
		if (colour != null) {
			System.out.println("colour is valid " + colour);
			 validColour = true;
		} else {
			System.out.println("colour is invalid ");
		}
		if (price != null && price >50 && price < 1000) {
			System.out.println("price is valid " + price);
			
			validPrice=true;
		} else {
			System.out.println("price is invalid " + price);
		}

		if (validBrand && validType && validPrice && validColour) {
			boolean save = repo.save(dto);
			System.out.println("Helmet DTO is valid and can be saved using helmentRepository" + save);

			return true;
		} else {
			System.out.println("Helmet DTO is invalid and cannot be saved");
			return false;
		}
	}
}
