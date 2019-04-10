package dlugolecki.pawel.controllers;

import dlugolecki.pawel.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/candidates")
public class CandidateController {

    private final AppService appService;

    @GetMapping("/politicalParty/{id}")
    public String getCandidatesFromPoliticalParty(@PathVariable Long id, Model model) {
        model.addAttribute("candidates", appService.getAllCandidatesByPoliticalPartyId(id));
        return "candidates/all";
    }

    @GetMapping("/constituency/{id}/voter/{vid}")
    public String getCandidatesFromConstituency(
            @PathVariable Long id, @PathVariable Long vid, Model model) {
        model.addAttribute("candidates", appService.getAllCandidatesByConstituencyId(id));
        model.addAttribute("voterId", appService.getVoterById(vid));
        return "candidates/all";
    }

    @GetMapping("/vote/{id}")
    public String addVoteToThisCandidate(@PathVariable Long id) {

        appService.addVoteToCandidate(id);
        return "redirect:/vote/{id}";
    }

    @PostMapping("/vote")
    public String addVoteToThisCandidatePost(
            @RequestParam Long id, @RequestParam Long vid) {
        appService.addVoteToThisCandidate(id, vid);
        return "redirect:/voters/enterToken";
    }

}