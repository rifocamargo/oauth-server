package br.com.lecom.oauthserver.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lecom.oauthserver.user.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

}
