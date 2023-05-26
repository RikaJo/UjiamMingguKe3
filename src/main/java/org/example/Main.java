package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        System.out.println("Open Browser");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Fitur Login
        driver.get("https://shop.demoqa.com/");
        System.out.println("Enter Login URL");
        System.out.println(driver.getTitle());

        driver.findElement(By.id("username")).sendKeys("Rika"); // Ganti dengan username yang valid
        driver.findElement(By.id("password")).sendKeys("Rika12345"); // Ganti dengan password yang valid
        driver.findElement(By.cssSelector("button[name='login']")).click();
        System.out.println("Button Login clicked");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Fitur Add 1 product to cart
        driver.get("https://shop.demoqa.com/product/tokyo-talkies/");
        System.out.println("Enter Product URL");
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("https://shop.demoqa.com/product/tokyo-talkies/")).click();
        driver.findElement(By.cssSelector(".https://shop.demoqa.com/product/tokyo-talkies/")).click();
        System.out.println("Button Add to cart clicked");

        try {
            Thread.sleep(3000); // Delay 3 detik untuk memberikan waktu produk ditambahkan ke keranjang
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
        System.out.println("Close Browser");
    }
}