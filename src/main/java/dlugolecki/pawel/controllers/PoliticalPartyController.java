package dlugolecki.pawel.controllers;

import dlugolecki.pawel.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/politicalParties")
public class PoliticalPartyController {

    private final AppService appService;

    @GetMapping
    public String getAllPoliticalParties(Model model) {
        model.addAttribute("politicalParties", appService.getAllPoliticalParties());
        return "politicalParties/all";
    }
}