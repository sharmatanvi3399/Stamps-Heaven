package net.tanu.StampsHeaven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.tanu.Stampbackend.dto.Category;
import net.tanuStampbackend.dao.CategoryDAO;


@Controller
public class PageController {
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value= {"/", "/home","/index"} )
	public ModelAndView index( ){
	
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title", "Home");
	// Passing the list of categories
	mv.addObject("categories", categoryDAO.list() );
	mv.addObject("userClickHome", true);
	return mv;
	
	}
	
	@RequestMapping(value= "/about" )
	public ModelAndView  about( )  {
	
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title", "About Us");
	mv.addObject("userClickAbout", true);
	return mv;
	
	}
	@RequestMapping(value= "/contact" )
	public ModelAndView  contact( )  {
	
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title", "Contact Us");
	mv.addObject("userClickContact", true);
	return mv;
	
	}
	
	/*
	 * Methods to load all the Stamps and base on category
	 * 
	 */

	@RequestMapping(value= "/show/all/stamps" )
	public ModelAndView showAllStamps( ){
	
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title", "All Stamps");
	// Passing the list of categories
	mv.addObject("categories", categoryDAO.list() );
	mv.addObject("userClickAllStamps", true);
	return mv;
	
	}	
	@RequestMapping(value= "/show/category/{id}/stamps" )
	public ModelAndView showCategoryStamps(@PathVariable("id") int id){
	
	ModelAndView mv = new ModelAndView("page");
	// categoryDAO to fetch a single category
	Category category = null;
	
	category= categoryDAO.get(id);
	mv.addObject("title", category.getName());
	// Passing the list of categories
	mv.addObject("categories", categoryDAO.list() );
	
	//pasing the single category object
	
	mv.addObject("category", category );
	mv.addObject("userClickCategoryStamps", true);
	return mv;
	
	}			
	
}
