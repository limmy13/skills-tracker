package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String h1() {
        return "<html>" +
                "<h1 style='font-size:30px;margin-bottom:1em;'>" +
                "Skills Tracker" +
                "</h1>" +
                "<h2 style='font-size:25px'>" +
                "We have a few styles we would like to learn. Here's the list!" +
                "<ol>" +
                "<li style='font-weight:normal;font-size:20px'>Java</li>" +
                "<li style='font-weight:normal;font-size:20px'>JavaScript</li>" +
                "<li style='font-weight:normal;font-size:20px'>Python</li>" +
                "</h2>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String languageForm() {
        return "<html>" +
                "<form method=\"post\">" +
                "Name:" + "<br>" +
                "<input type='text' name=\"name\">" + "<br>" +
                "My Favorite Language:" + "<br>" +
                "<select name='first'>" + "<br>" +
                "<option value='Java'>Java</option>" + "<br>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +

                "<br>" +
                "My Second Favorite Language:" + "<br>" +
                "<select name='second'>" + "<br>" +
                "<option value='Java'>Java</option>" + "<br>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +

               "<br>" +
                "My Third Favorite Language:" + "<br>" +
                "<select name='third'>" + "<br>" +
                "<option value='Java'>Java</option>" + "<br>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" + "<br>" +

                "<input type='submit' name=\"submit\">" +

                "</form>" +
                "</body>" +
                "</html>";

    }

    @PostMapping("/form")
    @ResponseBody
    public String filledOutForm(@RequestParam String name, @RequestParam String first,
                                @RequestParam String second, @RequestParam String third) {
        return "<html>" +
                "<body>" +
                "<h1>" +
                name +
                "</h1>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }


}
