/**
 * This class acts as a simple factory for creation of 
 * different posts on web site.
 *
 */
public class PostFactory {

    public static Post createPost(PostType postType) {
        switch(postType) {
            case BLOG:
                return new BlogPost();
            case NEWS:
                return new NewsPost();
            case PRODUCT:
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type is unknown");
        }
    }

}
