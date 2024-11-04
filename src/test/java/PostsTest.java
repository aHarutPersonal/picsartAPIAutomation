import com.picsart.clients.PostsService;
import com.picsart.clients.UsersClient;
import com.picsart.models.Post;
import org.apache.commons.lang3.RandomUtils;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

public class PostsTest extends BaseTest {

    @Test
    public void verifyCreationOfPost() {
        SoftAssertions softly = new SoftAssertions();
        var randomUserId = RandomUtils.nextInt(1, 10);
        var randomUser = new UsersClient().getUser(randomUserId);
        System.out.println(randomUser);
        new PostsService().getPostsByUserId(randomUserId).forEach(post -> {
            softly.assertThat(post.getUserId()).isEqualTo(randomUserId);
            softly.assertThat(post.getTitle()).isNotBlank();
            softly.assertThat(post.getBody()).isNotBlank();
            softly.assertThat(post.getId()).isBetween(1, 100);
        });
        softly.assertAll();
        var post = Post.getRandom(randomUserId);
        var createdPost = new PostsService().createPost(post);
        Assertions.assertThat(createdPost.getId()).isEqualTo(101);
    }
}
