/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhrconsultoria.controler;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.swing.JOptionPane;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

/**
 *
 * @author administrador
 */
public class FileUploadView {

    /**
     * Creates a new instance of FileUploadView
     */
    private UploadedFile file;
    private Sheet sheet;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public void upload() throws IOException {

        if (file != null) {
            InputStream files = file.getInputStream();
            FileOutputStream out = new FileOutputStream("C:\\Users\\administrador\\Documents\\NetBeansProjects\\TesteImport\\Arquivos\\" + file.getFileName());
            String arquivo = "C:\\Users\\administrador\\Documents\\NetBeansProjects\\TesteImport\\Arquivos\\" + file.getFileName();
            int c;
            while ((c = files.read()) != -1) {
                out.write(c);
            }
            files.close();
            out.close();
            files.close();
            
             Workbook workbook = null;
        try {
            workbook = Workbook.getWorkbook(new File(arquivo));
        } catch (IOException ex) {
            Logger.getLogger(FileUploadView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(FileUploadView.class.getName()).log(Level.SEVERE, null, ex);
        }
        Sheet sheet = workbook.getSheet(0);
        int linhas = sheet.getRows();
        int colunas = sheet.getColumns();
            

            FacesMessage message = new FacesMessage("Successful", "Linhas: "+linhas+" Colunas: "+colunas+"    Arquivo Enviado");
            FacesContext.getCurrentInstance().addMessage(null, message);

        }
    }

    public void handleFileUpload(FileUploadEvent event) {
        UploadedFile uploadedFile = event.getFile();
        String fileNameUploaded = uploadedFile.getFileName();
        long fileSizeUploaded = uploadedFile.getSize();
        FacesMessage msg = new FacesMessage("Successful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        String nome = event.getFile().getFileName();
        JOptionPane.showMessageDialog(null, nome);
    }

}
