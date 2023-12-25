package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping(path = "/login/")
@RestController
public class LoginController {
    @Autowired
    LoginService service;

    @PostMapping(path = "user/")
    public UsuarioModel login(@RequestBody UsuarioModel david) {
        UsuarioModel emmanuel = new UsuarioModel();
        emmanuel.setUser("emmanuel");
        UsuarioModel model = new UsuarioModel();
        david.setPersonaAsociada(emmanuel);
        model = (david.getUser().equalsIgnoreCase("david")) ? david : emmanuel;

        if (david.getUser().equalsIgnoreCase("david")) {
            david.setPersonaAsociada(emmanuel);
            return david;
        } else {
            return emmanuel;
        }
    }

    @GetMapping(path = "user/")
    public UsuarioModel getEmmanuel() {
        UsuarioModel emmanuel = new UsuarioModel();
        emmanuel.setUser("emmanuel");

        return emmanuel;
    }

    @GetMapping(path = "user/asociado", produces =  MediaType.APPLICATION_JSON_VALUE)
    public UsuarioModel2 getEmmanuelYAsociado() {
        UsuarioModel2 emmanuel = new UsuarioModel2();
        emmanuel.setUser("emmanuel");
        return emmanuel;
    }

    @GetMapping(path = "consulta/login", produces =  MediaType.APPLICATION_JSON_VALUE)
    public UsuarioModel2 consultarLogin() {
        return service.consultarUsuario();
    }

    @GetMapping(path = "consulta/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<UsuarioModel2> consultarUsers() {
        return service.getUsers();
    }

    @PostMapping(path = "/users/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<UsuarioModel2> createUser(@RequestBody UsuarioModel2 user) {
        return service.createUser(user);
    }

    @PutMapping(path = "/users/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<UsuarioModel2> updateUser(@RequestBody UsuarioModel2 user) {
        return service.updateUser(user);
    }

    @DeleteMapping(path = "/users/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<UsuarioModel2> deleteUser(@RequestBody UsuarioModel2 user) {
        return service.deleteUser(user);
    }

    @GetMapping(path = "consulta/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UsuarioModel2 consultarUser(@PathVariable int id) {
        return service.getUser(id);
    }

    @GetMapping(path = "consulta/user/params", produces = MediaType.APPLICATION_JSON_VALUE)
    public UsuarioModel2 consultarUserParams(@RequestParam(name = "id") int id) {
        return service.getUser(id);
    }

}
