package com.website.userform.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.website.userform.Entity.Userform;
import com.website.userform.Service.UserformService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class UserformController {

    @Autowired
    private UserformService userformService;

    @GetMapping
    public List<Userform> getList() {
        return userformService.showList();
    }

    @GetMapping("/{id}")
    public Userform getData(@PathVariable Long id) {
        return userformService.showData(id);
    }

    @PostMapping
    public Userform postList(@RequestBody Userform userform) {
        return userformService.saveList(userform);
    }

    @DeleteMapping("/{id}")
    public void deleteList(@PathVariable Long id) {
        userformService.deleteList(id);
    }

    @PutMapping("/{id}")
    public Userform putMethodName(@PathVariable Long id, @RequestBody Userform userform) {
        return userformService.putList(userform, id);
    }

}
