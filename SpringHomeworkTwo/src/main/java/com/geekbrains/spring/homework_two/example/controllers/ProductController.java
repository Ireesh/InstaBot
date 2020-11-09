package com.geekbrains.spring.homework_two.example.controllers;

import com.geekbrains.spring.homework_two.example.model.Product;
import com.geekbrains.spring.homework_two.example.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/storage")
public class ProductController {
    private ProductService productService;

    @Autowired
    public  ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String showAllProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "storage";
    }

    @GetMapping("/add")
    public String showAddForm() {
        return "add_product_form";
    }

    @PostMapping("/add")
    public String saveNewProduct(@ModelAttribute Product newProduct) {
        productService.saveNewProduct(newProduct);
        return "redirect:/storage";
    }

}
