/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import model.MdlCalendar;
import views.Dashboard;
import views.ViewCalendar;

/**
 *
 * @author Santiago Nieto
 */
public class CtrDashboard {

    Dashboard vistaD = new Dashboard();

    public CtrDashboard() {

        metodo();
        iniciar();
    }

    public void metodo() {

        vistaD.ButtonCalendar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ViewCalendar viewC = new ViewCalendar();
                CtrlCalendar ctru = new CtrlCalendar();
                newPanel(viewC);

            }
        });
        {

        }

    }

    public void newPanel(JPanel newPanel) {

        vistaD.PanelContainer.removeAll();
        vistaD.PanelContainer.add(newPanel);
        vistaD.PanelContainer.repaint();
        vistaD.PanelContainer.revalidate();

    }

    public void iniciar() {
        vistaD.setVisible(true);
    }

}
