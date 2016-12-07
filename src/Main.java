import java.util.ArrayList;

import br.com.home_labs.io.console.Input;

class Main {
    
//    format outputs here
    private static String renderMenu() {
        return "Opções:\n" +
                "0: Sair" +
                "1: Cadastrar Filme" +
                "2: Listar Filmes" +
                "3: Cadastrar Exemplar" +
                "4: Listar Exemplares";
    }
    
    private static char readKey() {
        Input input = new Input();
        
//      try {
//      } catch( e) {
//      }
        
        String key = input.keyboard(renderMenu(), true);
        
        return key.charAt(0);
    }
    
    public static void main(String[] args) {
        ArrayList<Exemplary> exemplaries = new ArrayList<Exemplary>();
        ArrayList<Movie> exemplaries = new ArrayList<Movie>();
        Exemplary exemplary;
        Movie movie;
        char option = '1';
        char key = '0';
        
        while (option != '0') {
            key = readKey();
            option = key;
            
            switch (option) {
                case :;
                    break;
                default: 
                    System.out.println("Entrada inválida!");
            }
        }
    }
}
