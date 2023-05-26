package br.unipar.central;

import br.unipar.central.exceptions.CampoNaoInformadoException;
import br.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.unipar.central.exceptions.TamanhoCampoInvalidoException;
import br.unipar.central.models.Pais;
import br.unipar.central.services.PaisService;
import javax.swing.JOptionPane;

public class UniparCentral {

    public static void main(String[] args) {
        
        try {
        
            PaisService paisService = new PaisService();
            
            Pais pais = new Pais();
            //pais.setId(1);
            pais.setNome("Brasil");
            pais.setSigla("BR");
            
            paisService.validar(pais);
        
        } catch (EntidadeNaoInformadaException ex) {
            JOptionPane.showMessageDialog(null, 
                    ex.getMessage());
        }  catch (CampoNaoInformadoException ex) {
            JOptionPane.showMessageDialog(null, 
                    ex.getMessage());
        }  catch (TamanhoCampoInvalidoException ex) {
            JOptionPane.showMessageDialog(null, 
                    ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Exceção não Esperada. "+ex.getMessage());
        }
        
    }
}
