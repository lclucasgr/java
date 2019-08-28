package Control;

import javax.swing.SwingUtilities;

import View.MainFrame;

public class Main {

	public static void main(String[] args) {
		
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new MainFrame();

			}
		});
		

	}

}
