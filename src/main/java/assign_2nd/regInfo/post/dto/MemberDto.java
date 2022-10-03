package assign_2nd.regInfo.post.dto;

import assign_2nd.regInfo.post.domain.Member;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {
  private Long id;
  private String email;
  private String password;
  private LocalDateTime createdDate;
  private LocalDateTime modifiedDate;

  public Member toEntity() {
    return Member.builder()
            .id(id)
            .email(email)
            .password(password)
            .build();
  }
  @Builder
  public MemberDto(Long id, String email, String password) {
    this.id = id;
    this.email = email;
    this.password = password;
  }
}
