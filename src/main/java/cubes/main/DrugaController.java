package cubes.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/a")
public class DrugaController {
	@RequestMapping("/b")
	public String getDrugaPage(Model model) {
		model.addAttribute("str", "BRANKO");
		return "druga";
	}
	
	@RequestMapping("/c")
	public String getDrugaPage(@RequestParam("ind") int ind, Model model) {
		String result = "";
		if(ind==1) {
			result="ANA";
		}
		else 
			if(ind==2) {
				result="ACA";
			}			
			else {
				result="BORA";
			}
		model.addAttribute("result", result);
		return "druga";
	}
	
	@RequestMapping("/d")
    String getDrugaPage(@RequestParam("ind") int ind, @RequestParam("zan") String zan, Model model) {
		String result = "";
		if(ind==1) {
			result="ANA";
		}
		else 
			if(ind==2) {
				result="ACA";
			}			
			else {
				result="BORA";
			}
		result = result + " je " + zan;
		model.addAttribute("result", result);
		return "druga";
	}
}
