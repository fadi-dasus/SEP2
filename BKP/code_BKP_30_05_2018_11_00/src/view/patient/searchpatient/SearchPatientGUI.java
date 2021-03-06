package view.patient.searchpatient;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.patient.PatientController;

public class SearchPatientGUI extends JFrame implements PatientView
{

   private JPanel contentPane;
   private JTextField textField;
   private JButton button;
   private PatientController patientController;
   private ButtonHandler listener;

   public SearchPatientGUI()
   {
      initializeComponents();
      addComponentsToFrame();
      createComponents();
   }

   private void initializeComponents()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);

   }

   private void addComponentsToFrame()
   {
      JLabel lbl = new JLabel("Patient Name");
      lbl.setBounds(20, 20, 89, 20);
      contentPane.add(lbl);

      textField = new JTextField();
      textField.setBounds(179, 17, 86, 20);
      contentPane.add(textField);
      textField.setColumns(10);

   }

   private void createComponents()
   {
      button = new JButton("Search");
      button.setBounds(26, 210, 89, 23);
      contentPane.add(button);
   }

   @Override
   public void start(PatientController patientController)
   {
     
      
     this.patientController= patientController;
     this.listener = new ButtonHandler(this,this.patientController);
     if (!(button == null))
     {

        button.addActionListener(listener);
     }
     setVisible(true);
   }
     

   @Override
   public void show(String value)
   {

      
   }

   @Override
   public String getName()
   {
      String name = textField.getText();
      return name;
   }
  
}
