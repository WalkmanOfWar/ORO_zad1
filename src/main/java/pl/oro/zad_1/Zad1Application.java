package pl.oro.zad_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/")
public class Zad1Application {

	private final OrderPartRepository orderPartRepository;
	private final UserRepository userRepository;
	private final OrderRepository orderRepository;
	Zad1Application(OrderPartRepository orderPartRepository, UserRepository userRepository, OrderRepository orderRepository) {
		this.orderPartRepository = orderPartRepository;
		this.userRepository = userRepository;
		this.orderRepository = orderRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(Zad1Application.class, args);
	}

	@GetMapping("zad1")
	public Long zad1(){
		return orderRepository.countAllOrders();
	}
	@GetMapping("zad2/{id}")
	public Long zad2(@PathVariable("id") Long id) {
		return orderPartRepository.countOrdersForPart(id);
	}
	@GetMapping("zad3/{id}")
	public Long zad3(@PathVariable("id") Long id) {
		return orderRepository.countOrdersForUser(id);
	}
	@GetMapping("zad4/{email}")
	public User zad4(@PathVariable("email") String email) {
		return userRepository.findByEmail(email);
	}
	@GetMapping("zad5/{min}/{max}")
	public List<Part> zad5(@PathVariable("min") BigDecimal min, @PathVariable("max") BigDecimal max) {
		return orderPartRepository.findByPriceBetween(min, max);
	}
}
