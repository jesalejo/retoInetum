package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {

    // Metodo para verificar si estamos en la página de productos
    public boolean isAt() {
        return getDriver().getCurrentUrl().contains("inventory.html");
    }

    // Metodo para agregar un producto al carrito basado en el nombre del producto
    public void addProductToCart(String producto) {
        // Dependiendo del producto, seleccionamos el botón de agregar al carrito adecuado
        By productButton;

        switch (producto) {
            case "Sauce Labs Backpack":
                productButton = By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']");
                break;
            case "Sauce Labs Bike Light":
                productButton = By.xpath("//button[@data-test='add-to-cart-sauce-labs-bike-light']");
                break;

            default:
                productButton = By.xpath("//button[contains(@class, 'btn_inventory')]");
                break;
        }

        $(productButton).click();
    }
}