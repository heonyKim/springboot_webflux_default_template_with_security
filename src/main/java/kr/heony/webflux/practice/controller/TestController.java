package kr.heony.webflux.practice.controller;

import kr.heony.webflux.practice.document.TestDocument;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j2
@Controller
public class TestController {

    @GetMapping("/testCode")
    public String testCode(Model model){
        TestDocument testDocument = new TestDocument();
        testDocument = TestDocument.builder()
                .name("HeonyKim")
                .age(31)
                .gender("male")
                .build();
        log.debug(testDocument.toString());
//        testDocument.setName("HeonyKim");
//        testDocument.setAge(31);
//        testDocument.setGender("male");
//        System.out.println(testDocument.toString());
        model.addAttribute("test",testDocument);
        return "test";
    }
}
