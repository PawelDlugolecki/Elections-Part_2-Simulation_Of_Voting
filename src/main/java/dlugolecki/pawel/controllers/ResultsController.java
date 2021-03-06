package dlugolecki.pawel.controllers;

import dlugolecki.pawel.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/results")
public class ResultsController {

    private final AppService appService;

    @GetMapping
    public String getAllCandidatesSortedByVotes(Model model) {
        model.addAttribute("winners", appService.winnersFromEachConstituency());
        return "results/all";
    }
}