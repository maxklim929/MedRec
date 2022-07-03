import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NewPatientWindow{



//	
//	public NewPatientWindow()
//	{
//		jf.setLayout(new GridLayout(0, 2));
//	    jf.setSize(400, 300);
//	    jf.setVisible(true);
//	    jf.setTitle("New Patient");
//	    
//	    JTextField firstName = new JTextField("First Name");
//	    JTextField lastName = new JTextField("Last Name");
//	    JTextField age = new JTextField();
//	    JTextField height = new JTextField("Ex. 6'7");
//	    JTextField weight = new JTextField("lbs");
//	    JTextField phoneNum = new JTextField("XXX-XXX-XXXX");
//	    JComboBox<Object> selectGen = new JComboBox<Object>(genders);
//	    JComboBox<Object> selectStat = new JComboBox<Object>(status);
//	    JLabel label = new JLabel("Name: ");
//	    label.setHorizontalAlignment(JLabel.LEFT);
//	    jf.add(label);
//	    jf.add(firstName);
//	    jf.add(new JLabel());
//	    jf.add(lastName);
//	    label = new JLabel("Age: ");
//	    label.setHorizontalAlignment(JLabel.LEFT);
//	    jf.add(label);
//	    jf.add(age);
//	    label = new JLabel("Height: ");
//	    label.setHorizontalAlignment(JLabel.LEFT);
//	    jf.add(label);
//	    jf.add(height);
//	    label = new JLabel("Weight: ");
//	    label.setHorizontalAlignment(JLabel.LEFT);
//	    jf.add(label);
//	    jf.add(weight);
//	    label = new JLabel("Gender: ");
//	    label.setHorizontalAlignment(JLabel.LEFT);
//	    jf.add(label);
//	    jf.add(selectGen);
//	    label = new JLabel("Phone Number: ");
//	    label.setHorizontalAlignment(JLabel.LEFT);
//	    jf.add(label);
//	    jf.add(phoneNum);
//	    label = new JLabel("Status: ");
//	    label.setHorizontalAlignment(JLabel.LEFT);
//	    jf.add(label);
//	    jf.add(selectStat);
//	    
//	    JButton submit = new JButton("Submit");
//	    submit.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent ev) {
//            	String str = firstName.getText();
//            	boolean works = str.matches("[a-zA-Z]+");
//            	if (!works)
//            	{
//            		errorWin("First Name");
//            	}
//            	str = lastName.getText();
//            	works = str.matches("[a-zA-Z]+");
//            	if (!works)
//            	{
//            		errorWin("Last Name");
//            	}
//            	String patName = firstName.getText() + " " + lastName.getText();
//            	int patAge = Integer.parseInt(age.getText());
//            	double patHeight = Double.parseDouble(height.getText());
//            	int patWeight = Integer.parseInt(weight.getText());
//            	String patGen = (String)selectGen.getSelectedItem();
//            	String patPhone = phoneNum.getText();
//            	boolean patStat = selectStat.getSelectedItem().equals("Healthy");
//            	newPatient = new Patient(patName, patAge, patHeight, patWeight, patGen, patPhone, patStat);
//            	setUpPatient(newPatient);
//            	jf.setVisible(false);
//              }
//            });
//	    jf.add(submit);
//	    JButton cancel = new JButton("Cancel");
//	    jf.add(cancel);
//	    
//	}
//	
//
//	
//	public Patient getPatient()
//	{
//		return newPatient;
//	}
	
}
