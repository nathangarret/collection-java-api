package list.ordenar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    // Atributos
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade); // através do comparable => sort =>
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new comparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.82);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 14, 1.72);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 18, 1.67);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 21, 1.87);
        ordenacaoPessoas.adicionarPessoa("Nome 5", 19, 1.93);
        ordenacaoPessoas.adicionarPessoa("Nome 6", 15, 1.55);

        System.out.println(ordenacaoPessoas.ordenadoPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

        System.out.println(ordenacaoPessoas.pessoaList);
    }
}
