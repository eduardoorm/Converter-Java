import javax.swing.JOptionPane;

public class Menu {
	public void  selectOptionMenu() {
		InputMoney input = new InputMoney();
		String[] optionsMenu= {"Conversor de Moneda","Conversor de Termperatura"};
		String option = (String)JOptionPane.showInputDialog(null,
				"Selecciona una opción de conversión","Selector de opciones",JOptionPane.QUESTION_MESSAGE,null,
				optionsMenu,optionsMenu[0]);
		
		switch (option) {
		case "Conversor de Moneda": 
			input.validateInput();
			break;
		}
	
	}
}
