package br.com.fiap.bean;

/**
 * Classe para criar objetos de ContaBancaria
 * @author Mariana
 * @version 1.0
 */
public class ContaPoupanca implements ContaBancaria{
    //atributos
    private int numConta;
    private float saldo;

    //construtores
    public ContaPoupanca(){}

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    //métodos da classe (particulares)

    /**
     * Método sacar que permite sacar um valor informado.
     * Valor informado deve ser inferior ou igual ao saldo atual.
     * @author Mariana
     * @param valor - indica valor a ser sacado
     * @return float - valor do saldo (atualizado)
     */
    public float sacar(float valor){
        try{
            if (valor <= saldo){
                saldo -=valor; //saldo = saldo - valor
            }else{
                throw new Exception("Saldo insuficiente");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return saldo;
    }

    /**
     * Método depositar que permite depositar o valor informado
     * @author Mariana
     * @param valor - valor a ser depositado
     * @return float - valor do saldo atualizado
     */
    public float depositar(float valor){
        saldo += valor; //saldo = saldo + valor
        return saldo;
    }
}
