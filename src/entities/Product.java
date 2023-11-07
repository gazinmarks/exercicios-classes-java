package entities;

import org.w3c.dom.ls.LSOutput;

public class Product { // Essa é a classe do nosso programa.

    public String name;
    public double price;
    public int quantity;
    // Esses são os atributos da nossa classe (váriaveis).

    public Product(String name, double price, int quantity){ // CONSTRUTOR PARA ATRIBUIR VALORES AOS ATRIBUTOS
        this.name = name;                                    // E EVITAR QUE FIQUEM VAZIOS
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){        // SOBRECARGA DE CONSTRUTOR INFERINDO APENAS NOME E PREÇO
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    } // Método que retorna o valor total em estoque da nossa classe Product.

    public void addProducts(int quantity) {
        this.quantity += quantity;
    } // Método que adiciona produtos na nossa classe Product.

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    } // Método que remove produtos na nossa classe Product.

    public String toString() { // Método toString que sobrescreve o objeto
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, "
                + "Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
