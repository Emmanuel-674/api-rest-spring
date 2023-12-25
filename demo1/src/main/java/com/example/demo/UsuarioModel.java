package com.example.demo;

public class UsuarioModel {
    Integer id;
    String user;
    String password;

    UsuarioModel personaAsociada;


    public UsuarioModel() {
    }

    public UsuarioModel(Integer id, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public UsuarioModel getPersonaAsociada() {
        return personaAsociada;
    }

    public void setPersonaAsociada(UsuarioModel personaAsociada) {
        this.personaAsociada = personaAsociada;
    }
}
