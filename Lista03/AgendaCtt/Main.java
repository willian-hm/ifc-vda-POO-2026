public class Main {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        // 1. Criando o primeiro contato com múltiplos telefones e emails
        Contato c1 = new Contato("Carlos Silva");
        c1.adicionarTelefone("(49) 99911-2233", Rotulo.CELULAR);
        c1.adicionarTelefone("(49) 3566-1234", Rotulo.CASA);
        c1.adicionarEmail("carlos@email.com", Rotulo.PESSOAL);
        c1.adicionarEmail("carlos.silva@empresa.com", Rotulo.TRABALHO);

        // 2. Criando o segundo contato
        Contato c2 = new Contato("Marina Souza");
        c2.adicionarTelefone("(49) 98877-6655", Rotulo.PROFISSIONAL);
        c2.adicionarEmail("marina@studio.com", Rotulo.PROFISSIONAL);

        // 3. Adicionando contatos na agenda
        minhaAgenda.adicionarContato(c1);
        minhaAgenda.adicionarContato(c2);

        // 4. Listando todos os contatos da agenda
        minhaAgenda.listarContatos();

        // 5. Testando remoção de um telefone e email específico de um contato
        System.out.println("\n--- Atualizando dados do Carlos ---");
        c1.removerTelefone("(49) 3566-1234");
        c1.removerEmail("email.inexistente@teste.com"); // Teste de erro

        // 6. Testando remoção de um contato da agenda
        System.out.println("\n--- Removendo contato da Agenda ---");
        minhaAgenda.removerContato("Marina Souza");
        minhaAgenda.removerContato("João"); // Teste de contato que não existe

        // 7. Listagem final para conferir o resultado
        minhaAgenda.listarContatos();
    }
}