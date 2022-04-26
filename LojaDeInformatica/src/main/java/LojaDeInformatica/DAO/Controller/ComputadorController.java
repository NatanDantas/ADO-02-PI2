package LojaDeInformatica.DAO.Controller;

import LojaDeInformatica.DAO.ComputadoresDAO;
import LojaDeInformatica.Model.Computador;

public class ComputadorController {
   
    public static boolean salvar(int id, String Hd, String Processador){
        Computador obj = new Computador();
        obj.setHD(Hd);
        obj.setProcessador(Processador);
        
        return ComputadoresDAO.salvar(obj);
    }
}
