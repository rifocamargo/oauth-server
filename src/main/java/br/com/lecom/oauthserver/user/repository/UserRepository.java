package br.com.lecom.oauthserver.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lecom.oauthserver.user.model.User;

public interface UserRepository extends JpaRepository<User, String> {

	User findByUsernameIgnoreCase(String username);

    User findByEmail(String email);
}
