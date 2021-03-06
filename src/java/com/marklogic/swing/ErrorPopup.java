/*
 * Copyright (c)2004 Mark Logic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The use of the Apache License does not indicate that this project is
 * affiliated with the Apache Software Foundation.
 */
package com.marklogic.swing;

import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Created by IntelliJ IDEA.
 * User: ron
 * Date: Aug 2, 2004
 * Time: 11:03:43 AM
 */
public class ErrorPopup extends JDialog
{
	private JTextArea textArea;
	private JButton okButton;
	private JLabel titleLabel;
	private JPanel outerRing;
	private JPanel rootPanel;

	public ErrorPopup (JComponent parent, String title, String text)
	{
		okButton.addActionListener (new OkButtonListener());

		titleLabel.setText (title);
		textArea.setText (text);

		outerRing.setBackground (Color.RED);

		setContentPane (rootPanel);
		pack();
		setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

		setLocation ((parent.getWidth() - getWidth()) / 2,
			(parent.getHeight() - getHeight()) / 2);

		setLocationRelativeTo (parent);

	}

	public static void popError (JComponent parent, String title, String body)
	{
		JDialog popup = new ErrorPopup (parent, title, body);

		popup.show();
	}

	{
// GUI initializer generated by IntelliJ IDEA GUI Designer
// !!! IMPORTANT !!!
// DO NOT EDIT OR ADD ANY CODE HERE!
		$$$setupUI$$$ ();
	}

	/**
	 * Method generated by IntelliJ IDEA GUI Designer
	 * !!! IMPORTANT !!!
	 * DO NOT edit this method OR call it in your code!
	 */
	private void $$$setupUI$$$ ()
	{
		rootPanel = new JPanel ();
		rootPanel.setLayout (new GridLayoutManager (3, 1, new Insets (10, 8, 12, 8), -1, -1));
		final JPanel panel1 = new JPanel ();
		panel1.setLayout (new GridLayoutManager (1, 1, new Insets (0, 0, 0, 0), -1, -1));
		rootPanel.add (panel1, new GridConstraints (2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null));
		final JPanel panel2 = new JPanel ();
		panel2.setLayout (new GridLayoutManager (1, 3, new Insets (25, 0, 0, 0), -1, -1));
		panel1.add (panel2, new GridConstraints (0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null));
		final Spacer spacer1 = new Spacer ();
		panel2.add (spacer1, new GridConstraints (0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null));
		okButton = new JButton ();
		okButton.setText ("OK");
		panel2.add (okButton, new GridConstraints (0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null));
		final Spacer spacer2 = new Spacer ();
		panel2.add (spacer2, new GridConstraints (0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null));
		outerRing = new JPanel ();
		outerRing.setLayout (new GridLayoutManager (1, 1, new Insets (0, 0, 0, 0), -1, -1));
		rootPanel.add (outerRing, new GridConstraints (1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null));
		outerRing.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (), null));
		final JPanel panel3 = new JPanel ();
		panel3.setLayout (new GridLayoutManager (1, 1, new Insets (0, 0, 0, 0), -1, -1));
		outerRing.add (panel3, new GridConstraints (0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension (300, -1), null, null));
		panel3.setBorder (BorderFactory.createTitledBorder (BorderFactory.createEtchedBorder (), null));
		textArea = new JTextArea ();
		textArea.setEditable (false);
		panel3.add (textArea, new GridConstraints (0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension (150, 50), null));
		titleLabel = new JLabel ();
		titleLabel.setHorizontalAlignment (0);
		titleLabel.setText ("Error");
		rootPanel.add (titleLabel, new GridConstraints (0, 0, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null));
	}

	private class OkButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			setVisible (false);
			dispose();
		}
	}

}
