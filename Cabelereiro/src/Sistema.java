import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// \

public class Sistema {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        List<Profissional> todosProfissionais = new ArrayList<>();
        List<Cliente> todosClientes = new ArrayList<>();
        List<Atendimento> todosAtendimentos = new ArrayList<>();



        Recepcionista recep = new Recepcionista("Ricarda");
        Cliente novoCli = recep.cadastrarCliente("Bruno", "123.456.789-10", "(44) 99999-9999", "1111 1111 1111 1111", "123", false);
        todosClientes.add(novoCli);
        
        // Atendimento novoAtend = recep.marcarAgenda(todosProfissionais.get(1), "Cabelo", todosClientes.get(1), "29/05/2026");


        Admin adm = new Admin("Nicole");
        Profissional novoPro = adm.cadastrarProfissional("Ana");
        todosProfissionais.add(novoPro);
  


        do {
            System.out.println("\n\n\n\n\n\n"); 
            System.out.println("\n-------------------------------------------------------");
            System.out.println("\n1. Agendar um atendimento; ");
            System.out.println("\n2. Consultar atendimento; ");
            System.out.println("\n\n0. Encerrar programa; ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha o tipo de SERVIÇO: \n1. Cabelo; \n2. Unha. \n\n0. Sair \n\nOPÇÃO: ");
                    int servico = scanner.nextInt();
                
                    switch (servico) {
                        case 1:
                            System.out.println("\nDigite o seu TIPO de cabelo (cacheado, ondulado, liso): ");
                            String tipo_cabelo = scanner.nextLine();
                            
                            System.out.println("\nDigite o CORTE de cabelo desejado (chanel, bob, shaggy...): ");
                            String corte = scanner.nextLine();

                            System.out.println("\nDigite o seu TAMANHO do seu cabelo (curto, médio, longo): ");
                            String tamanho = scanner.nextLine(); 
                            
                            System.out.println("\nDigite o seu PROCEDIMENTO desejado (corte, pintura, hidratação): ");
                            String procedimento = scanner.nextLine();

                            Cabelo cabelo = new Cabelo("Cabelo", 50, tipo_cabelo, corte, tamanho, procedimento);

                            break;

                        case 2:
                            System.out.println("\nDigite o TIPO de procedimento desejado (gel, acrílica, esmaltação, limpeza): ");
                            String tipo_unha = scanner.nextLine();
                            
                            System.out.println("\nDigite a COR de unha desejada (vermelho, preto, branco, azul, verde...): ");
                            String cor = scanner.nextLine();

                            System.out.println("\nDigite ONDE seu procedimento será realizado (mão, pé, ambos): ");
                            String local = scanner.nextLine(); 
                            
                            Unha unha = new Unha("Unha", 30, tipo_unha, cor, local);

                            break;
                    }

                break;
            }

        } while (opcao != 0);


        System.out.println("\n\n\n");
        scanner.close();
    }
}