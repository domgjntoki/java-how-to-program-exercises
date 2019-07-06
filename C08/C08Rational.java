package C08;

public class C08Rational {
    private int numerador;
    private int denominador;
    
    
    public C08Rational(int numerador, int denominador){
        for(int i = numerador; i >= 1; i--){
           if(numerador % i == 0 && denominador % i == 0){
               numerador /= i;
               denominador /= i;
           }
       }
       this.numerador = numerador;
       this.denominador = denominador;
    }
    
    public static String somar(C08Rational numero1, C08Rational numero2){
        int numerador1 = numero1.getNumerador();
        int numerador2 = numero2.getNumerador();
        int denominador1 = numero1.getDenominador();
        int denominador2 = numero2.getDenominador();
        
        
        int numeradorFinal = 
                numerador1 * denominador2 + numerador2 * denominador1;
        int denominadorFinal = denominador1 * denominador2;
        
        return simplificar(numeradorFinal, denominadorFinal);
    }
    
    public static String subtrair(C08Rational numero1, C08Rational numero2){
        int numerador1 = numero1.getNumerador();
        int numerador2 = numero2.getNumerador();
        int denominador1 = numero1.getDenominador();
        int denominador2 = numero2.getDenominador();
        
        int numeradorFinal = 
                numerador1 * denominador2 - numerador2 * denominador1;
        int denominadorFinal = denominador1 * denominador2;
        
        return simplificar(numeradorFinal, denominadorFinal);
    }
    
    public static String multiplicar(C08Rational numero1, C08Rational numero2){
        int numerador1 = numero1.getNumerador();
        int numerador2 = numero2.getNumerador();
        int denominador1 = numero1.getDenominador();
        int denominador2 = numero2.getDenominador();
        
        int numeradorFinal = numerador1 * numerador2;
        int denominadorFinal = denominador1 * denominador2;
        
        return simplificar(numeradorFinal, denominadorFinal);
    }
    
    public static String dividir(C08Rational numero1, C08Rational numero2){
        int numerador1 = numero1.getNumerador(); // 2 5
        int numerador2 = numero2.getNumerador(); // 5 3
        int denominador1 = numero1.getDenominador();
        int denominador2 = numero2.getDenominador();
        
        int numeradorFinal = numerador1 * denominador2;
        int denominadorFinal = denominador1 * numerador2;
        return simplificar(numeradorFinal, denominadorFinal);
    }
    
    public int getNumerador(){return numerador;}
    public int getDenominador(){return denominador;}
    
    private static String simplificar(int numerador, int denominador){
        int vezes = numerador;
        if(vezes < 0)
            vezes *= -1;
        
        for(int i = vezes; i >= 1; i--){
            if(numerador % i == 0 && denominador % i == 0){
                numerador /= i;
                denominador /= i;
            }
        }
        if(numerador == 0)
            denominador = 1;
        return String.format("%d/%d", numerador, denominador);
    }
    
    @Override
    public String toString(){
        return String.format("%d/%d", numerador, denominador);
    }
    
    public String toDecimal(int casas){
        double decimal = (double) numerador / (double) denominador;
        double potencia10 = Math.pow(10, casas);
        double aproximado = Math.floor(decimal * potencia10 + 0.5) / potencia10;
        
        return "" + aproximado;
    }
}
