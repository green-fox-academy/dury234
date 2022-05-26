package com.gfa.brokerchat.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gfa.brokerchat.models.*;
import com.gfa.brokerchat.services.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final MessageService messageService;

    @PostMapping(value = "/login")
//    @ResponseBody
    public String login(@ModelAttribute("loginDto") LoginDto loginDto, Model model) throws JsonProcessingException {

        LoginResponseDto loginResponseDto = messageService.login(loginDto);

        model.addAttribute("user", loginResponseDto);

        messageService.setApiKey(loginResponseDto.getApiKey());


        return "redirect:/info";
//        return apiKey;
//        return restTemplate.postForObject("https://rafale-p2p-chat.herokuapp.com/api/user/login", objectMapper.writeValueAsString(loginDto), LoginResponseDto.class);
    }

    @GetMapping("/login")
    public String getLogin(Model model, @ModelAttribute("loginDto") LoginDto loginDto) {
        return "login";
    }

    @GetMapping("/info")
    public String getInfo(Model model) {

        model.addAttribute("user", messageService.getUser());

//        restTemplate.exchange("https://rafale-p2p-chat.herokuapp.com/api/user/info", HttpMethod.GET, requestEntity, UserInfoDto.class);

        return "info";
    }

    @PostMapping("/logout")
    public String logout() {

        messageService.logout();

        return "redirect:/login";
    }

    @GetMapping("/get-messages")
    public String getMessages(Model model, @ModelAttribute("newMessage") NewMessageReqDto newMessage) {

        model.addAttribute("messages", messageService.getMessages(10));

//        restTemplate.exchange("https://rafale-p2p-chat.herokuapp.com/api/channel/get-messages", HttpMethod.POST, requestEntity, MessagesResponseDto.class);

        return "messages";
    }

    @PostMapping("/send-message")
    public String sendMessage(Model model, @ModelAttribute("newMessage") NewMessageReqDto newMessage) {

        messageService.sendMessage(newMessage);

        return "redirect:/get-messages";
    }

    @GetMapping("/update")
    public String getUpdate(Model model) {

        UpdateInfoDto userToUpdate = messageService.userToUpdateDto(messageService.getUser());

        model.addAttribute("userToUpdate", userToUpdate);

        return "updateInfo";
    }

    @PostMapping("/update")
    public String postUpdate(Model model, @ModelAttribute("userToUpdate") UpdateInfoDto userToUpdate) {

        messageService.updateUserInfo(userToUpdate);

        return "redirect:/info";

    }
}
