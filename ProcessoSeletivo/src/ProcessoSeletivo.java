import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("PROCESSO SELETIVO");
        
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) { 
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso.");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("Conseguimos com o candidato " + candidato + " na " + tentativasRealizadas + " tentativa");
        }else {
            System.out.println("Não conseguimos contato com " + candidato + " , número máximo de tentativas " + tentativasRealizadas + "realizadas");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
   

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de N " + (indice+1) + " é o " + candidatos[indice]);
        }

        //for (String candidato : candidatos) {
          //  System.out.println("O candidato selecionado foi " + candidato);
        //}
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if ( salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando os resultados dos demais candidatos");
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void selecionarCandidato(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", " Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};

        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.00;
        
        while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length){
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salário R$ %.2f", candidato, salarioPretendido);
            System.out.println();

            if (salarioBase >= salarioPretendido){
                System.out.printf("O candidato %s foi selecionado para a vaga.", candidato);
                System.out.println();
                candidatosSelecionados++;
            }
            candidatosAtuais++;
        }
    }
}
