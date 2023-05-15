

package main;

import com.mindfusion.scheduling.awt.AwtCalendar;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Calendar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ViewCalendar calendarPanel = new ViewCalendar();
        frame.getContentPane().add(calendarPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class ViewCalendar extends javax.swing.JPanel {

    private AwtCalendar awtCalendar;

    public ViewCalendar() {
        initComponents();
        
    }

    private void initComponents() {
        awtCalendar = new AwtCalendar();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(awtCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(awtCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
    }

   // private void highlightCurrentDay() {
      //  Calendar currentCalendar = Calendar.getInstance();
       // int currentDayOfMonth = currentCalendar.get(Calendar.DAY_OF_MONTH);

        //for (int row = 0; row < awtCalendar.getRowsPerMonth(); row++) {
        //    for (int col = 0; col < awtCalendar.getDaysPerWeek(); col++) {
        //        int dayOfMonth = awtCalendar.getDayOfMonth(row, col);

        //        if (dayOfMonth == currentDayOfMonth) {
        //            awtCalendar.setCellBackground(row, col, Color.YELLOW);
                //}
           // }
        //}
    }

