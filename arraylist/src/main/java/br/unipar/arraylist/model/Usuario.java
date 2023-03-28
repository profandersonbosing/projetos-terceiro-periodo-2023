package br.unipar.arraylist.model;


public class Usuario {
    
    private String login;
    private String dsSenha;
    private boolean status;

    public Usuario(String login, String dsSenha, boolean status) {
        this.login = login;
        this.dsSenha = dsSenha;
        this.status = status;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getDsSenha() {
        return dsSenha;
    }

    public void setDsSenha(String dsSenha) {
        this.dsSenha = dsSenha;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", dsSenha=" + dsSenha + ", status=" + status + '}';
    }
    
}
