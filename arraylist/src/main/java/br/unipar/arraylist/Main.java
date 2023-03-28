package br.unipar.arraylist;

import br.unipar.arraylist.model.Usuario;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        
        Usuario anderson = new Usuario("anderson.bosing", 
                "ahahaha", 
                true);
        
        listaUsuarios.add(anderson);
        listaUsuarios.add(new Usuario("anderson.2", 
                "fdsfsdf", false));
        
        for (int i = 0; i < listaUsuarios.size(); i++) {
            System.out.println("Usuario = " + 
                    listaUsuarios.get(i).getLogin());
        }
        
        
        //Declaracao de ArrayList
        ArrayList<String> listaNomes = new ArrayList<>();
        
        //Adicionando elementos a lista
        listaNomes.add("Anderson");
        listaNomes.add("Henrique");
        listaNomes.add("Antony");
        
        System.out.println("Qtd de Elementos na Lista = " + 
                listaNomes.size());
        
        listaNomes.add("Lucas");
        listaNomes.add("André");
        
        
        System.out.println("Qtd de Elementos na Lista = " + 
                listaNomes.size());
        
        listaNomes.remove(0);
        
        System.out.println("Qtd de Elementos Dps da remoção na Lista = " + 
                listaNomes.size());
        
        //Loop em arraylist
        for (int i = 0; i < listaNomes.size(); i++) {
            //busca elemento da posicao através do get
            System.out.println("Nome = " + listaNomes.get(i));
        }
        
        //setando elemento em uma posicao especifica do arraylist
        //             posicao, elemento
        listaNomes.set(1, "Anderson Bosing");
        
        //limpa a lista
        listaNomes.clear();
        
        System.out.println("Qtd de Elementos Dps da limpeza da Lista = " + 
                listaNomes.size());
        
    }
}
