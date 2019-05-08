///**
//	 * Class Name:	ComboBoxExample
//	 * Purpose:		This class demonstrates how to use a JComboBox and JTextField. It allows the user to input a first and last name into the textfields and adds/removes the name from a JList, depending on the combobox option that's chosen.
//	 * Coder:		Madhavi Mohan
//	 * Date:		March 5, 2019
//*/
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class ComboBoxExample extends JFrame{
//
//	JTextField firstName, lastName;
//	private JComboBox<String> cboOptions;
//	JList list;
//
//	//Note that this a model that stores the data to be outputted in the list
//	//This is not an actual GUI object that's seen by the user - just the thing that stores data
//	//It functions similarly to an arraylist, except that it's used specifically for the JList object
//	private DefaultListModel<String> data = new DefaultListModel<String>();
//
//	ComboBoxExample()
//	{
//		super("Name generator");
//
//		//boilerplate
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setSize(500, 500);
//		this.setLocationRelativeTo(null);
//		this.setLayout(new GridLayout(1,2));
//		this.setVisible(true);
//
//		//This sets up the layout for each of the GUI elements
//		//On the left we have the input textboxes, labels, and dropdown list (combobox)
//		//On the right we have the output list
//		JPanel leftPanel = new JPanel();
//		leftPanel.setLayout(new GridLayout(2,1));
//		this.add(leftPanel);
//
//		//These break the left panel into to halves
//		JPanel topPanel = new JPanel();
//		JPanel bottomPanel = new JPanel();
//
//		topPanel.setLayout(new GridLayout(2,2));
//
//		leftPanel.add(topPanel);
//		leftPanel.add(bottomPanel);
//
//		firstName = new JTextField();
//		lastName = new JTextField();
//
//		JLabel firstLabel = new JLabel("First name: ");
//		JLabel lastLabel = new JLabel("Last name: ");
//
//		topPanel.add(firstLabel);
//		topPanel.add(firstName);
//		topPanel.add(lastLabel);
//		topPanel.add(lastName);
//
//		//This array stores the data to be displayed in the comboBox
//		//In this case, there are only two options: one to add a name to the list, and one to remove a name from the list
//		String [] options = {"Add name", "Remove name"};
//
//		//This instantiates the combobox with the options from above
//		cboOptions = new JComboBox<String>(options);
//
//		//This sets the default option to the first one ("add name")
//		cboOptions.setSelectedIndex(0);
//
//		//This adds the private class we've created below as the actionlistener for the combobox
//		cboOptions.addActionListener(new comboListener());
//		bottomPanel.add(cboOptions);
//
//		list = new JList();
//
//		JPanel rightPanel = new JPanel();
//		this.add(rightPanel);
//		rightPanel.add(list);
//
//		//This resizes the frame's components so they all fit on the frame (that way you don't have to resize it to see everything)
//		this.pack();
//	}
//
//	//This listener is attached to the combobox
//	private class comboListener implements ActionListener
//	{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//
//		try {
//
//			//Get the input from the user
//			String firstNameString = firstName.getText();
//			String lastNameString = lastName.getText();
//
//			//Check that the input isn't empty, throw an exception if it is
//			checkNames(firstNameString, lastNameString);
//
//			//Get the current selected option from the comboBox/dropdown list
//			String selected = (String) cboOptions.getSelectedItem();
//
//			//If they chose add name, add the current input to the data defaultlistmodel, otherwise remove the input
//			if (selected.equals("Add name"))
//			{
//				data.addElement(firstNameString + " " + lastNameString);
//			}
//			else
//			{
//				data.removeElement(firstNameString + " " + lastNameString);
//			}
//
//			//Update the current list with the newly updated defaultlistmodel
//			list.setModel(data);
//		}
//		catch(EmptyException ex)
//		{
//			System.out.println(ex.getMessage());
//		}
//
//	}
//	}
//
//	//This checks if one of the inputs are empty, and if so it throws the exception defined in the other java file
//	public void checkNames(String s, String s2) throws EmptyException
//	{
//		if (s.isEmpty() || s2.isEmpty())
//		{
//			throw new EmptyException();
//		}
//	}
//
//	public static void main(String[] args)
//	{
//		new ComboBoxExample();
//	}
//
//}
