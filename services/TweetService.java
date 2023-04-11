package com.api.twiteroo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.api.twiteroo.DTOs.PostTweetDTO;
import com.api.twiteroo.models.Tweet;
import com.api.twiteroo.models.User;
import com.api.twiteroo.repositories.TweetRepository;
import com.api.twiteroo.repositories.UserRepository;

import org.springframework.data.domain.Sort;

@Service
public class TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private UserRepository userRepository;

    public Tweet create(PostTweetDTO data) {
        List<User> users = userRepository.findByUsername(data.username());
        User user = users.get(0);

        return tweetRepository.save(new Tweet(data, user.getAvatar()));

    }

    public Page<Tweet> findAll(int page) {

        PageRequest pageRequest = PageRequest.of(page, 5, Sort.Direction.DESC, "id");

        return tweetRepository.findAll(pageRequest);

    }

    public List<Tweet> findByUser(String username) {
        return tweetRepository.findByUsername(username);
    }

}
