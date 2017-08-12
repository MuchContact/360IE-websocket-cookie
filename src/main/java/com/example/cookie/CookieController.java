package com.example.cookie;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CookieController {
    @RequestMapping("/cookie")
    public String getCookie(@CookieValue(value = "eUrbanGlobalLogo", defaultValue = "eUrbanGlobalLogo not found") String eUrbanGlobalLogo, @CookieValue(value = "theworld_client_none", defaultValue = "client not found") String theworld_client_none) {
        return String.format("eUrbanGlobalLogo:%s\ntheworld_client_none:%s", eUrbanGlobalLogo, theworld_client_none);
    }
}
