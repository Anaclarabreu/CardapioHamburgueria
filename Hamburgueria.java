import java.util.ArrayList;
import java.util.List;

class ItemCardapio {
    private String nome;
    private String descricao;
    private double preco;

    public ItemCardapio(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
     public String getNome() {
        return  nome;
     }
     public String getDescricao() {
        return descricao;
     }
     public double getPreco() {
        return preco;
     }

     @Override
     public String toString() {
        return nome + " - R$" + preco + "\n" + descricao + "\n";
     }
    }
    public class CardapioHamburgueria {
        public static void main(String[] args) {
            List<ItemCardapio> cardapio = new ArrayList<>();

        cardapio.add(new ItemCardapio("Cheeseburger", "Pão, hambúrguer artesanal, queijo cheddar e molho especial.", 22.90));
        cardapio.add(new ItemCardapio("Bacon Burger", "Pão, hambúrguer artesanal, queijo prato, bacon crocante e maionese da casa.", 27.50));
        cardapio.add(new ItemCardapio("Veggie Burger", "Hambúrguer de grão-de-bico, salada fresca e molho vegano.", 24.00));
        cardapio.add(new ItemCardapio("Batata Frita", "Porção média de batata frita crocante.", 12.00));
        cardapio.add(new ItemCardapio("Refrigerante Lata", "Coca-Cola, Guaraná ou Sprite.", 6.00));

        System.out.println("=== CARDAPIO HAMBURGUERIA ===\n");
        for (ItemCardapio item : cardapio) {
            System.out.println(item);
        }
    }
}