package com.geekbrains.ireesh.spring.homework.three.demo;

import com.geekbrains.ireesh.spring.homework.three.demo.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product_storage")
public class ProductController {
    private SQLConversation sqlConversation;

    @Autowired
    public ProductController(SQLConversation sqlConversation) {
        this.sqlConversation = sqlConversation;
    }
    @GetMapping
    public String showAllProducts(Model model) {
        List<Product> products = sqlConversation.getProductsList();
        model.addAttribute("products", products);
        return "product_storage";
    }

//    @PostMapping
//    public String addNewProduct(@ModelAttribute Product product) {
//        sqlConversation.addProduct(product);
//        return "redirect:/product_storage";
//    }

//    @RequestMapping("/delete")
//    public String deleteProduct(@ModelAttribute Product product) {
//        sqlConversation.deleteProduct(product);
//        return "redirect:/product_storage";
//    }

    @PostMapping
    public String deleteProduct(@ModelAttribute Product product) {
        sqlConversation.deleteProduct(product);
        return "redirect:/product_storage";
    }
}
