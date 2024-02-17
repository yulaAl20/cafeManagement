/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

import java.io.InputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Reports {
    
    public void reportGenerate(){
        
        try {
    JasperCompileManager.compileReportToFile("C:\\Users\\User\\Documents\\NetBeansProjects\\Java_ui_LogIn\\src\\view\\PopularProducts.jrxml");

        
        } catch (Exception e) {
    e.printStackTrace();
}
    }
    
    public void displayPopularProductsReport() {
    try {
        String reportPath = "C:\\Users\\User\\Documents\\NetBeansProjects\\Java_ui_LogIn\\src\\view\\PopularProducts.jasper"; // Path to the compiled .jasper file
        JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, null, new JREmptyDataSource());

        // Display the report in a JasperViewer
        JasperViewer.viewReport(jasperPrint, false);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
