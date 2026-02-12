/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author gordoni
 */
public class ClienteDAO {

    public String mostrarNomeRg(ClienteDTO clienteDTO) {
        return "O nome informado foi: " + clienteDTO.getNome()
                + "\nO RG informado foi: " + clienteDTO.getRg();
    }

    public String mostrarNomeIdade(ClienteDTO clienteDTO) {
        return "O nome informado foi: " + clienteDTO.getNome()
                + "\nA idade informada foi: " + clienteDTO.getIdade();
    }

}
