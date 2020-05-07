package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @RequestMapping("")
    @ResponseBody
    public String startSkills () {
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<a href='/form'>Make My Own Skills List</a>";

        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        String html = "<form method='post'>" +
                "<label>Name:</label>" +
                "<input type='text' name='name'/><br>" +
                "<label>My favorite language:</label><br>" +
                "<select name='firstChoice'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label>My second favorite language:</label><br>" +
                "<select name='secondChoice'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label>My third favorite language:</label><br>" +
                "<select name='thirdChoice'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'/>" +
                "</form>" +
                "<a href='/'>Back to Skills Tracker</a>";

        return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String createSkillsAnswer(@RequestParam String name,
                                     @RequestParam String firstChoice,
                                     @RequestParam String secondChoice,
                                     @RequestParam String thirdChoice) {
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>" +
                "<a href='/form'>Back to Form</a><br>" +
                "<a href='/'>Back to Skills Tracker</a>";
        return html;
    }


}
