/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.potencial.teclas;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Usuario
 */
public class Teclas_Aceitaveis_View_Principal extends PlainDocument{
   
     @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{    
        super.insertString(offset, str.replaceAll("[^0-9]",""), attr);   
    }    
 
    public void replace(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{    
        super.insertString(offset, str.replaceAll("[^0-9]",""), attr);   
    }    
}
