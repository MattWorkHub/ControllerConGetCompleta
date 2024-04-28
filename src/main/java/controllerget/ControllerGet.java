package controllerget;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class ControllerGet {
    @GetMapping("/ciao/{location}")
    public User hello(@RequestParam String nome,
                     @PathVariable String location){
        User user = new User(nome,location);
        user.sayHello();
        return user;
    }
}
