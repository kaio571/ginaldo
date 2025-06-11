import java.util.ArrayList; //coloquei os import no começo porq é chato ter que escrever eles completamente no meio do codigo
import java.util.List;
import java.util.stream.Collectors;
class Produto {
    String nome;
    double preco;
    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", preco);
    }}
public class LojaComLambda {
    public static void main(String[] args) {
// os produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Fone", 120.0));
        produtos.add(new Produto("Caneta", 10.0));
        produtos.add(new Produto("Teclado", 80.0));
        produtos.add(new Produto("Monitor", 300.0));
        produtos.add(new Produto("Caderno", 25.0));
        produtos.add(new Produto("Mouse", 45.0));
// Aplicar 10% de desconto nos produtos de 100
        List<Produto> comDesconto = produtos.stream()
            .map(p -> (p.preco > 100) 
                ? new Produto(p.nome, p.preco * 0.9) 
                : p)
            .collect(Collectors.toList());
// esse aqui filtra os de 50
        List<Produto> filtrados = comDesconto.stream()
            .filter(p -> p.preco < 50)
            .collect(Collectors.toList());
// agr esse imprime 
        System.out.println("Produtos com desconto e preço abaixo de R$ 50:");
        filtrados.forEach(p -> System.out.println(p));
    }
}
