package com.engineer.services;

import com.engineer.entity.News;
import com.engineer.repositories.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsService {
    private final NewsRepository newsRepository;

    public void persistNews(byte[] file, News news) {
        news.setTeammatePicture(file);
        newsRepository.save(news);
    }

    public void persistNews( News news) {
        newsRepository.save(news);
    }
}
