package com.mikaila.springbootsoapwebservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="articles")
public class Article implements Serializable{
	/*** default*/
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="article_id")
private long articleId;

@Column(name="title")
private String title;

@Column(name="category")
private String category;


public long getArticleId() {
	return articleId;
}
public void setArticleId(long articleId) {
	this.articleId = articleId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
@Override
public String toString() {
	return String.format("Article [articleId=%s, title=%s, category=%s]", articleId, title, category);
}



}
