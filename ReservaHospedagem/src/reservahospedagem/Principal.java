package reservahospedagem;

/**
 *
 * @author Filipe
 */
public class Principal {

    public static void main(String[] args) {
        Hospede hospede = new Hospede( 1, "Filipe", "Rua Dom Pedro 1 - MARINGÁ- PR", 29);
        Suite suite = new Suite(1, "Super Luxo", 2, 150.5);     
        
        Reserva reserva = new Reserva(suite, 2, 10);
        reserva.inserirHospede(hospede);
        
        
       System.out.println(reserva);
       System.out.println("Valor da Diaria: " + reserva.calcularDiaria());
    }
    
}
