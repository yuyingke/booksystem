package app.run.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller("bookController")
@RequestMapping("/")
public class BookController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView getMovieJson(@RequestParam(name="bookSn", required=false, defaultValue="2210031") String bookSn) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("book", "hello");
		modelAndView.setView(new MappingJackson2JsonView());
		return modelAndView;
	}
}
