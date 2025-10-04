package ie.atu.week3cicd;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {
    List<product> mylist = new ArrayList<>();

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/ProductDetails")
    public List<product> ProductDetails(){
        product myProduct = new product("Tv", 499);
        return mylist;
    }

    @PostMapping("/addProduct")
    public product addProduct(@Valid @RequestBody product myProduct){

        mylist.add(myProduct);
        return myProduct;
    }

    @GetMapping("/count")
    public int count(){
        return mylist.size();
    }
}
