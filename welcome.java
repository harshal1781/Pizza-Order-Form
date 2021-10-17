/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorder;

/**
 *
 * @author admin
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class welcome implements ActionListener
{
    String cusName;
    Frame newWindow;
    TextField cusNameField;
    Button orderButton;
    
    public welcome()
    {
        newWindow = new Frame("Welcome to PizzaHeaven");
        newWindow.setSize(450,150);
        newWindow.setLayout(new GridLayout(1 ,2 , 10, 10));

       newWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                newWindow.dispose();
            }
        });
        Label cusNameLabel = new Label("Name: ");
        cusNameLabel.setAlignment(Label.RIGHT);
        newWindow.add(cusNameLabel);

        cusNameField = new TextField();
        newWindow.add(cusNameField);
        
        orderButton = new Button("ORDER");
        orderButton.addActionListener(this);
        newWindow.add(orderButton);

        newWindow.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
      cusName = cusNameField.getText();
      newWindow.removeAll();
      pizzamenu M1 = new pizzamenu(newWindow,cusName);

        
    }
}