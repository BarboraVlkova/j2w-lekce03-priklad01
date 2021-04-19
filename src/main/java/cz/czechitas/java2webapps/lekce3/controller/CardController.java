package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

// BOD 1
@Controller
public class CardController {

    // BOD 3
    @GetMapping ("/")

    // BOD 2
    public ModelAndView card() {

        // BOD 6
        // nastavena instance tridy Person

        // BOD 7
        // nastaveni pres konstruktor, tzn. vse na jednom radku
        Person person = new Person("Honza","Palach", LocalDate.of(1958,8,11) );

        ModelAndView card = new ModelAndView("card");
        card.addObject("person", person);
        return card;
    }
}
