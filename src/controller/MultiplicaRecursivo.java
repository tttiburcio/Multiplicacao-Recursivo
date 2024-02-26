package controller;

public class MultiplicaRecursivo {

    public int calcMutiplicacao (int a, int b){
        //condição de parada:
        if(b == 0) {
            return 0;
        }else{
            return a + calcMutiplicacao(a, b -1);
        }
    }
}
