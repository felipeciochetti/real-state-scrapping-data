package tool;

import model.Data;
import model.Parameters;
import service.DataService;

public class Teste {
	

	DataService data = new DataService("");
	
	
	
	
	public static void main(String[] args) {
		
		Teste teste = new Teste();
		
		teste.test_generate_sheet();
		
		
	}
	
	
	
	
	public void test_generate_sheet() {
		
		Parameters parameters = Parameters.getInstance();
		
		parameters.setPath_xls("/Users/luizciochetti/realstate");
		addData();
		data.gerarPlanilha();
		
		System.out.println(parameters.getLog());
		
	}
	
	public void addData() {
		
		
		
		for (int i = 0; i < 20; i++) {
			
			data.add_Data("street " + i, "owner " + i, i + " ", i + " " );
		}
		
		
	}
			
}
