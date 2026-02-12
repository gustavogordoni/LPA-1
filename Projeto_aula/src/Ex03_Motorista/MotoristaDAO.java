/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03_Motorista;

/**
 *
 * @author gustavo
 */
public class MotoristaDAO {

    public String verificarIdade(MotoristaDTO motoristaDTO) {
        if (motoristaDTO.getIdade() >= 18) {
            return "O motorista ESTÁ apto para ter a CNH.";
        } else {
            return "O motorista NÃO está apto para ter a CNH.";
        }

    }
}
