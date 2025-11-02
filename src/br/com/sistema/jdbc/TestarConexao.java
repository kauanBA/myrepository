
package br.com.sistema.jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class TestarConexao {
    public static void main(String[] args) {
            try {
                new ConexaoBanco().pegarConexao();
                JOptionPane.showMessageDialog(null, "conectado com sucesso ao banco de dados!");
            } catch (HeadlessException erro) {
                    JOptionPane.showMessageDialog(null, "erro ao tentar se conectar com o banco de dados" + erro.getMessage());
            }
    }
}
