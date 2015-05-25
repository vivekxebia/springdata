package controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class GreetingController extends WebMvcConfigurerAdapter {
	
	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		//registry.addViewController("/advice").setViewName("beeradvice");
		registry.addViewController("/notadded").setViewName("notAddedPerson");
			
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/myform")
	public String greeting(Model model) {
		model.addAttribute("beer", new Beer());
		//System.out.println();
		System.out.println("Hello in myform ");
		return "form";
	}
	
	@RequestMapping("/adddetails")
	public String addPerson(Model model){
		System.out.println("Add a person Object to Details Form");
		model.addAttribute("person", new Person());
		return "addperson";
	}
	
	@RequestMapping(value = "/AddPerson", method = RequestMethod.POST)
	public String addPersonSubmit(@ModelAttribute Person person, Model model) throws Exception {
			model.addAttribute("nPerson", person);
			personRepository.save(person);
			System.out.println("Person with details added to database "+person);
				return "result";

	}


	@RequestMapping(value = "/BeerSelection", method = RequestMethod.POST)
	public String beerChoiceSubmit(@ModelAttribute Beer beer, Model model, BindingResult bindingResult) {
		
		model.addAttribute("beer", beer);
		return "added";

	}

}