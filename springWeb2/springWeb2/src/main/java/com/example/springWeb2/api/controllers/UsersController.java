package com.example.springWeb2.api.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.springWeb2.business.abstarctt.UserService;
import com.example.springWeb2.business.request.forUser.CreateUserRequest;
import com.example.springWeb2.business.request.forUser.UpdateUserRequest;
import com.example.springWeb2.business.response.forUsers.GetAllUserResponse;
import com.example.springWeb2.business.response.forUsers.GetByIdUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/api/users")
@Data
@AllArgsConstructor
public class UsersController {
	
	private UserService userService;
	
	@GetMapping()
	public List<GetAllUserResponse> getAll(){
		return userService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdUserResponse getById(@PathVariable int id) {
		return userService.getById(id);
		
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreateUserRequest createUserRequest) {
		this.userService.add(createUserRequest);
	}
	
	@PutMapping
	public void uptade(@RequestBody UpdateUserRequest updateUserRequest) {
		
		this.userService.uptade(updateUserRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.userService.delete(id);
	}
	


}
