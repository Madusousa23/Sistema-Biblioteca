import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();

    public void cadastrarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (Livro livro : livros) {
            livro.exibirDados();
        }
    }

    public void pesquisarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.exibirDados();
                return;
            }
        }

        System.out.println("Livro não encontrado.");
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isEmprestado()) {
                    System.out.println("Este livro já está emprestado.");
                } else {
                    livro.emprestar();
                    System.out.println("Empréstimo realizado com sucesso!");
                }
                return;
            }
        }

        System.out.println("Livro não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!livro.isEmprestado()) {
                    System.out.println("Este livro já está disponível.");
                } else {
                    livro.devolver();
                    System.out.println("Livro devolvido com sucesso!");
                }
                return;
            }
        }

        System.out.println("Livro não encontrado.");
    }
}
