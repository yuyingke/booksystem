package app.run.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import app.run.entity.Book;
import app.run.service.BookServise;

@Controller("bookController")
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookServise bookServise = null;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView getMovieJson(@RequestParam(name="bookSn", required=false, defaultValue="2210031") String bookSn) {
		
		
		
		Book book = bookServise.getBook(bookSn);
		System.out.println(bookSn);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("book", book);
		modelAndView.setView(new MappingJackson2JsonView());
		return modelAndView;
	}
}
