package by.ermakovich.search_command.service;

import by.ermakovich.search_command.entity.Users;
import by.ermakovich.search_command.repository.RolesRepository;
import by.ermakovich.search_command.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private RolesRepository rolesRepository;



    public boolean delete(Long id) {
        return false;
    }


    public Users  findByUsername(String userName){
        return usersRepository.findByUsername(userName);
    }

    public Users findByLoginAndPassword(String login, String password){
        return usersRepository.findByUsernameAndPassword(login, password);
    }

    public boolean create(Users request) {
        Users user = new Users();
        user.getRoles().add(rolesRepository.getById(2));
        usersRepository.save(user);
        return true;
    }


}
