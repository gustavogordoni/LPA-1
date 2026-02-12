/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author gordoni
 */
public class ClienteVIEW {

    public static void main(String[] args) {
        try {

            ClienteCTR clienteCTR = new ClienteCTR();
            ClienteDTO clienteDTO = new ClienteDTO();

            clienteDTO.setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));
            clienteDTO.setRg(JOptionPane.showInputDialog("Informe o RG do cliente: "));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do cliente")));

            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRg(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
