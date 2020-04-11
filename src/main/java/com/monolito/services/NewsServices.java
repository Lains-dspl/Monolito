package com.monolito.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monolito.models.News;
import com.monolito.repositories.NewsRepository;


@Service
public class NewsServices {

	@Autowired
	private NewsRepository newsRepository;

	public List<News> getNews() {
		return newsRepository.findAll();
	}

	public News getNewsById(String id) {
		return newsRepository.findById(id).get();
	}
	
	public News createNews(News news) {
		return newsRepository.save(news);
	}

	public News editNews(News news) {
		Optional<News> editNews = newsRepository.findById(news.get_id());

		if (editNews.isPresent()) {
			editNews.get().setContent(news.getContent());
			editNews.get().setDescription(news.getDescription());
			editNews.get().setImage(news.getImage());
			editNews.get().setTitle(news.getTitle());
			return newsRepository.save(editNews.get());
		}

		return null;
	}

	public Boolean deleteNews(String id) {
		newsRepository.deleteById(id);
		return newsRepository.findById(id) == null;
	}

}
