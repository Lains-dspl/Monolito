package com.monolito.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.monolito.models.News;
import com.monolito.services.NewsServices;

@RestController
@CrossOrigin(origins = "*")
public class NewsController {

	@Autowired
	private NewsServices newsServices;

	@RequestMapping(value = "/news/findAll", method = RequestMethod.GET)
	public ResponseEntity<List<News>> findAllNews() {
		List<News> newsList = newsServices.getNews();
		return ResponseEntity.status(HttpStatus.OK).body(newsList);
	}

	@RequestMapping(value = "/news/findById/{id}", method = RequestMethod.GET)
	public ResponseEntity<News> findById(@PathVariable String id) {
		return ResponseEntity.status(HttpStatus.OK).body(newsServices.getNewsById(id));
	}

	@RequestMapping(value = "/news/create", method = RequestMethod.POST)
	public ResponseEntity<News> createNews(@RequestBody News news) {
		return ResponseEntity.status(HttpStatus.OK).body(newsServices.createNews(news));
	}

	@RequestMapping(value = "/news/edit", method = RequestMethod.POST)
	public ResponseEntity<News> editNews(@RequestBody News news) {
		return ResponseEntity.status(HttpStatus.OK).body(newsServices.editNews(news));
	}

	@RequestMapping(value = "/news/delete", method = RequestMethod.POST)
	public ResponseEntity<Boolean> findAllNews(@RequestBody String id) {
		return ResponseEntity.status(HttpStatus.OK).body(newsServices.deleteNews(id));
	}

}
