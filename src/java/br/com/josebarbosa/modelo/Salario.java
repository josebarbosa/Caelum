/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.josebarbosa.modelo;


import br.com.josebarbosa.conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author josebarbosa
 */
public class Salario {
    
    private Integer orgao;
    private Integer cargo; 
    private Integer ano; 
    private Integer nivel;
    private Integer funcao;
    private Integer formacao;
    private Integer treinamento;
    private Integer anuenios;
    private Integer dependentesIRRF;
    private Integer dependetesPlan;
    private Integer dependentesCreche;
    private double vpni;
    private boolean gas;
    private boolean projeto;
    private boolean penosidade;
    private boolean insalubridade; 
    
    private ContraCheque contraCheque; 

    public Integer getOrgao() {
        return orgao;
    }

    public void setOrgao(Integer orgao) {
        this.orgao = orgao;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getFuncao() {
        return funcao;
    }

    public void setFuncao(Integer funcao) {
        this.funcao = funcao;
    }

    public Integer getFormacao() {
        return formacao;
    }

    public void setFormacao(Integer formacao) {
        this.formacao = formacao;
    }

    public Integer getTreinamento() {
        return treinamento;
    }

    public void setTreinamento(Integer treinamento) {
        this.treinamento = treinamento;
    }

    public Integer getAnuenios() {
        return anuenios;
    }

    public void setAnuenios(Integer anuenios) {
        this.anuenios = anuenios;
    }

    public Integer getDependentesIRRF() {
        return dependentesIRRF;
    }

    public void setDependentesIRRF(Integer dependentesIRRF) {
        this.dependentesIRRF = dependentesIRRF;
    }

    public Integer getDependetesPlan() {
        return dependetesPlan;
    }

    public void setDependetesPlan(Integer dependetesPlan) {
        this.dependetesPlan = dependetesPlan;
    }

    public Integer getDependentesCreche() {
        return dependentesCreche;
    }

    public void setDependentesCreche(Integer dependentesCreche) {
        this.dependentesCreche = dependentesCreche;
    }

    public double getVpni() {
        return vpni;
    }

    public void setVpni(double vpni) {
        this.vpni = vpni;
    }

    public boolean isGas() {
        return gas;
    }

    public void setGas(boolean gas) {
        this.gas = gas;
    }

    public boolean isProjeto() {
        return projeto;
    }

    public void setProjeto(boolean projeto) {
        this.projeto = projeto;
    }

    public boolean isPenosidade() {
        return penosidade;
    }

    public void setPenosidade(boolean penosidade) {
        this.penosidade = penosidade;
    }

    public boolean isInsalubridade() {
        return insalubridade;
    }

    public void setInsalubridade(boolean insalubridade) {
        this.insalubridade = insalubridade;
    }

    public ContraCheque getContraCheque() {
        return contraCheque;
    }

    public void setContraCheque(ContraCheque contraCheque) {
        this.contraCheque = contraCheque;
    }
    
    /*
    Métodos 
    */
    
    //Busca salário base para efetuar cálculos
    public void calculaVencimentoBasico(Integer cargo, Integer nivel) throws SQLException{
        Connection con = new ConnectionFactory().getConnection();
        Integer id;
        id = (15 * cargo) + nivel;
        PreparedStatement stmt = con.prepareStatement("select valor from vencimentos where id=" + id + " limit 1");
        
        ResultSet rs = stmt.executeQuery();
        
        rs.next();
        contraCheque.setVencimentoBasico(rs.getDouble("valor"));
        stmt.close();
        rs.close();       
    }
    
    //não precisa passar as variáveis como parâmetro???
    public void calculaGampu(){
        
    }
    
    
    
}
