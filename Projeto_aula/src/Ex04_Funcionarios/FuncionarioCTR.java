/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex04_Funcionarios;

/**
 *
 * @author gordoni
 */
public class FuncionarioCTR {

    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public String dadosFuncionário(FuncionarioDTO funcionarioDTO) {
        return funcionarioDAO.dadosFuncionário(funcionarioDTO);

    }
}
