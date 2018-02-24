package SER516_Lab2_Client;


import SER516_Lab2_Client.UIComponents.ClientUI;

import java.awt.*;

class ClientMain {



	public static void initialiseGUI()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientUI window = new ClientUI();
					window.pack();
					window.setVisible(true);
				} catch (Exception e) {
					String errorMessage = "ClientUI not set.";
					Handlers.getInstance().displayConsoleMessage(errorMessage);
				}
			}
		});
	}

	public static void main(String[] args){

		initialiseGUI();
	}


}