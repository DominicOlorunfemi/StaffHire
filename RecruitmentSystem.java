import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RecruitmentSystem implements ActionListener
{
    private JLabel vacancyNumberLBL;
    private JTextField vacancyNumberTXT;
    
    private JLabel designationLBL;
    private JTextField designationTXT;
    
    private JLabel jobTypeLBL;
    private JTextField jobTypeTXT;
    
    private JLabel staffNameLBL;
    private JTextField staffNameTXT;
    
    private JLabel joiningDateLBL;
    private JTextField joiningDateTXT;
    
    private JLabel qualificationLBL;
    private JTextField qualificationTXT;
    
    private JLabel appointedByLBL;
    private JTextField appointedByTXT;
    
    private JLabel joinedLBL;
    private JCheckBox joinedCKB;
    
    private JLabel salaryLBL;
    private JTextField salaryTXT;
    
    private JLabel weeklyFractionalHoursLBL;
    private JTextField weeklyFractionalHoursTXT;
    
    private JLabel workingHourLBL;
    private JTextField workingHourTXT;
    
    private JLabel wagesPerHourLBL;
    private JTextField wagesPerHourTXT;
    
    private JLabel shiftsLBL;
    private JTextField shiftsTXT;
    
    private JLabel terminatedLBL;
    private JCheckBox terminatedCKB;
    
    private JButton AddFullTimeStaffBTN;
    private JButton AddPartTimeStaffBTN;
    
    private JButton ClearAllBTN;
    
    private JFrame frame;
    
    /**
     * Constructor for objects of class RecruitmentSystem
     */

    public RecruitmentSystem()
    {
        //Initialise the instance variables
        //The whole design will be here
    
        frame = new JFrame ("CW GridLayout Example");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridBagLayout()); //Uses GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); //This adds a bit of padding
        
        vacancyNumberLBL = new JLabel("Vacancy");
        gbc.gridx = 0;
        gbc.gridy = 0;
        contentPane.add(vacancyNumberLBL, gbc);
        
        vacancyNumberTXT = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        contentPane.add(vacancyNumberTXT, gbc);
        
        designationLBL = new JLabel("Designation");
        gbc.gridx = 0;
        gbc.gridy = 1;
        contentPane.add(designationLBL, gbc);
        
        designationTXT = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        contentPane.add(designationTXT, gbc);
        
        jobTypeLBL = new JLabel("Job Type");
        gbc.gridx = 0;
        gbc.gridy = 2;
        contentPane.add(jobTypeLBL, gbc);
        
        jobTypeTXT = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 2;
        contentPane.add(jobTypeTXT, gbc);
        
        staffNameLBL = new JLabel("Staff Name");
        gbc.gridx = 2;
        gbc.gridy = 0;
        contentPane.add(staffNameLBL, gbc);
        
        staffNameTXT = new JTextField(15);
        gbc.gridx = 3;
        gbc.gridy = 0;
        contentPane.add(staffNameTXT, gbc);
        
        joiningDateLBL = new JLabel("Joining Date");
        gbc.gridx = 2;
        gbc.gridy = 1;
        contentPane.add(joiningDateLBL, gbc);
        
        joiningDateTXT = new JTextField(15);
        gbc.gridx = 3;
        gbc.gridy = 1;
        contentPane.add(joiningDateTXT, gbc);
        
        qualificationLBL = new JLabel("Qualification");
        gbc.gridx = 2;
        gbc.gridy = 2;
        contentPane.add(qualificationLBL, gbc);
        
        qualificationTXT = new JTextField(15);
        gbc.gridx = 3;
        gbc.gridy = 2;
        contentPane.add(qualificationTXT, gbc);
        
        appointedByLBL = new JLabel("Appointed By");
        gbc.gridx = 0;
        gbc.gridy = 8;
        contentPane.add(appointedByLBL, gbc);
        
        appointedByTXT = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 8;
        contentPane.add(appointedByTXT, gbc);
        
        joinedLBL = new JLabel("Joined");
        gbc.gridx = 0;
        gbc.gridy = 7;
        contentPane.add(joinedLBL, gbc);
        
        joinedCKB = new JCheckBox();
        gbc.gridx = 1;
        gbc.gridy = 7;
        contentPane.add(joinedCKB, gbc);
        
        salaryLBL = new JLabel("Salary");
        gbc.gridx = 0;
        gbc.gridy = 9;
        contentPane.add(salaryLBL, gbc);
        
        salaryTXT = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 9;
        contentPane.add(salaryTXT, gbc);
        
        weeklyFractionalHoursLBL = new JLabel("Weekly Fractional Hours");
        gbc.gridx = 0;
        gbc.gridy = 10;
        contentPane.add(weeklyFractionalHoursLBL, gbc);
        
        weeklyFractionalHoursTXT = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 10;
        contentPane.add(weeklyFractionalHoursTXT, gbc);
        
        workingHourLBL = new JLabel("Working Hours");
        gbc.gridx = 2;
        gbc.gridy = 9;
        contentPane.add(workingHourLBL, gbc);
        
        workingHourTXT = new JTextField(15);
        gbc.gridx = 3;
        gbc.gridy = 9;
        contentPane.add(workingHourTXT, gbc);
        
        wagesPerHourLBL = new JLabel("Wages per Hour");
        gbc.gridx = 2;
        gbc.gridy = 8;
        contentPane.add(wagesPerHourLBL, gbc);
        
        wagesPerHourTXT = new JTextField(15);
        gbc.gridx = 3;
        gbc.gridy = 8;
        contentPane.add(wagesPerHourTXT, gbc);
        
        shiftsLBL = new JLabel("Shifts");
        gbc.gridx = 2;
        gbc.gridy = 10;
        contentPane.add(shiftsLBL, gbc);
        
        shiftsTXT = new JTextField(15);
        gbc.gridx = 3;
        gbc.gridy = 10;
        contentPane.add(shiftsTXT, gbc);
        
        terminatedLBL = new JLabel("Terminated");
        gbc.gridx = 2;
        gbc.gridy = 7;
        contentPane.add(terminatedLBL, gbc);
        
        terminatedCKB = new JCheckBox();
        gbc.gridx = 3;
        gbc.gridy = 7;
        contentPane.add(terminatedCKB, gbc);
        
        AddFullTimeStaffBTN = new JButton ("Add Full Time Staff");
        gbc.gridx = 0;
        gbc.gridy = 12;
        contentPane.add(AddFullTimeStaffBTN,gbc);
        AddFullTimeStaffBTN.addActionListener(this);
        
        AddPartTimeStaffBTN = new JButton ("Add Part Time Staff");
        gbc.gridx = 1;
        gbc.gridy = 12;
        contentPane.add(AddPartTimeStaffBTN,gbc);
        AddPartTimeStaffBTN.addActionListener(this);
        
        ClearAllBTN = new JButton ("Clear All");
        gbc.gridx = 2;
        gbc.gridy = 12;
        contentPane.add(ClearAllBTN,gbc);
        ClearAllBTN.addActionListener(this);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        RecruitmentSystem recruitmentSystem = new RecruitmentSystem();
    }

    /**
     * Find which button triggers the event and call the appropriate
     */
    public void actionPerformed(ActionEvent event) 
    {
        String command = event.getActionCommand();
        if (command.equals("Add Full Time Staff")){
            getStaffHireSection();
        }
        if (command.equals("Clear")){
            Clear();
        }
    }
    
    public void getStaffHireSection()
    {
        int vacancyNumber;
        String designation;
        String jobType;
        String staffName;
        String joiningDate;
        String qualification;
        String appointedBy;
        boolean joined;
        
        
        if (vacancyNumberTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame,
                "Please Enter Vacancy Number ",
            "Warning Message",
            JOptionPane.WARNING_MESSAGE);
        }
        else if (designationTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame,
                "Please Enter Designation ",
            "Warning Message",
            JOptionPane.WARNING_MESSAGE);
        }
        else if (jobTypeTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame,
                "Please Enter Job Type ",
            "Warning Message",
            JOptionPane.WARNING_MESSAGE);
        }
        else if (staffNameTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame,
                "Please Enter Staff Name ",
            "Warning Message",
            JOptionPane.WARNING_MESSAGE);
        }
        else if (joiningDateTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame,
                "Please Enter Joining Date ",
            "Warning Message",
            JOptionPane.WARNING_MESSAGE);
        }
        else if (qualificationTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame,
                "Please Enter Qualification ",
            "Warning Message",
            JOptionPane.WARNING_MESSAGE);
        }
        else if (appointedByTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame,
                "Please Enter Appointed By ",
            "Warning Message",
            JOptionPane.WARNING_MESSAGE);
        }
        else{
            try {
            //This is the Casting
            vacancyNumber = Integer.parseInt(vacancyNumberTXT.getText());
            designation = designationTXT.getText();
            jobType = jobTypeTXT.getText();
            staffName = staffNameTXT.getText();
            joiningDate = joiningDateTXT.getText();
            qualification = qualificationTXT.getText();
            appointedBy = appointedByTXT.getText();
            joined = joinedCKB.isSelected();
            //Integer Variable duplication
            vacancyNumber = vacancyNumber * vacancyNumber;
            
            //Data Display
            JOptionPane.showMessageDialog(frame,
                    "Vacancy Number: " + vacancyNumber + "\n" +
                    "Designation: " + designation + "\n" +
                    "Job Type: " + jobType + "\n" +
                    "Staff Name: " + staffName + "\n" +
                    "Joining Date: " + joiningDate + "\n" +
                    "Qualification: " + qualification + "\n" +
                    "Appointed By: " + appointedBy + "\n" +
                    "Joined: " + joined + "\n"
                     );
            }
            catch(NumberFormatException exception) {
                JOptionPane.showMessageDialog(frame,
                    "Please Enter The Right Response! \n\n" + exception,
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void Clear()
    {
        vacancyNumberTXT.setText("");
        designationTXT.setText("");
        jobTypeTXT.setText("");
        staffNameTXT.setText("");
        joiningDateTXT.setText("");
        qualificationTXT.setText("");
        appointedByTXT.setText("");
    }
    

}


