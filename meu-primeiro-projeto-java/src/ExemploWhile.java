import java.util.*;
public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0){
            double valorDoce = 20.0;
            if(valorDoce > mesada){
                valorDoce = mesada;
            } 
            System.out.println("Doce do valor " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada" + mesada);
        System.out.println("Joaozinho gastou a mesada toda em doces");
    }
}