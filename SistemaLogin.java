import java.util.Scanner; //Trazemos a ferramenta de leitura para dentro do projeto

class SistemaLogin {
    public static void main(String[] args) {
        // Nossos dados cadastrados (como se fossem BD)
        String usuarioCorreto = "nicolas";
        String senhaCorreta = "Trovao123@";

        // Ligamos o scanner apontado para a entrada do sistema (teclado)
        Scanner teclado = new Scanner(System.in);

        // 1. Criamos um "estado" para o nosso sistema
        // Começa como 'false' (falso), afinal, ninguém fez o login ainda!
        boolean logado = false;

        // 2. O laço de repetição
        while (!logado) {
            // Pedimos os dados e o teclado.nextLine() "pausa" o programa esperando seu enter
            System.out.print("Digite seu usuário: ");
            String tentativaUsuario = teclado.nextLine();

            System.out.print("Digite sua senha: ");
            String tentativaSenha = teclado.nextLine();

            // A decisão de segurança
            // O usuário é igual ao correto e a senha é igual à correta?
            if (tentativaUsuario.equals(usuarioCorreto) && tentativaSenha.equals(senhaCorreta)) {
                System.out.println("Acesso liberado! Seja bem-vindo, mestre da nuvem.");
                logado = true;
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente!");
            }
        }

        teclado.close(); // Boa prática: sempre desligar o Scanner quando não for mais usar
    }
}
