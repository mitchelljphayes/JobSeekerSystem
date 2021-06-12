package gui.body.progressView;

import com.intellij.uiDesigner.core.GridConstraints;
import controller.BodyViewController;

import javax.swing.*;
import java.awt.*;

public class CreateJobForm extends JPanel {
    private JProgressBar progressBar;
    private JProgressBar progressBar2;
    private JProgressBar progressBar3;
    private JProgressBar progressBar4;
    private JComboBox categoryEntry;
    private JComboBox payTypeEntry;
    private JComboBox employmentTypeEntry;
    private JButton backButton;
    private JButton proceedButton;
    private JButton saveButton;
    private JButton backButton2;
    private JButton proceedButton2;
    private JButton saveButton2;
    private JButton backButton3;
    private JButton proceedButton3;
    private JButton saveButton3;
    private JButton backButton4;
    private JButton proceedButton4;
    private JButton saveButton4;
    private JButton previewButton4;
    private BodyViewController bvc;
    private JComboBox educationEntry;
    private JTextField qualificationsEntry;
    private JList skillsEntry;
    private JTextArea description;
    private JTextField jobTitleEntry;
    private JTextField locationEntry;
    private JTextField companyEntry;
    private JTextField payRangeMinEntry;
    private JTextField payRangeMaxEntry;


