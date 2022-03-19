package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping
    private ModelAndView showAllProduct(String name) {
        if (name == null) {
            List<Product> products = this.productService.findAll();
            ModelAndView ModelAndView = new ModelAndView("list");
            ModelAndView.addObject("products", products);
            return ModelAndView;
        }else {
            Product product = this.productService.findById(name);
            ModelAndView ModelAndView = new ModelAndView("view");
            ModelAndView.addObject("product", product);
            return ModelAndView;

        }

    }

    @GetMapping("/create")
    private ModelAndView showFormCreate() {
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    private ModelAndView edit(@PathVariable int id) {
        Product product = this.productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    private ModelAndView delete(@PathVariable int id) {
        Product product = this.productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    private ModelAndView detail(@PathVariable int id) {
        Product product = this.productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @PostMapping("/create")
    private ModelAndView createNewProduct(int id, String name, int price, int quantity, String description) {
        Product product = new Product(id, name, price, quantity, description);
        this.productService.create(product);
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    private ModelAndView editProduct(@PathVariable int id, String name, int price, int quantity, String description) {
        Product product = new Product(id, name, price, quantity, description);
        this.productService.update(id, product);
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        return modelAndView;
    }

    @PostMapping("/delete/{id}")
    private ModelAndView deleteProduct(@PathVariable int id) {
        this.productService.delete(id);
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        return modelAndView;
    }


}
