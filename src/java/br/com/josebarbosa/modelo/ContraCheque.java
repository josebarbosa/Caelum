/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.josebarbosa.modelo;

/**
 *
 * @author josebarbosa
 */
public class ContraCheque {
    
    //Créditos no contracheque
    private double vencimentoBasico;
    private double gampu;
    private double funcao;
    private double adicionalQualificacao;
    private double adicionalTreinamento;
    private double anuenio;
    private double gas;
    private double projeto;
    //penosidade ou insalubridade são inacumuláveis, portanto lançadas numa única rubrica
    private double penosidade;
    private double vpni; 
    
    //indenizacoes
    private double auxilioAlimentacao;
    private double auxilioCreche;
    //Descontos no contracheque
    private double pss;
    private double irrf;
    private double planAssiste;
    private double outrosDescontos;

    public double getVencimentoBasico() {
        return vencimentoBasico;
    }

    public void setVencimentoBasico(double vencimentoBasico) {
        this.vencimentoBasico = vencimentoBasico;
    }

    public double getGampu() {
        return gampu;
    }

    public void setGampu(double gampu) {
        this.gampu = gampu;
    }

    public double getFuncao() {
        return funcao;
    }

    public void setFuncao(double funcao) {
        this.funcao = funcao;
    }

    public double getAdicionalQualificacao() {
        return adicionalQualificacao;
    }

    public void setAdicionalQualificacao(double adicionalQualificacao) {
        this.adicionalQualificacao = adicionalQualificacao;
    }

    public double getAdicionalTreinamento() {
        return adicionalTreinamento;
    }

    public void setAdicionalTreinamento(double adicionalTreinamento) {
        this.adicionalTreinamento = adicionalTreinamento;
    }

    public double getAnuenio() {
        return anuenio;
    }

    public void setAnuenio(double anuenio) {
        this.anuenio = anuenio;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getProjeto() {
        return projeto;
    }

    public void setProjeto(double projeto) {
        this.projeto = projeto;
    }

    public double getPenosidade() {
        return penosidade;
    }

    public void setPenosidade(double penosidade) {
        this.penosidade = penosidade;
    }

    public double getVpni() {
        return vpni;
    }

    public void setVpni(double vpni) {
        this.vpni = vpni;
    }

    public double getAuxilioAlimentacao() {
        return auxilioAlimentacao;
    }

    public void setAuxilioAlimentacao(double auxilioAlimentacao) {
        this.auxilioAlimentacao = auxilioAlimentacao;
    }

    public double getAuxilioCreche() {
        return auxilioCreche;
    }

    public void setAuxilioCreche(double auxilioCreche) {
        this.auxilioCreche = auxilioCreche;
    }

    public double getPss() {
        return pss;
    }

    public void setPss(double pss) {
        this.pss = pss;
    }

    public double getIrrf() {
        return irrf;
    }

    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }

    public double getPlanAssiste() {
        return planAssiste;
    }

    public void setPlanAssiste(double planAssiste) {
        this.planAssiste = planAssiste;
    }

    public double getOutrosDescontos() {
        return outrosDescontos;
    }

    public void setOutrosDescontos(double outrosDescontos) {
        this.outrosDescontos = outrosDescontos;
    }
    
   
    
}
