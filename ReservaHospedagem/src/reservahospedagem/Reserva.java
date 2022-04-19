package reservahospedagem;

import java.util.ArrayList;

/**
 *
 * @author Filipe Weliton
 */
public class Reserva {
    private ArrayList<Hospede> hospedes = new ArrayList<Hospede>();  
    private Suite suite;
    private int quantidadePessoas;
    private int quantidadeDias;

    public Reserva(Suite suite, int quantidadePessoas, int quantidadeDias) {
        this.suite = suite;
        this.quantidadePessoas = quantidadePessoas;
        this.quantidadeDias = quantidadeDias;
    }
    
    public Reserva(){
        
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
    
    public boolean capacidadeSuite() {
        int hospedesDef = 0;
        for(Hospede hos: this.hospedes){
            if(hos.getIdade() > 2){
                    hospedesDef++;
            }
        }
        return hospedesDef >= this.suite.getCapacidade();
    }
    
    public double calcularDiaria(){
        double valorFinal = this.suite.getValorDiaria()* this.quantidadeDias;
        
        if(this.getQuantidadeDias() > 7) {
            valorFinal -= valorFinal * 0.10; 
        }
        return valorFinal;
    }
    
    public void inserirHospede(Hospede hos){
        if(this.suite instanceof Suite){
            
            if(!this.capacidadeSuite()){
                
                this.hospedes.add(hos);
                
            }else{
                System.out.println("Suíte Lotada!");
            }
            
        }else{
           System.out.println("Não Foi Possível!");
        }
    }
    
    public Hospede getHospede(int indice){
        return this.hospedes.get(indice);
    }

    @Override
    public String toString() {
        return "Reserva{" + "hospedes=" + hospedes + ", suite=" + suite + ", quantidadePessoas=" + quantidadePessoas + ", quantidadeDias=" + quantidadeDias + '}';
    }
    
    
    
}
