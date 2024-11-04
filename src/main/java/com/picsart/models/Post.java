package com.picsart.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Post {
	private Integer id;
	private String title;
	private String body;
	private Integer userId;


	public static Post getRandom(int userId) {
		return Post.builder()
				.title(RandomStringUtils.randomAlphabetic(10))
				.body(RandomStringUtils.randomAlphabetic(10))
				.userId(userId)
				.build();
	}
}