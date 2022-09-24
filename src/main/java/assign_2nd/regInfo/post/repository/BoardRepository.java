package assign_2nd.regInfo.post.repository;

import assign_2nd.regInfo.post.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
