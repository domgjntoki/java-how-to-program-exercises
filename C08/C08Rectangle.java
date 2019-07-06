/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C08;

public class C08Rectangle {
    private double length = 1;
    private double width = 1;
    public static void main(String[] args) {
        C08Rectangle retangulo = new C08Rectangle();
        
        System.out.println("Retângulo após declaração: ");
        System.out.println(retangulo);
        System.out.printf("area: %.2f%n", retangulo.area());
        System.out.printf("perímetro: %.2f%n%n", retangulo.perimeter());
        
        retangulo.setLenght(5);
        retangulo.setWidth(7);
        
        System.out.println("Retângulo após método get: ");
        System.out.println(retangulo);
        System.out.printf("area: %.2f%n", retangulo.area());
        System.out.printf("perímetro: %.2f%n%n", retangulo.perimeter());
        
        try{
            retangulo.setLenght(-3);
            retangulo.setWidth(0);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Após colocar métodos inválidos: ");
        System.out.println(retangulo);
        System.out.printf("area: %.2f%n", retangulo.area());
        System.out.printf("perímetro: %.2f%n", retangulo.perimeter());
    }
    /**
     * Determina o valor de length (valores entre 0 e 20)
     * @param length 
     */
    public void setLenght(double length){
        if (length < 0.0 || length > 20.0)
            throw new IllegalArgumentException("Valor inválido (0~20)");
        
        this.length = length;
    
    }
    /**
     * Retorna o valor de length
     * @return 
     */
    public double getLength(){return length;}
    
    /**
     * Determina o valor width (valores entre 0 e 20)
     * @param width 
     */
    public void setWidth(double width){
        if (width < 0.0 || width > 20.0)
            throw new IllegalArgumentException("Valor inválido (0~20)");
        
        this.width = width;
    }
    
    /**
     * Retorna o valor e width
     * @return 
     */
    public double getWidth(){return width;}
    
    /**
     * Retorna uma string demonstrando a largura e comprimento
     * @return 
     */
    public String toString(){
        return String.format("Length: %.2f; Width: %.2f", length, width);
    }
    
    public double area(){
        double area = length * width;
        return area;
    }
    
    public double perimeter(){
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}
