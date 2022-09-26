package assign_2nd.regInfo.post.domain;

import assign_2nd.regInfo.post.dto.BoardDto;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Board extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length =100, nullable = false)
  private String name;

  @Column(nullable = false)
  private Integer age;

  @Column(length = 100, nullable = false)
  private String major;

  @Column(length = 250, nullable = false)
  private String introduction;

  @Builder
  public Board(Long id, String name, Integer age, String major, String introduction) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.major = major;
    this.introduction = introduction;
  }

  public void update(BoardDto boardDto) {
    this.name = boardDto.getName();
    this.age = boardDto.getAge();
    this.major = boardDto.getMajor();
    this.introduction = boardDto.getIntroduction();
  }
}
