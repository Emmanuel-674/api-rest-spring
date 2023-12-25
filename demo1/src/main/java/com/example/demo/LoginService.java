package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;

@Service
public class LoginService {
    ArrayList<UsuarioModel2> users = new ArrayList<>();

    public UsuarioModel2 consultarUsuario() {
        UsuarioModel2 emmanuel = new UsuarioModel2();
        emmanuel.setUser(encriptarNombre("emmanuelmm"));
        return emmanuel;
    }

    public String encriptarNombre(String nombre) {
        nombre = nombre.replace("m", "*");
        nombre = nombre.replace("n", "*");
        return nombre;
    }

    public ArrayList<UsuarioModel2> getUsers(){
        return users;
    }

    public UsuarioModel2 getUser(int id){
        for (UsuarioModel2 user : users){
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public ArrayList<UsuarioModel2> createUser(UsuarioModel2 user){
        users.add(user);
        return users;
    }
    public ArrayList<UsuarioModel2> updateUser(UsuarioModel2 user){
        Iterator<UsuarioModel2> iterator = users.iterator();
        while (iterator.hasNext()){
            UsuarioModel2 userToModify = iterator.next();
            if (userToModify.getId() == user.getId()){
                iterator.remove();
                users.add(user);
                break;
            }
        }
        return users;
    }

    public ArrayList<UsuarioModel2> deleteUser(UsuarioModel2 user){
        Iterator<UsuarioModel2> iterator = users.iterator();
        while (iterator.hasNext()){
            UsuarioModel2 element = iterator.next();
            if (element.getId() == user.getId()){
                iterator.remove();
                break;
            }
        }
        for1:for (UsuarioModel2 user3 : users){
            f2:for (UsuarioModel2 user2 : users){
                continue for1;
            }
        }
        return users;
    }


    {
        for (int i = 0; i < 15; i++) {
            users.add(new UsuarioModel2(i,"usuario-"+i,"usuario-"+i));
            System.out.println("x");
        }
    }


}
