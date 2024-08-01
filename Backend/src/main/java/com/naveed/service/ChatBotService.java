package com.naveed.service;

import com.naveed.model.CoinDTO;
import com.naveed.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
