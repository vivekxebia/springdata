package controller;


//@Controller
//public class PersonController {
//
//	@Autowired
//	private PersonRepository personRepository;
//	
////	public PersonController(PersonRepository personRepository){
////		this.personRepository=personRepository;				
////	}
//	
//	@RequestMapping("/")
//	public String index() {
//		return "index";
//	}
//	
//	@RequestMapping("/hello")
//	public String hello() {
//		return "hello";
//	}
//	@RequestMapping("/error")
//	public String error() {
//		return "Error from spring boot";
//	}
//
//	@RequestMapping("/create")
//	@ResponseBody
//	public String create(String firstName, String lastName, int age) {
//		try {
//			Person person= new Person(firstName,lastName,25);
//			personRepository.save(person);
//			//personRepository.save(null);
//		} catch (Exception e) {
//			return "Error Creating the User :"+e.toString();
//		}
//		return "User Successfully Created";
//	}
//	
//}
