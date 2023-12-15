package ba.smoki.two.collection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class DatabaseDemo {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        //customerList -> ArrayList, List, Collection , Iterable,
        List<Customer> customerList = customerDao.selectAll();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
        Container<String> container = new Container<>();
        for(String e : container){

        }



//        JFrame frame = new JFrame();
//        JPanel panel = new JPanel();
//        JComboBox<Customer> customerJComboBox = new JComboBox<>();
//        for (Customer customer : customerList) {
//            customerJComboBox.addItem(customer);
//        }
//        CustomerSelectListener selectListener = new CustomerSelectListener();
//        customerJComboBox.addActionListener(selectListener);
//        panel.add(customerJComboBox);
//        frame.getContentPane().add(panel);
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setVisible(true);

    }

    private static class CustomerSelectListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox<Customer> source = (JComboBox<Customer>) e.getSource();
            String komanda = e.getActionCommand();
            System.out.println(source.getSelectedItem() + " je dao/la ");
        }
    }
}
