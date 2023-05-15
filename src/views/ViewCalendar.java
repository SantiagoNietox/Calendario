package views;



import com.mindfusion.scheduling.awt.AwtCalendar;
import java.awt.Color;
import java.util.Calendar;


public class ViewCalendar extends javax.swing.JPanel {
    
    public static void main(String[] args) {
        
    
 
    private AwtCalendar awtCalendar;

    public ViewCalendar() {
        initComponents();
        highlightCurrentDay();
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

    private void highlightCurrentDay() {
        Calendar currentCalendar = Calendar.getInstance();
        int currentDayOfMonth = currentCalendar.get(Calendar.DAY_OF_MONTH);

        for (int row = 0; row < awtCalendar.getRowsPerMonth(); row++) {
            for (int col = 0; col < awtCalendar.getDaysPerWeek(); col++) {
                int dayOfMonth = awtCalendar.getDayOfMonth(row, col);

                if (dayOfMonth == currentDayOfMonth) {
                    awtCalendar.setCellBackground(row, col, Color.YELLOW);
                }
            }
        }
 
    
  
    }
}
}
        
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        awtCalendar1 = new com.mindfusion.scheduling.awt.AwtCalendar();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(awtCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(awtCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mindfusion.scheduling.awt.AwtCalendar awtCalendar1;
    // End of variables declaration//GEN-END:variables

