import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        List<Cliente> clientes = new ArrayList<>();
        List<Profissional> profissionais = new ArrayList<>();
        List<Agenda> agendas = new ArrayList<>();

        Recepcionista recep = new Recepcionista("Ricarda");
        Cliente novoCli = recep.cadastrarCliente("Bruno", "123.456.789-10", "(44) 99999-9999", "1111 1111 1111 1111", "123", false);
        clientes.add(novoCli);

        Admin adm = new Admin("Nicole");
        Profissional novoPro = adm.cadastrarProfissional("Ana");
        profissionais.add(novoPro);

        do {
            System.out.println("\n\n-------------------------------------------------------");
            System.out.println("1. Agendar Atendimento");
            System.out.println("2. Consultar Atendimentos");
            System.out.println("3. Cadastrar Cliente");
            System.out.println("0. Encerrar Programa");
            System.out.print("\nOPÇÃO: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            

            switch (opcao) {
                case 1:
                    int i, index = 0;
                    int siz = clientes.size();
                    for (i = 0; i < siz; i++) {
                        System.out.println("ID: "+ i + " - " + clientes.get(i).getNome());
                    }

                    System.out.println("Informe o ID do cliente: ");
                    index = scanner.nextInt();

                    System.out.println("\nEscolha o tipo de SERVIÇO:" + "\n1. Cabelo" + "\n2. Unha" + "\n0. Cancelar");
                    System.out.print("\nOPÇÃO: ");
                    int servico = scanner.nextInt();
                    scanner.nextLine();
                    
                    Atendimento atendimento = null;

                    switch (servico) {
                        case 1:

                            System.out.print("\nDigite o TIPO de cabelo (ex: liso, cacheado, crespo): ");
                            String tipoCabelo = scanner.nextLine();

                            System.out.print("Digite o CORTE desejado: ");
                            String corte = scanner.nextLine();

                            System.out.print("Digite o TAMANHO (curto / médio / longo): ");
                            String tamanho = scanner.nextLine();

                            System.out.print("Digite o PROCEDIMENTO (corte / hidratação / pintura): ");
                            String procedimento = scanner.nextLine();

                            atendimento = new Cabelo("Cabelo", 50, tipoCabelo, corte, tamanho, procedimento);
                            break;

                        case 2:
                            System.out.print("\nDigite o TIPO de unha (gel / acrílica / esmaltação / limpeza): ");
                            String tipoUnha = scanner.nextLine();

                            System.out.print("Digite a COR: ");
                            String cor = scanner.nextLine();

                            System.out.print("Digite o LOCAL (mão / pé / ambos): ");
                            String local = scanner.nextLine();

                            atendimento = new Unha("Unha", 30, tipoUnha, cor, local);
                            break;

                        case 0:
                            System.out.println("Agendamento cancelado.");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }

                    if (atendimento != null) {
                        Agenda agenda = recep.marcarAgenda(
                            clientes.get(index),
                            profissionais.get(0),
                            atendimento
                        );
                        agendas.add(agenda);
                        System.out.println("Atendimento agendado com sucesso!");
                    }
                    break;

                case 0:
                    break;

                case 2:
                    if (agendas.isEmpty()) {
                        System.out.println("\nNenhum atendimento agendado.");
                    } else { 
                        System.out.println("\n===== TODOS OS AGENDAMENTOS (" + agendas.size() + ") =====");
                        for (Agenda ag : agendas) {
                            ag.consultarAgenda();
                        }
                    }
                    break;


                case 3: // CADASTRAR CLIENTE
                    String nome, cpf, telefone, numeroCartao, codigoSeguranca;
                    boolean VIP;

                    System.out.println("\nDigite o nome do cliente: ");
                    nome = scanner.nextLine();

                    System.out.println("\nDigite o CPF do cliente: ");
                    cpf = scanner.nextLine();

                    System.out.println("\nDigite o TELEFONE do cliente: ");
                    telefone = scanner.nextLine();

                    System.out.println("\nDigite o NUMERO do CARTAO do cliente: ");
                    numeroCartao = scanner.nextLine();

                    System.out.println("\nDigite o CODIGO de SEGURANÇA do cliente: ");
                    codigoSeguranca = scanner.nextLine();

                    System.out.println("\nInforme se o cliente é VIP (false para não, true para sim): ");
                    VIP = scanner.nextBoolean();                  

                    novoCli = recep.cadastrarCliente(nome, cpf, telefone, numeroCartao, codigoSeguranca, VIP);
                    clientes.add(novoCli);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);


        System.out.println("\nEncerrando o sistema. Até logo!");

        scanner.close();
    }
}
