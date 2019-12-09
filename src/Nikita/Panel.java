package Nikita;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;

public class Panel extends JPanel {


   private JTextField field = new JTextField();
   private JTextField field2 = new JTextField();


    public Panel(){
        final int weight = 30;
        LuggageBranch list = new LuggageBranch();
        list.luggageList.add(new LuggageInfo("Nikita", 1, 11, 1, 15));
        list.luggageList.add(new LuggageInfo("Vitalik", 2, 22, 2, 25));
        list.luggageList.add(new LuggageInfo("Valera", 3, 33, 3, 35));
        list.luggageList.add(new LuggageInfo("Oleg", 4, 44, 4, 45));
        list.luggageList.add(new LuggageInfo("Jora", 5, 55, 5, 55));
        setLayout(null);




     field.setBounds(40,50,150,30);
     field.setEditable(true);
        field2.setBounds(40,10,150,30);
        field2.setEditable(false);
        field2.setText("Введите номер багажа");
     field.addActionListener(new ActionListener()

     {
         @Override
         public void actionPerformed(ActionEvent e) {
             for (int i = 0; i < list.luggageList.size(); i++) {
                 if (list.luggageList.get(i).getLuggageCheckNumber() == Integer.parseInt(field.getText()))
             JOptionPane.showMessageDialog(Panel.this,
                     "Ваше номер : " + list.luggageList.get(i).getFlightNumber());}

         }
     });
     add(field);
     add(field2);

        String json =NyDavai.GSON.toJson(list);
        System.out.println("\n json things " + json);
        try(FileOutputStream fos=new FileOutputStream("C://Users//mrnik//Desktop//test.json"))
        {

            byte[] buffer = json.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
        System.out.println(" \n Luggage > 30 kg ");
        for (int i = 0; i < list.luggageList.size(); i++) {
            if (list.luggageList.get(i).getLuggageWeight()>weight)
                System.out.println(list.luggageList.get(i));
        }
        System.out.println("Overall luggage weight = " + list.getWeightSum());
    }
}
