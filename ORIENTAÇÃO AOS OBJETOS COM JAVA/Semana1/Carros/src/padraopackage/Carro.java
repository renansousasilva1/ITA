package padraopackage;

public class Carro {
    int potencia;
    int velocidade;
    String nome;

    void acelerar(){
        velocidade = velocidade + potencia;
    }

    void frear (){
        velocidade = velocidade/2;
    }

    int getVelocidade(){
        return velocidade;
    }

    void imprimir(){
        System.out.println("O ve�culo "+nome+ " est� a velocidade de "+getVelocidade()+" km/h ");
    }
    
}