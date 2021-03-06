import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JPanel
{
	Patient newPatient;
	GridBagConstraints gbc = new GridBagConstraints();
    public Window()
    {
    	setLayout(new GridBagLayout());
    	gbc.gridx = 0;
    	gbc.gridy = 0;
    	gbc.weightx = 1;
    	gbc.weighty = 0;
    	gbc.gridwidth = 3;
    	gbc.gridheight = 1;
    	gbc.fill = GridBagConstraints.HORIZONTAL;
    	gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        setupLayout();
        Patient piggy = new Patient();
        Patient testCase = new Patient("Max Klimenko", 20, 6.1, 173, "Male", "540-746-7710",
			true);
        Patient dad = new Patient("Andrey Klimenko", 55, 5.11, 180, "Male", "540-830-1246",
			true);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 0.5;
        setUpPatient(piggy);
        setUpPatient(testCase);
        setUpPatient(dad);
    }

    /**
     * Setup and layout this PINPadWindow
     */
    private void setupLayout()
    {
        
        setUpMenu();
        setUpHeader();         

    }
    
    public void setUpMenu()
    {
        JMenuBar menu = new JMenuBar();
        JMenuItem newP = new JMenuItem("New Patient");
        newP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                NewPatientWindow();
              }
            });
        JMenuItem editP = new JMenuItem("Edit Patient");
        JMenuItem deleteP = new JMenuItem("Delete Patient");
        JMenuItem help = new JMenuItem("Help");
        menu.add(newP);
        menu.add(editP);
        menu.add(deleteP);
        menu.add(help);
        add(menu, gbc);
        
    }
    
    public void setUpHeader()
    {
    	gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton patName = new JButton("Patient Name");
        JButton phoneNum = new JButton("Phone Number");
        JButton status = new JButton("Status");
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridy = 2;
        add(patName, gbc);
        gbc.gridx = 1;
        add(phoneNum, gbc);
        gbc.gridx = 2;
        add(status, gbc);
    }
    
    public void setUpPatient(Patient patient)
    {
    	gbc.gridx = 0;
    	gbc.gridy++;
    	JButton info = new JButton(patient.getName());
    	info.setBackground(Color.WHITE);
    	add(info, gbc);
    	info = new JButton(patient.getPhoneNumber());
    	info.setBackground(Color.WHITE);
    	gbc.gridx++;
    	add(info, gbc);
    	String status = "HEALTHY";
    	if (!patient.getStatus())
    	{
    		status = "DANGER";
    	}
    	info = new JButton(status);
    	info.setBackground(Color.GREEN);
    	if (!patient.getStatus())
    	{
    		info.setBackground(Color.RED);
    	}
    	gbc.gridx++;
    	add(info, gbc);
    }
	
	public void NewPatientWindow()
	{
		JFrame jf = new JFrame();
		String[] status = { "Healthy", "Danger" };
		String[] genders = { "Male", "Female" };
		
		jf.setLayout(new GridLayout(0, 2));
	    jf.setSize(400, 300);
	    jf.setVisible(true);
	    jf.setTitle("New Patient");
	    
	    JTextField firstName = new JTextField("First Name");
	    JTextField lastName = new JTextField("Last Name");
	    JTextField age = new JTextField();
	    JTextField height = new JTextField("Ex. 6'7");
	    JTextField weight = new JTextField("lbs");
	    JTextField phoneNum = new JTextField("XXX-XXX-XXXX");
	    JComboBox<Object> selectGen = new JComboBox<Object>(genders);
	    JComboBox<Object> selectStat = new JComboBox<Object>(status);
	    JLabel label = new JLabel("Name: ");
	    label.setHorizontalAlignment(JLabel.LEFT);
	    jf.add(label);
	    jf.add(firstName);
	    jf.add(new JLabel());
	    jf.add(lastName);
	    label = new JLabel("Age: ");
	    label.setHorizontalAlignment(JLabel.LEFT);
	    jf.add(label);
	    jf.add(age);
	    label = new JLabel("Height: ");
	    label.setHorizontalAlignment(JLabel.LEFT);
	    jf.add(label);
	    jf.add(height);
	    label = new JLabel("Weight: ");
	    label.setHorizontalAlignment(JLabel.LEFT);
	    jf.add(label);
	    jf.add(weight);
	    label = new JLabel("Gender: ");
	    label.setHorizontalAlignment(JLabel.LEFT);
	    jf.add(label);
	    jf.add(selectGen);
	    label = new JLabel("Phone Number: ");
	    label.setHorizontalAlignment(JLabel.LEFT);
	    jf.add(label);
	    jf.add(phoneNum);
	    label = new JLabel("Status: ");
	    label.setHorizontalAlignment(JLabel.LEFT);
	    jf.add(label);
	    jf.add(selectStat);
	    
	    JButton submit = new JButton("Submit");
	    submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	String str = firstName.getText();
            	boolean works = str.matches("[a-zA-Z]+");
            	if (!works)
            	{
            		errorWin("First Name");
            	}
            	str = lastName.getText();
            	works = str.matches("[a-zA-Z]+");
            	if (!works)
            	{
            		errorWin("Last Name");
            	}
            	String patName = firstName.getText() + " " + lastName.getText();
            	int patAge = Integer.parseInt(age.getText());
            	double patHeight = Double.parseDouble(height.getText());
            	int patWeight = Integer.parseInt(weight.getText());
            	String patGen = (String)selectGen.getSelectedItem();
            	String patPhone = phoneNum.getText();
            	boolean patStat = selectStat.getSelectedItem().equals("Healthy");
            	newPatient = new Patient(patName, patAge, patHeight, patWeight, patGen, patPhone, patStat);
            	setUpPatient(newPatient);
            	jf.setVisible(false);
              }
            });
	    jf.add(submit);
	    JButton cancel = new JButton("Cancel");
	    jf.add(cancel);
	}
	
	public void errorWin(String errorField)
	{
		JOptionPane.showMessageDialog(null, "Improper Input in "+errorField+" Field");
	}
}


