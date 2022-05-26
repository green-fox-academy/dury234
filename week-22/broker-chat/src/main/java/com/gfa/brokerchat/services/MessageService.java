package com.gfa.brokerchat.services;

import com.gfa.brokerchat.models.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Data
public class MessageService {

    @Autowired
    private RestTemplate restTemplate;

    private String apiKey;

    public HttpHeaders createHeader() {

        HttpHeaders headers = new HttpHeaders();
        headers.set("apiKey", apiKey);
        return headers;
    }

    public HttpEntity createEmptyReqEntity() {
        return new HttpEntity(createHeader());
    }

    public HttpEntity createReqEntity(Object o) {
        return new HttpEntity(o, createHeader());
    }

    public LoginResponseDto login(LoginDto loginDto) {
        return restTemplate.postForObject("https://rafale-p2p-chat.herokuapp.com/api/user/login", loginDto, LoginResponseDto.class);
    }

    public UserInfoDto getUser() {
        return restTemplate.exchange("https://rafale-p2p-chat.herokuapp.com/api/user/info", HttpMethod.GET, createEmptyReqEntity(), UserInfoDto.class).getBody();
    }

    public void logout() {
        restTemplate.exchange("https://rafale-p2p-chat.herokuapp.com/api/user/info", HttpMethod.GET, createEmptyReqEntity(), UserInfoDto.class);
        apiKey = "";
    }

    public MessagesResponseDto getMessages(int count) {
        return restTemplate.exchange("https://rafale-p2p-chat.herokuapp.com/api/channel/get-messages", HttpMethod.POST, createReqEntity(new MessagesRequestDto(count)), MessagesResponseDto.class).getBody();
    }

    public void sendMessage(NewMessageReqDto newMessage) {
        restTemplate.exchange("https://rafale-p2p-chat.herokuapp.com/api/message", HttpMethod.POST, createReqEntity(newMessage), Message.class);
    }

    public UpdateInfoDto userToUpdateDto(UserInfoDto userInfoDto) {

        return UpdateInfoDto.builder()
                .username(userInfoDto.getUsername())
                .avatarUrl(userInfoDto.getAvatarUrl())
                .build();

    }

    public void updateUserInfo(UpdateInfoDto updateInfoDto) {
        restTemplate.exchange("https://rafale-p2p-chat.herokuapp.com/api/user/update", HttpMethod.POST, createReqEntity(updateInfoDto), UpdateResponseDto.class);
    }

}
