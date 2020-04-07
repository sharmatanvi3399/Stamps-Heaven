package net.tanuStampbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.tanu.Stampbackend.dto.Category;
import net.tanuStampbackend.dao.CategoryDAO;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
 private static	List<Category> categories = new ArrayList<>();
	
	
 static{
	 
	 Category category = new Category();
	 
	 //adding first category
	
	 category.setId(1);
	 category.setName("Indian Stamps");
	 category.setDescription("This is some Indian Collection of Stamps !");
	 category.setImageURL("CAT_1.png");
	 
	 categories.add(category);
	 
	 
 category = new Category();
	 
	 //adding first category
	
	 category.setId(2);
	 category.setName("Abroad Stamps");
	 category.setDescription("This is some Abroad Collection of Stamps !");
	 category.setImageURL("CAT_2.png");
	 
	 categories.add(category);
	 
 category = new Category();
	 
	 //adding first category
	
	 category.setId(3);
	 category.setName("Other Stamps");
	 category.setDescription("This is some ther Collection of Stamps !");
	 category.setImageURL("CAT_3.png");
	 
	 categories.add(category);
	 
 }
 

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		
		// enchanced for loop
	
		for(Category category : categories){
			
			if(category.getId()== id) return category;
		}
		
		return null;
	}

}
