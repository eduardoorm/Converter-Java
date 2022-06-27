import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Converter {
	String[] optionsConverts= {
				"De Pesos a Dólar",
				"De Pesos a Euro",
				"De Pesos a Libras",
				"De Pesos a Yen",
				"De Pesos a Won Coreano",
				"De Dólar a Pesos",
				"De Euro a Pesos",
				"De Libras a Pesos"
				};
	
	public void selectToConvert(int input) {
		Money money = new Money();
		String moneyConverted;
		String option = InputDialog("Elige lo que quieres hacer", "Elegir", optionsConverts);
		moneyConverted = convertTo(input, option);
		showMessage(moneyConverted);
		toContinue();
	}
	
	
	
	public String InputDialog(String label, String title ,String [] options) {
		String option = (String) JOptionPane.showInputDialog(
				null,
				label,
				title,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[0]);
		return option;
	}
	
	
	public String convertTo(double money,String option) {
		DecimalFormat df = new DecimalFormat("###.##");
		Money value = new Money();
		double totalMoney=0;
		String type = "Soles";
		switch (option) {
		case "De Pesos a Dólar":
			totalMoney= money/value.getValueDolar();
			type="Dolar";
			break;
		case "De Pesos a Euro": 
			totalMoney= money/value.getValueEuro();	
			type="Euros";
			break;
		case "De Pesos a Libras": 
			totalMoney= money/value.getValueLibras();
			type="Libras";
			break;
		case "De Pesos a Yen": 
			totalMoney= money/value.getValueToYen();
			type="Yen";
			break;
		case "De Pesos a Won Coreano": 
			totalMoney= money/value.getValueWonCoreano();	
			type="Won Coreano";
			break;
		case "De Dólar a Pesos": 
			totalMoney= money*value.getValueDolar();
			break;
		case "De Euro a Pesos": 
			totalMoney= money*value.getValueEuro();
			break;
		case "De Libras a Pesos": 
			totalMoney= money*value.getValueLibras();
			break;
		default:
		}	
		
		return "Tienes $"+df.format(totalMoney)+type;
	}

	
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(null,message);
	}
	
	public void toContinue() {
		int toContinue = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
		if(toContinue!=0) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}else {
			Menu menu = new Menu();
			menu.selectOptionMenu();
		}
	}

	
}
