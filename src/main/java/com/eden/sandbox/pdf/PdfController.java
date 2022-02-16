package com.eden.sandbox.pdf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/pdf")
@Controller
public class PdfController {

  private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

  @GetMapping("")
  public String main(Model model) {

//    ModelMap model = new ModelMap();
    model.addAttribute("message", "message");
    model.addAttribute("tasks", tasks);
    return "pdf/index";
  }

}
