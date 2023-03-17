package br.unipar.exretangulo;

public class Retangulo {
    
    /*Escreva um código em Java que apresente a classe Retângulo, 
    com atributos comprimento, largura, área e perímetro e, 
    os métodos calcularArea, calcularPerimetro e imprimir. */
    
    private double comprimento;
    private double largura;
    private double area;
    private double perimetro;
    
    //Setter
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
        this.calcular();
    }
    
    public void setLargura(double largura){
        this.largura = largura;
        this.calcular();
    }
    
    //Getter
    public double getComprimento(){
        return this.comprimento;
    }
    
    public double getLargura(){
        return this.largura;
    }
    
    public double getArea(){
        return this.area;
    }
    
    public double getPerimetro(){
        return this.perimetro;
    }
    
    public void imprimir() {
        System.out.println("Comprimento = "+comprimento+"\n"+
                " largura = "+largura+"\n"+
                " area = "+area+"\n"+
                " perimetro = "+perimetro);
    }
    
    private void calcularArea() {
        area = comprimento * largura;
    }
    
    private void calcularPerimetro(){
        perimetro = (comprimento * 2) + (largura * 2);
    }
    
    private void calcular(){
        this.calcularArea();
        this.calcularPerimetro();
    }
    
}
