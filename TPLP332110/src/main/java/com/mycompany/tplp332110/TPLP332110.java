/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tplp332110;

import com.mycompany.tplp332110.model.EntityManagerFactorySingleton;
import com.mycompany.tplp332110.model.Telefone;
import com.mycompany.tplp332110.model.TelefoneDAO;

/**
 *
 * @author renato   
 */
public class TPLP332110 {

    public static void main(String[] args) {
        
        Telefone tf = new Telefone();
        tf.setNumero("67 3291-9600");
        tf.setTipo("Trabalho");
        
        TelefoneDAO tdao = new TelefoneDAO();
        Telefone tresult = tdao.add(tf);
        System.out.println("Número: " + tresult.getNumero());
        System.out.println("Tipo: " + tresult.getTipo());
        
        EntityManagerFactorySingleton.close();
    }
}
