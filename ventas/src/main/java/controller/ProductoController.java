package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Producto;

@RestController
@RequestMapping("/ventas")

public class ProductoController {
	@GetMapping("/all")
	List<Producto>all(){ return Arrays.asList(new Producto(1, "Remeras", "Adidas", 3));
	}
	@PostMapping("/nuevaVenta")
	List<Producto>save(@RequestBody Producto producto) {return save(producto);}
	
}
