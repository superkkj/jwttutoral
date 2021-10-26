package superkkj.me.jwttutoral.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import superkkj.me.jwttutoral.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = "authorities") //권한정보를 가져온다 같이
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}
