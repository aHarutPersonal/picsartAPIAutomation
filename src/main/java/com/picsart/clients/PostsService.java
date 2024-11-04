package com.picsart.clients;

import java.util.List;

import com.picsart.models.Post;
import io.restassured.RestAssured;

public class PostsService extends BaseApi {
    public PostsService() {
        super("posts");
    }

    public List<Post> getPostsByUserId(int userId) {
        return RestAssured.given(requestSpecification).queryParam("userId", userId).get().jsonPath().getList("", Post.class);
    }

    public Post createPost(Post post) {
        return RestAssured.given(requestSpecification).body(post).post().as(Post.class);
    }
}
