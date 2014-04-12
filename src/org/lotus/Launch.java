package org.lotus;

import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.SwingUtilities;;

public class Launch {

    public static void main(String[] args) {

		Runnable work = new Runnable() {
			@Override
			public void run() {
				Color color = JColorChooser.showDialog(null, null, null);
				if (null != color) {
					System.out.printf("Color choosed: %s%n", color);
				} else {
					System.out.println("Color was not chosen !");
				}
			}
		};

		// create thread for this work(optional but recommended)
		SwingUtilities.invokeLater(work);
    }
}
