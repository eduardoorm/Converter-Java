import javax.swing.JOptionPane;

public class InputMoney {
	public int validateInput() {
		Converter converter = new Converter();
		int input=0;
		boolean inputErr = true;
		do {
			try {
				String quantityMoney = JOptionPane.showInputDialog(null,"Ingresa la cantidad de dinero que deseas convertir");
				input = Integer.parseInt(quantityMoney);
				inputErr=false;
				converter.selectToConvert(input);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor no válido");
			}
		} while (inputErr);
		
		return input;
	}
}
