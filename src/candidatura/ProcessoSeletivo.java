package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
        imprimirSelecionados(); 
        
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentivasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentivasRealizadas++;
            else
                System.out.println(" Contato realizado com sucesso!");
        } while (continuarTentando && tentivasRealizadas < 3);

        if(atendeu)
            System.out.println(" Conseguimos contato com o canditato " + candidato + " na " + tentivasRealizadas);
            System.out.println(" Conseguimos contato com o canditato " + candidato + ", número máximo de tentativas " + tentivasRealizadas + " realizadas");
        
        } 
    

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
        System.out.println("Imprimindo lista de candidatos informando o indice de elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
           System.out.println("O candidato nº" + (indice+1) + " é o " + candidatos[indice]); 
        }
    }
    

    static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirella", "Daniela", "Joana"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor se salário " + 
                    salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
         } else if (salarioBase == salarioPretendido);
        System.out.println("Ligar para candidato com contra proposta");
         {
            System.out.println("Aguardando o resultado dos demais candidatos");
           }
        }
    
}


