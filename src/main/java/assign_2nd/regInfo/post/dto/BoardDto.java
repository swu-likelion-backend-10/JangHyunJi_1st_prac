package assign_2nd.regInfo.post.dto;

import assign_2nd.regInfo.post.domain.Board;
import lombok.Builder;


public class BoardDto {
  private Long id;
  private String name;
  private Integer age;
  private String major;
  private String introduction;

  public Board toEntity() {
    Board build= Board.builder()
            .id(id)
            .name(name)
            .age(age)
            .major(major)
            .introduction(introduction)
            .build();
    return build;
  }

  @Builder
  public BoardDto(Long id, String name, Integer age, String major, String introduction) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.major = major;
    this.introduction = introduction;
  }
}
