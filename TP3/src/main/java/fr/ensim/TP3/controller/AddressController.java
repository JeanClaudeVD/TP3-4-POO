package fr.ensim.TP3.controller;

import fr.ensim.TP3.model.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddressController {
    @Autowired
    AdresseRepository addressRepository;
    @GetMapping("/addresses")
    public String showAddresses(Model model) {
        model.addAttribute("allAddresses", addressRepository.findAll());
        return "addresses";
    }
}
