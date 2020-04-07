package net.tanuStampbackend.dao;

import java.util.List;

import net.tanu.Stampbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id) ;
	
	
	
	
}
