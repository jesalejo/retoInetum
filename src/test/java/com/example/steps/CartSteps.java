package com.example.steps;

import com.example.pages.CartPage;
import com.example.pages.ProductsPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Entonces;
import static org.junit.Assert.assertTrue;

public class CartSteps {

    private ProductsPage productsPage;
    private CartPage cartPage;

    @Cuando("agrega el producto {string} al carrito")
    public void agregarProductoAlCarrito(String producto) {
        productsPage.addProductToCart(producto); // Metodo que agrega un producto al carrito
    }
    @Cuando("el usuario ve los productos en el carrito")
    public void elUsuarioVeLosProductosEnElCarrito() {
        cartPage.goToCart();
        //assertTrue("El carrito no tiene productos", cartPage.hasProductsInCart());
    }
    @Y("hace clic en el botón de checkout")
    public void hacerCheckout() throws InterruptedException {
        cartPage.proceedToCheckout();
    }

    @Entonces("debería ver los productos en el carrito")
    public void verProductosEnCarrito() {

    }
}