package list.livro;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    // Atributos
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        livroList.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2022);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 3", 2020);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 2021);
        catalagoLivros.adicionarLivro("Livro 5", "Autor 5", 2019);
        catalagoLivros.adicionarLivro("Livro 6", "Autor 2", 2018);
        catalagoLivros.adicionarLivro("Livro 7", "Autor 7", 2016);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalagoLivros.pesquisaPorIntervaloAnos(2016, 2020));
        System.out.println(catalagoLivros.pesquisaPorTitulo("Livro 7"));

    }
}
