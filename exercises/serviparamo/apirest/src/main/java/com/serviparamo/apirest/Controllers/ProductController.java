package com.serviparamo.apirest.Controllers;
import org.springframework.web.bind.annotation.RestController;
import com.serviparamo.apirest.Entities.Product;
import com.serviparamo.apirest.Repositories.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/product")

public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    @GetMapping("/{id}")
    public Product getProducById(@PathVariable Long id){
        return productRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("no se encontro el producto con el codigo "+id));
    }


    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product detailProduct) {
        Product product= productRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("no se encontro el producto con el codigo "+id));

        product.setNombre(detailProduct.getNombre());
        product.setPrecio(detailProduct.getPrecio());

        return productRepository.save(product);

    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        Product product= productRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("no se encontro el producto con el codigo "+id));

        productRepository.delete(product);
        return "el proucto con el id "+id+" fue eliminado correctamente";

    }

}
