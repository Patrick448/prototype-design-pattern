package produto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


    @Test
    void deveRetornarClone() throws CloneNotSupportedException {
        Product product = new Product("Shampoo", 10.99, "Higiene Pessoal", 100);
        Product clone = product.clone();
        clone.setName("Sabonete");

        assertEquals("Shampoo,10.99,Higiene Pessoal,100", product.toString());
        assertEquals("Sabonete,10.99,Higiene Pessoal,100", clone.toString());

    }

}