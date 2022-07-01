import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Window extends JPanel
{
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
        Patient testCase = new Patient("Max", 20, 6.1, 173, "male", "540-746-7710",
			true);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 0.5;
        setUpPatient(piggy);
        setUpPatient(testCase);
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
        JMenu newP = new JMenu("New Patient");
        JMenu editP = new JMenu("Edit Patient");
        JMenu deleteP = new JMenu("Delete Patient");
        menu.add(newP);
        menu.add(editP);
        menu.add(deleteP);
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
	
	
}


