package com.example.springWeb2.business.abstarctt;

import java.util.List;

import com.example.springWeb2.business.request.forUser.CreateUserRequest;
import com.example.springWeb2.business.request.forUser.UpdateUserRequest;
import com.example.springWeb2.business.response.forUsers.GetAllUserResponse;
import com.example.springWeb2.business.response.forUsers.GetByIdUserResponse;

public interface UserService {
	List<GetAllUserResponse> getAll();
	GetByIdUserResponse getById(int id);
	void add(CreateUserRequest createUserRequest);
	void uptade(UpdateUserRequest updateUserRequest);
	void delete(int id);

}
