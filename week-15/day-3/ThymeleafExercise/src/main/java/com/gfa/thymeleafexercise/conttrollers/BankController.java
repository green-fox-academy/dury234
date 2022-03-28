package com.gfa.thymeleafexercise.conttrollers;

import com.gfa.thymeleafexercise.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankController {
    BankAccount acc = new BankAccount("Simba", 2000, "lion", true);

    public List<BankAccount> initAccounts() {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount("Mufasa", 100000, "lion", true));
        accounts.add(new BankAccount("Timon", 15250, "meercat", true));
        accounts.add(new BankAccount("Pumba", 500, "warthog", true));
        accounts.add(new BankAccount("Scar", 1, "lion", false));
        accounts.add(new BankAccount("Rafiki", 65320, "monkey", true));
        accounts.add(new BankAccount("Simba", 2000, "lion",true));
        accounts.get(2).setKing(true);
        return accounts;
    }

    List<BankAccount> accounts = initAccounts();


    @GetMapping("/show")
    public String showHandle(Model model) {
        model.addAttribute("account", acc);
        return "index";
    }

    @GetMapping("/HTMLception")
    public String handleHTMLception() {
        return "HTMLception";
    }

    @GetMapping("/multiple-accounts")
    public String multipleAccounts(Model model) {
        model.addAttribute("accounts", accounts);
        return "multipleAccounts";
    }

    @PostMapping("/multiple-accounts")
    public String postMultipleAccounts(@RequestParam("accToRaise") String accToRaise) {

        for (BankAccount account : accounts) {
            if (account.getName().equals(accToRaise)) {
                if (account.isKing()) {
                    account.setBalance(account.getBalance() + 100);
                } else{
                    account.setBalance(account.getBalance() + 10);
                }
            }
        }

        return "redirect:/multiple-accounts";
    }
}
