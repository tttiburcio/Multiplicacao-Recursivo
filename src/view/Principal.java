package view;

import controller.MultiplicaRecursivo;

public class Principal {
    public static void main(String[] args) {
        MultiplicaRecursivo multiplicaRecursivo = new MultiplicaRecursivo();

        int resultado = multiplicaRecursivo.calcMutiplicacao(5, 8);
        System.out.println("O resultado da multiplicação é: " + resultado);
    }
}
