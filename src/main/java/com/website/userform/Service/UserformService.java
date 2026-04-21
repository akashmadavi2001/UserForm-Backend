package com.website.userform.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.website.userform.Entity.Userform;
import com.website.userform.Error.UserNotFound;
import com.website.userform.Repository.UserformRepository;

@Service
public class UserformService {

    @Autowired
    private UserformRepository userformRepository;

    public List<Userform> showList() {
        return userformRepository.findAll();
    }

    public Userform showData(Long id) {
        return userformRepository.findById(id)
                .orElseThrow(() -> new UserNotFound());
    }

    public Userform saveList(Userform userform) {
        return userformRepository.save(userform);
    }

    public void deleteList(Long id) {
        userformRepository.deleteById(id);
    }

    public Userform putList(Userform userform, Long id) {
        return userformRepository.findById(id)
                .map(user -> {
                    user.setName(userform.getName());
                    user.setDate(userform.getDate());
                    user.setEmail(userform.getEmail());
                    return userformRepository.save(user);
                }).orElseThrow(() -> new UserNotFound());
    }

}