    public CreateJobForm(BodyViewController bvc) {

        super();
        this.bvc = bvc;

        /* Initial panel - Job Details */
        JPanel jobDetailsPanel = new JPanel();
        jobDetailsPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        this.add(jobDetailsPanel, new GridConstraints(2, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        jobDetailsPanel.setVisible(true);

        JPanel skillsPanel = new JPanel();
        skillsPanel.setLayout(new GridBagLayout());
        GridBagConstraints c2 = new GridBagConstraints();
        this.add(skillsPanel, new GridConstraints(2, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));

        JPanel descriptionPanel = new JPanel();
        descriptionPanel.setLayout(new GridBagLayout());
        GridBagConstraints c3 = new GridBagConstraints();
        this.add(descriptionPanel, new GridConstraints(2, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));

        JPanel publishPanel = new JPanel();
        publishPanel.setLayout(new GridBagLayout());
        GridBagConstraints c4 = new GridBagConstraints();
        this.add(publishPanel, new GridConstraints(2, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));

        this.setLayout(new CardLayout());
        this.add(jobDetailsPanel, "CREATEJOB");
        this.add(skillsPanel, "SKILLS");
        this.add(descriptionPanel, "DESCRIPTION");
        this.add(publishPanel, "PUBLISH");
        this.setPage("LOGIN");

        //Job Details panel - Card 1
        //Progress Panel
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setValue(25);
        setPosition(c,0,0,6);
        jobDetailsPanel.add(progressBar, c);

        //Body Title
        JLabel bodyTitle = new JLabel("Job Details");
        setTextPosition(bodyTitle);
        setPosition(c,0,1, 1);
        jobDetailsPanel.add(bodyTitle, c);

        //Mandatory message
        JLabel mandatory = new JLabel("*Denotes mandatory field");
        setTextPosition(mandatory);
        setPosition(c,2,1,3);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.LINE_END;
        jobDetailsPanel.add(mandatory, c);

        //Job Title
        JLabel jobTitle = new JLabel("Job Title*:");
        setTextPosition(jobTitle);
        setPosition(c,0,2,2);
        jobDetailsPanel.add(jobTitle, c);

        //Company
        JLabel company = new JLabel("Company*:");
        setTextPosition(company);
        setPosition(c,0,4, 2);
        jobDetailsPanel.add(company, c);

        //Location
        JLabel location = new JLabel("Location*:");
        setTextPosition(location);
        setPosition(c,0,6, 1);
        jobDetailsPanel.add(location, c);

        //Category
        JLabel category = new JLabel("Category*:");
        setTextPosition(category);
        setPosition(c,1,6, 1);
        jobDetailsPanel.add(category, c);

        //Pay type
        JLabel payType = new JLabel("Pay Type:");
        setTextPosition(payType);
        setPosition(c,2,2,3);
        jobDetailsPanel.add(payType, c);

        //Pay Range
        JLabel payRange = new JLabel("Pay Range ($AUD:");
        setTextPosition(payRange);
        setPosition(c,2,4, 3);
        jobDetailsPanel.add(payRange, c);

        //Pay Range
        JLabel to = new JLabel("to");
        setTextPosition(to);
        setPosition(c,3,5,1);
        jobDetailsPanel.add(to, c);

        //Employment Type
        JLabel employmentType = new JLabel("Employment Type*");
        setTextPosition(employmentType);
        setPosition(c,2,6, 3);
        jobDetailsPanel.add(employmentType, c);

        //Job Title Entry
        jobTitleEntry = new JTextField(10);
        setPosition(c,0,3, 2);
        jobDetailsPanel.add(jobTitleEntry, c);

        //Company Entry
        companyEntry = new JTextField(10);
        setPosition(c,0,5, 2);
        jobDetailsPanel.add(companyEntry, c);

        //Location Entry
        locationEntry = new JTextField(10);
        setPosition(c,0,7,1);
        jobDetailsPanel.add(locationEntry, c);

        //Category Entry
        categoryEntry = new JComboBox();
        setPosition(c,1,7,1);
        jobDetailsPanel.add(categoryEntry, c);

        //Pay Type Entry
        payTypeEntry = new JComboBox();
        setPosition(c,2,3,3);
        jobDetailsPanel.add(payTypeEntry, c);

        //Pay Range Entry min
        payRangeMinEntry = new JTextField(5);
        setPosition(c,2,5,1);
        jobDetailsPanel.add(payRangeMinEntry, c);

        //Pay Range Entry max
        payRangeMaxEntry = new JTextField(5);
        setPosition(c,4,5,1);
        jobDetailsPanel.add(payRangeMaxEntry, c);

        //Employment Type
        employmentTypeEntry = new JComboBox();
        setPosition(c,2,7,3);
        jobDetailsPanel.add(employmentTypeEntry, c);

        //Button Panel
        JPanel buttonsPanel = new JPanel();
        setButtonPosition(c,0,10,6);
        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.X_AXIS));
        jobDetailsPanel.add(buttonsPanel, c);

        //Back Button
        backButton = new JButton("Back");
        backButton.setFocusable(false);
        buttonsPanel.add(backButton);

        buttonsPanel.add(Box.createHorizontalGlue());

        //Save Button
        saveButton = new JButton("Save");
        saveButton.setFocusable(false);
        buttonsPanel.add(saveButton);

        buttonsPanel.add(Box.createRigidArea(new Dimension(10,0)));

        //Proceed Button
        proceedButton = new JButton("Continue");
        proceedButton.setFocusable(false);
        buttonsPanel.add(proceedButton);

        // Skills Panel - Card 2

        //Progress Panel
        progressBar2 = new JProgressBar();
        progressBar2.setStringPainted(true);
        progressBar2.setValue(50);
        setPosition(c2,0,0, 4);
        skillsPanel.add(progressBar2, c2);

        //Body Title
        JLabel bodyTitle2 = new JLabel("Desired Skills and Qualifications");
        setTextPosition(bodyTitle2);
        setPosition(c2,0,1,2);
        skillsPanel.add(bodyTitle2, c2);

        //Mandatory message
        JLabel mandatory2 = new JLabel("*Denotes mandatory field");
        setTextPosition(mandatory2);
        setPosition(c2,2,1,2);
        c2.fill = GridBagConstraints.NONE;
        c2.anchor = GridBagConstraints.LINE_END;
        skillsPanel.add(mandatory2, c2);

        //Skills Title
        JLabel skills = new JLabel("Skill*:");
        setTextPosition(skills);
        setPosition(c2,0,2,2);
        skillsPanel.add(skills, c2);

        //Education
        JLabel education = new JLabel("Education*:");
        setTextPosition(education);
        setPosition(c2,2,2,2 );
        skillsPanel.add(education, c2);

        //Qualifications
        JLabel qualifications = new JLabel("Qualifications*:");
        setTextPosition(qualifications);
        setPosition(c2,2,4,2);
        skillsPanel.add(qualifications, c2);

        //Skills Entry
        /*
        JPanel skillsEntry = new JPanel();
        String[] skill = new String[3];
        skill[0] = "Java";
        skill[1] = "Python";
        skill[2] = "C++";
        JList skillList = new JList(skill);
        JScrollPane skillScroll = new JScrollPane();
        setPosition(c2,0,3,2);
        skillsPanel.add(skillScroll, c2);
        JLabel displaySkills = new JLabel();
        setPosition(c2,0,4,2);
        skillsPanel.add(skillScroll, c2);
        skillList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        skillsEntry = new JList();
        setPosition(c2,0,3,2);
        skillsPanel.add(skillsEntry, c2);
        DefaultListModel dlm = new DefaultListModel();
        dlm.addElement("Java");
        dlm.addElement("Python");
        dlm.addElement("C++");
        skillsEntry.setModel(dlm);
        JPanel skillsList = new JPanel();
        setPosition(c2,0,4,2);
        skillsPanel.add(skillsEntry, c2);
        */

        //Education Entry
        String[] educationString = { "-Select highest level of education","Not applicable", "Secondary", "Undergraduate", "Post-Graduate", "Masters", "Doctorate" };
        educationEntry = new JComboBox(educationString);
        setPosition(c2,2,3,2);
        skillsPanel.add(educationEntry, c2);

        //Qualifications Entry
        qualificationsEntry = new JTextField(10);
        setPosition(c2,2,5,2);
        skillsPanel.add(qualificationsEntry, c2);

        //Button Panel 2
        JPanel buttonsPanel2 = new JPanel();
        setButtonPosition(c2,0,10,4);
        buttonsPanel2.setLayout(new BoxLayout(buttonsPanel2, BoxLayout.X_AXIS));
        skillsPanel.add(buttonsPanel2, c2);

        //Back Button
        backButton2 = new JButton("Back");
        backButton2.setFocusable(false);
        buttonsPanel2.add(backButton2);

        buttonsPanel2.add(Box.createHorizontalGlue());

        //Save Button
        saveButton2 = new JButton("Save");
        saveButton2.setFocusable(false);
        buttonsPanel2.add(saveButton2);

        buttonsPanel2.add(Box.createRigidArea(new Dimension(10,0)));

        //Proceed Button
        proceedButton2 = new JButton("Continue");
        proceedButton2.setFocusable(false);
        buttonsPanel2.add(proceedButton2);

        // Job Description Panel - Card 3

        //Progress Panel
        progressBar3 = new JProgressBar();
        progressBar3.setStringPainted(true);
        progressBar3.setValue(75);
        setPosition(c3,0,0, 4);
        descriptionPanel.add(progressBar3, c3);

        //Body Title
        JLabel bodyTitle3 = new JLabel("Job Description*");
        setTextPosition(bodyTitle3);
        setPosition(c3,0,1,1);
        descriptionPanel.add(bodyTitle3, c3);

        //Mandatory message
        JLabel mandatory3 = new JLabel("*Denotes mandatory field");
        setTextPosition(mandatory3);
        setPosition(c3, 2,1,2);
        c3.fill = GridBagConstraints.NONE;
        c3.anchor = GridBagConstraints.LINE_END;
        descriptionPanel.add(mandatory3, c3);

        //Description entry
        description = new JTextArea();
        description.setLineWrap(true);
        description.setWrapStyleWord(true);
        JScrollPane descScroll = new JScrollPane(description);
        descScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        descScroll.setPreferredSize((new Dimension(500,200)));
        setPosition(c3,0,2,4);
        descriptionPanel.add(descScroll, c3);

        //Button Panel 3
        JPanel buttonsPanel3 = new JPanel();
        setButtonPosition(c3,0,10,6);
        buttonsPanel3.setLayout(new BoxLayout(buttonsPanel3, BoxLayout.X_AXIS));
        descriptionPanel.add(buttonsPanel3, c3);

        //Back Button
        backButton3 = new JButton("Back");
        backButton3.setFocusable(false);
        buttonsPanel3.add(backButton3);

        buttonsPanel3.add(Box.createHorizontalGlue());

        //Save Button
        saveButton3 = new JButton("Save");
        saveButton3.setFocusable(false);
        buttonsPanel3.add(saveButton3);

        buttonsPanel3.add(Box.createRigidArea(new Dimension(10,0)));

        //Proceed Button
        proceedButton3 = new JButton("Continue");
        proceedButton3.setFocusable(false);
        buttonsPanel3.add(proceedButton3);

        // Publish Panel - Card 4

        //Progress Panel
        progressBar4 = new JProgressBar();
        progressBar4.setStringPainted(true);
        progressBar4.setValue(100);
        setPosition(c4,0,0, 4);
        publishPanel.add(progressBar4, c4);

        //Body Title
        JLabel bodyTitle4 = new JLabel("What would you like to do next?");
        setTextPosition(bodyTitle4);
        setPosition(c4,0,1,4);
        c4.anchor = GridBagConstraints.CENTER;
        c4.fill = GridBagConstraints.NONE;
        publishPanel.add(bodyTitle4, c4);

        //Save Button
        saveButton4 = new JButton("Save");
        saveButton4.setFocusable(false);
        setButtonPosition(c4,1,3,1);
        c4.insets = new Insets(10, 10, 10,10);
        publishPanel.add(saveButton4, c4);

        //Preview Button
        previewButton4 = new JButton("Preview");
        previewButton4.setFocusable(false);
        setButtonPosition(c4,2,3,1);
        c4.insets = new Insets(10, 10, 10,10);
        publishPanel.add(previewButton4, c4);

        //Proceed Button
        proceedButton4 = new JButton("Publish");
        proceedButton4.setFocusable(false);
        setButtonPosition(c4,1,4,2);
        c4.insets = new Insets(10, 10, 10,10);
        c.fill = GridBagConstraints.NONE;
        publishPanel.add(proceedButton4, c4);

        //Button Panel 4
        JPanel buttonsPanel4 = new JPanel();
        setButtonPosition(c4,0,6,4);
        buttonsPanel4.setLayout(new BoxLayout(buttonsPanel4, BoxLayout.X_AXIS));
        publishPanel.add(buttonsPanel4, c4);

        //Back Button
        backButton4 = new JButton("Back");
        backButton4.setFocusable(false);
        backButton4.setAlignmentX(Component.LEFT_ALIGNMENT);
        buttonsPanel4.add(backButton4);

        //Creating the action listeners to change the tabs and refresh the main panel
//        profileButton.addActionListener(e -> {
//
//        });

        backButton.addActionListener(e-> {
            bvc.getMainFrame().setBody("LOGIN");
            bvc.getMainFrame().setHeader("BUTTONS");
        });

        proceedButton.addActionListener(e -> {
            setPage("SKILLS");
        });

        backButton2.addActionListener(e-> {
            setPage("CREATEJOB");
        });

        proceedButton2.addActionListener(e -> {
            setPage("DESCRIPTION");
        });

        backButton3.addActionListener(e-> {
            setPage("SKILLS");
        });

        proceedButton3.addActionListener(e -> {
            setPage("PUBLISH");
        });

        backButton4.addActionListener(e-> {
            setPage("DESCRIPTION");
        });

/*      proceedButton3.addActionListener(e -> {
            setPage("PUBLISH");
        });

        proceedButton2.addActionListener(e -> {
            dlm.removeElementAt(skillsEntry.getSelectedIndex());
        });

          skillList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String strSkills = "";
                List<String> selectedSkills = skillList.getSelectedValuesList();
                for(String S: selectedSkills)
                    strSkills = strSkills + skill + ",";
                strSkills = strSkills.substring(0, strSkills.length() - 1);
                displaySkills.setText(strSkills);
            }
        });

   */
    }

    public void setPage(String page) {
        CardLayout createJob = (CardLayout) (this.getLayout());
        createJob.show(this, page);
    }

    public void getUserDetails(){
    }

    public void setTextPosition(JLabel text){
        text.setHorizontalAlignment(JLabel.LEFT); //set page title left
        text.setVerticalAlignment(JLabel.TOP); //set page title top
    }

    public void setPosition(GridBagConstraints c, int x, int y, int w){
        c.gridwidth = w;
        c.gridx = x;
        c.gridy = y;
        c.insets = new Insets(10, 10, 10, 10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.LINE_START;
    }

    public void setButtonPosition(GridBagConstraints c, int x, int y, int w){
        c.gridwidth = w;
        c.gridx = x;
        c.gridy = y;
        c.insets = new Insets(50, 10, 10,10);
        c.anchor = GridBagConstraints.CENTER;
    }

}