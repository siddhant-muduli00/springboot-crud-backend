
package com.example.usercrud;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class UserController {

 private final UserRepository repo;

 public UserController(UserRepository repo) {
   this.repo = repo;
 }

 @GetMapping
 public List<User> getAll() {
   return repo.findAll();
 }

 @PostMapping
 public User save(@RequestBody User user) {
   return repo.save(user);
 }

 @DeleteMapping("/{id}")
 public void delete(@PathVariable Long id) {
   repo.deleteById(id);
 }
}
