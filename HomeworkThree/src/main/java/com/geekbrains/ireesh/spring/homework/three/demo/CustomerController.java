package com.geekbrains.ireesh.spring.homework.three.demo;

import com.geekbrains.ireesh.spring.homework.three.demo.entities.Customer;
import com.geekbrains.ireesh.spring.homework.three.demo.entities.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer_list")
public class CustomerController {
    private SQLConversation sqlConversation;

    public CustomerController(SQLConversation sqlConversation) {
        this.sqlConversation = sqlConversation;
    }

    @GetMapping
    public String showAllCustomers(Model model) {
        List<Customer> customers = sqlConversation.getCustomerList();
        model.addAttribute("customers", customers);
        return "customer_list";
    }

    @PostMapping
    public String addNewCustomer(@ModelAttribute Customer customer) {
        sqlConversation.addCustomer(customer);
        return "redirect:/customer_list";
    }
}
