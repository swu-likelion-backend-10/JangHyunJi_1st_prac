package assign_2nd.regInfo.post.Controller;

import assign_2nd.regInfo.post.dto.BoardDto;
import assign_2nd.regInfo.post.dto.MemberDto;
import assign_2nd.regInfo.post.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class MemberController {
  private MemberService memberService;

  @GetMapping("user/signup")
  public String signUpForm() {
    return "users/signup.html";
  }

  @PostMapping("user/signup")
  public String signUp(MemberDto memberDto) {
    memberService.joinUser(memberDto);
    return "redirect:/";
  }

  @GetMapping("user/login")
  public String member() {
    return "users/login.html";
  }

  @GetMapping("/admin")
  public String list(Model model) {
    List<MemberDto> memberDtoList = memberService.getMemberlist();
    model.addAttribute("memberList", memberDtoList);

    return "board/admin.html";
  }

}
