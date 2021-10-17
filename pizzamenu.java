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
public class pizzamenu implements ActionListener
{
  Frame f1;
  String cusname;
  String vp;
  String nvp;
  String firstPizzaSelected[] = new String[5];
  String secondPizzaSelected[] = new String[5];
  Button checkoutButton;
  Button gobackButton;
  Button exitButton;
  int c = 0,c1 = 0, ttlamt=0;
  int amt1[] = new int[5];
  int amt2[] = new int[5];
  pizzamenu(Frame f1,String cusname){
    this.f1=f1;
    this.cusname=cusname;
    f1.setTitle("welcome " + cusname);
    f1.setSize(552,650);
    f1.setLayout(new FlowLayout());
     Label cusHotelLabel = new Label("Pizza Heaven");
        cusHotelLabel.setAlignment(Label.CENTER);
        f1.add(cusHotelLabel);
        f1.setLayout(new GridLayout(20 ,1,15,15 ));
        f1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f1.dispose();
            }
        });
        Label vpLabel =  new Label("Veg Pizza");
        vpLabel.setAlignment(Label.CENTER);
        f1.add(vpLabel);
  
        Checkbox checkBox1 = new Checkbox("Margherita         Rs.110");  
        f1.add(checkBox1); 
        checkBox1.addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
           if(e.getStateChange()==1   ){
             amt1[c] = 110;
             firstPizzaSelected[c] = "Margherita";
             ttlamt += 110;
             c++;
           } 
           
}
});


        Checkbox checkBox2 = new Checkbox("Farmhouse         Rs.130");    
        f1.add(checkBox2); 
        checkBox2.addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
           if(e.getStateChange()==1) {
             amt1[c] = 130;
             firstPizzaSelected[c] = "Farmhouse";
             ttlamt += 130;
             c++;
           } 
           
}
});
        Checkbox checkBox3 = new Checkbox("Four Cheese Blend    Rs.150");    
        f1.add(checkBox3); 
        checkBox3.addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
           if(e.getStateChange()==1) {
             amt1[c] = 150;
             firstPizzaSelected[c] = "Four Cheese Blend";
             ttlamt += 150;
             c++;
           } 
           
}
});
        Checkbox checkBox4 = new Checkbox("Paneer Tikka       Rs.170");    
        f1.add(checkBox4); 
        checkBox4.addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
           if(e.getStateChange()==1) {
             amt1[c] = 170;
             firstPizzaSelected[c] = "Paneer Tikka";
             ttlamt += 170;
             c++;
           } 
           
}
});
        Checkbox checkBox5 = new Checkbox("Pizza Heaven Special      Rs.200");    
        f1.add(checkBox5); 
        checkBox5.addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
           if(e.getStateChange()==1) {
             amt1[c] = 200;
             firstPizzaSelected[c] = "Pizza Heaven Special";
             ttlamt += 200;
             c++;
           } 
           
}
});
           
        Label nvpLabel =  new Label("Non Veg Pizza");
        nvpLabel.setAlignment(Label.CENTER);
        f1.add(nvpLabel); 
        Checkbox checkBox6 = new Checkbox("Smokng Barbeque         Rs.120");   
        f1.add(checkBox6); 
        checkBox6.addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
           if(e.getStateChange()==1) {
             amt2[c1] = 120;
             secondPizzaSelected[c1] = "Smokng Barbeque";
             ttlamt += 120;
             c1 ++;
           }
           
}
});
        Checkbox checkBox7 = new Checkbox("Hurricanes             Rs.140");    
        f1.add(checkBox7); 
        checkBox7.addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
           if(e.getStateChange()==1) {
             amt2[c1] = 140;
             secondPizzaSelected[c1] = "Hurricanes";
             ttlamt += 140;
             c1 ++;
           }
           
}
});
        Checkbox checkBox8 = new Checkbox("Chicken Chilli Milli        Rs.165");    
        f1.add(checkBox8); 
        checkBox8.addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
           if(e.getStateChange()==1) {
             amt2[c1] = 165;
             secondPizzaSelected[c1] = "Chicken Chilli Milli";
             ttlamt += 165;
             c1 ++;
           }
           
}
});
        Checkbox checkBox9 = new Checkbox("Pepperoni            Rs.185");    
        f1.add(checkBox9); 
        checkBox9.addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
           if(e.getStateChange()==1) {
             amt2[c1] = 185;
             secondPizzaSelected[c1] = "Pepperoni";
             ttlamt += 185;
             c1 ++;
           }
           
}
});
        Checkbox checkBox10 = new Checkbox("Pizza Heaven Nonveg Special      Rs.250");    
        f1.add(checkBox10); 
        checkBox10.addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
           if(e.getStateChange()==1) {
             amt2[c1] = 250;
             secondPizzaSelected[c1] = "Pizza Heaven Nonveg Special";
             ttlamt += 250;
             c1 ++;
           }
           
}
});

        checkoutButton = new Button("CHECKOUT");
        checkoutButton.addActionListener(this);
        f1.add(checkoutButton);

        exitButton = new Button("EXIT");
        exitButton.addActionListener(this);
        f1.add(exitButton);

        f1.setVisible(true);
  }
  void checkout()
  {
    f1.setSize(252,350);
    f1.setLayout(new FlowLayout());
     Label label1;
    for(int i=0;i<firstPizzaSelected.length;i++) {
      if(firstPizzaSelected[i] != null) {
        label1 = new Label(firstPizzaSelected[i] + "  " + "Rs" + amt1[i]);
       f1.add(label1);
        
      }
    }
    
    for(int i=0;i<secondPizzaSelected.length;i++) {
      if(secondPizzaSelected[i] != null ) {
        label1 = new Label(secondPizzaSelected[i] + "  " + "Rs" + amt2[i]);
      f1.add(label1);

      }
       System.out.print(secondPizzaSelected[i]);
    }
    //ttlamt = amt1 + amt2;
    Label label3 = new Label("Total amount = Rs " + ttlamt );
    f1.add(label3);

    exitButton = new Button("EXIT");
    exitButton.addActionListener(this);
    f1.add(exitButton);
    
    Label label4 = new Label ("Thank You!!! Visit Again.");
    label4.setAlignment(Label.CENTER);
    f1.add(label4);

  }
  public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == checkoutButton)
      {
        f1.removeAll();
        checkout();
      }
      else if(e.getSource() == exitButton)
      {
        f1.dispose();
      }
   }
}
