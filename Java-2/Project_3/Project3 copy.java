package doctor_jay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
* Project3 class defines the GUI for the Trip Cost Estimator.
*/
public class Project3 extends JFrame {
    private static final double
            LITERS_PER_GALLON = 1;
    private JTextField
            distanceField;
   private JComboBox<String>
           distanceUnitComboBox;
   private JTextField
           gasCostField;
   private JComboBox<String>
           gasCostUnitComboBox;
   private JTextField
           gasMileageField;
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
   private JComboBox<String>
           gasMileageUnitComboBox;
   private JTextField
           daysField;
   private JTextField
           hotelCostField;
   private JTextField
           foodCostField;
   private JTextField
           attractionsCostField;
   private JButton
           calculateButton;
   private JTextField totalCostField;
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
   public Project3() {
       setTitle("Trip Cost Estimator");
       initComponents();
       setSize(400, 300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setVisible(true);
   }
   /**
    * Initializes the GUI components.
    */

   /*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
   private void initComponents() {
       JPanel panel = new JPanel();
       panel.setLayout(new GridLayout(9, 2, 5, 5));
       panel.add(new JLabel("Distance:"));
       distanceField = new JTextField();
       panel.add(distanceField);
       distanceUnitComboBox = new JComboBox<>(new String[]{"miles", "kilometers"});
       panel.add(distanceUnitComboBox);
       panel.add(new JLabel("Gasoline Cost:"));
       gasCostField = new JTextField();
       panel.add(gasCostField);
       gasCostUnitComboBox = new JComboBox<>(new String[]{"dollars/gal", "dollars/liter"});
       panel.add(gasCostUnitComboBox);
       panel.add(new JLabel("Gas Mileage:"));
       gasMileageField = new JTextField();
       panel.add(gasMileageField);

/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
       gasMileageUnitComboBox = new JComboBox<>(new String[]{"miles/gallon", "kilometers/liter"});
       panel.add(gasMileageUnitComboBox);
       panel.add(new JLabel("Number Of Days:"));
       daysField = new JTextField();
       panel.add(daysField);
       panel.add(new JLabel("Hotel Cost"));
       hotelCostField = new JTextField();
       panel.add(hotelCostField);
       panel.add(new JLabel("Food Cost"));
       foodCostField = new JTextField();
       panel.add(foodCostField);
       panel.add(new JLabel("Attractions"));
       attractionsCostField = new JTextField();
       panel.add(attractionsCostField);
       calculateButton = new JButton("Calculate");
       panel.add(calculateButton);
       calculateButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               calculateTotalCost();
           }
       });

 /*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
       panel.add(new JLabel("Total Trip Cost"));
       totalCostField = new JTextField();
       totalCostField.setEditable(false);
       panel.add(totalCostField);
       add(panel);
   }
   /**
    * Calculates and displays the total trip cost.
    */
   private void calculateTotalCost() {
       double distance = Double.parseDouble(distanceField.getText());
       double gasCost = Double.parseDouble(gasCostField.getText());
       double gasMileage = Double.parseDouble(gasMileageField.getText());
       int days = Integer.parseInt(daysField.getText());
       double hotelCost = Double.parseDouble(hotelCostField.getText());
       double foodCost = Double.parseDouble(foodCostField.getText());
       double attractionsCost = Double.parseDouble(attractionsCostField.getText());
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/


       // Convert distance to miles if in kilometers
       if (distanceUnitComboBox.getSelectedIndex() == 1) {
           distance /= 1.609347;
       }
 /*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
       // Convert gas cost to dollars per gallon if in dollars per liter
       if (gasCostUnitComboBox.getSelectedIndex() == 1) {
           gasCost *= LITERS_PER_GALLON;
       }
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
       // Convert gas mileage to miles per gallon if in kilometers per liter
       if (gasMileageUnitComboBox.getSelectedIndex() == 1) {
           gasMileage /= 1.609347;
       }
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
       // Create TripCost object and calculate total trip cost
       TripCost tripCost = new TripCost(distance, gasCost, gasMileage, days, hotelCost, foodCost, attractionsCost);
       double totalTripCost = tripCost.calculateTotalTripCost();
       // Display total trip cost
       totalCostField.setText(String.format("$%.2f", totalTripCost));
   }
   public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               new Project3();
           }
       });
   }
}