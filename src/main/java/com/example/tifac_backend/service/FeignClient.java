package com.example.tifac_backend.service;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.cloud.openfeign.FeignClient(name = "youtube-api", url = "https://youtube.googleapis.com/youtube/v3")
public interface FeignClient {
    @GetMapping("/search")
    ResponseEntity<?> getSearchResults(@RequestParam String key, @RequestParam String type, @RequestParam String channelId, @RequestParam String part, @RequestParam int maxResults, @RequestParam(defaultValue = "relevance", required = false) String order, @RequestParam String q, @RequestParam(required = false) String pageToken);
}