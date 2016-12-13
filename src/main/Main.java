package main;

import br.com.home_labs.io.console.Input;

class Main {
    
    private static Character readKey(String msg) {
        Input input = new Input();
        String string = input.keyboard(msg, true);
        return string.charAt(0);
    }
    
    private static String renderMainMenu() {
        return "Opções\n\n" +
                "0: Sair\n" +
                "1: Cadastrar Filme\n" +
                "2: Listar Filmes por ordem de código\n" +
                "3: Listar Filme com maior número de exemplares\n" +
                "4: Cadastrar Exemplar\n" +
                "5: Buscar filme por código\n";
    }
    
    private static void searchByCode() {
        Movie movie = new Movie();
        Input input = new Input();
        movie = Movie.binarySearchByCode(Integer.parseInt(input.keyboard("Informe o código: ", true)));
        System.out.println(renderFormattedMovieData(movie));
    }
    
    private static String renderFormattedMovieData(Movie movie) {
        return "\nCódigo: " + movie.code() + "\n" +
                "Nome: " + movie.name() + "\n" +
                "Nome original: " + movie.originalName() + "\n" +
                "Diretor: " + movie.directorName() + "\n" +
                "Duração: " + movie.duration() + "min" + "\n" +
                "Ano de produção: " + movie.manufactureYear() + "\n";
    }
    
    private static void createMovie() {
        Movie movie = new Movie();
        Input input = new Input();
        movie.setCode(Integer.parseInt(input.keyboard("Código: ", true)));
        movie.setName(input.keyboard("Nome: ", true));
        movie.setOriginalName(input.keyboard("Nome Original: ", true));
        movie.setDirectorName(input.keyboard("Diretor: ", true));
        movie.setDuration(Integer.parseInt(input.keyboard("Duração (min): ", true)));
        movie.setManufactureYear(Integer.parseInt(input.keyboard("Ano de Produção (xxxx): ", true)));
        System.out.println("\nFilme cadastrado com sucesso!\n");
    }
    
    private static void createExemplary() {
        Exemplary exemplary = new Exemplary();
        Input input = new Input();
        exemplary.setMovieCode(Integer.parseInt(input.keyboard("Código do filme: ", true)));
        System.out.println("\nExemplar cadastrado com sucesso!\n");
    }
    
    private static void listGreatestCopiesCount() {
        System.out.println(renderFormattedMovieData(Movie.greatestCopiesCount()));
        readKey("Pressione ENTER para voltar ao menu principal.");
    }
    
    private static void listMovies() {
        for (Movie movie : Movie.allSortedAscByCode()) {
            System.out.println(renderFormattedMovieData(movie));
        }
        
        readKey("Pressione ENTER para voltar ao menu principal.");
    }
    
    public static void main(String[] args) {
        Character option = '1';
        
        // o erro está aqui. O Java tenta fazer uma comparação para retornar true
        while (option != '0') {
            option = readKey(renderMainMenu());
            switch (option) {
                case '0': break;
                case '1': createMovie();
                break;
                case '2': listMovies();
                break;
                case '3': listGreatestCopiesCount();
                break;
                case '4': createExemplary();
                break;
                case '5': searchByCode();
                break;
                default:
                    System.out.println("Entrada inválida!\n");
            }
        }
    }
    
}
