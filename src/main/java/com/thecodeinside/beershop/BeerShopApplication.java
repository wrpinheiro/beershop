package com.thecodeinside.beershop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Application startup class.
 *
 * @author Wellington Pinheiro <wellington.pinheiro@gmail.com>
 */
@EnableAutoConfiguration
@ComponentScan
public class BeerShopApplication {

  public static void main(String[] args) {
    SpringApplication.run(BeerShopApplication.class, args);
  }
}
