
import java.awt.BorderLayout;

import javax.swing.*;  
public class MyApp {
	public static void main(String[] args) {
		//Creating the Frame
		FrameMoney frameMoney = new FrameMoney();
		frameMoney.generateFrame();
		Menu menu = new Menu();
		menu.selectOptionMenu();
	}

}
