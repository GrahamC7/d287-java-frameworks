package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.PartService;
import com.example.demo.service.PartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class BuyNowController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long theID, Model model) {
        Optional<Product> productToBuy = productRepository.findById(theID);

        if (productToBuy.isPresent()) {
            // product in stock check
            Product product = productToBuy.get();

            if (product.getInv() > 0) {
                // product currently in stock check
                product.setInv(product.getInv() - 1); // stock decrementing
                productRepository.save(product); // saving current product database

                return "/purchaseSuccess"; // purchase successful
            }
            else {
                return "/purchaseFailure"; // purchase failure
            }
        }
        else {
            return "/purchaseFailure"; // purchase failure due to product not found in inventory
        }
    }
}
