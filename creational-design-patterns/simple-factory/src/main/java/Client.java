public class Client {

	public static void main(String[] args) {
		Post blogPost = PostFactory.createPost(PostType.BLOG);
		System.out.println(blogPost);

		Post newsPost = PostFactory.createPost(PostType.NEWS);
		System.out.println(newsPost);

		Post productPost = PostFactory.createPost(PostType.PRODUCT);
		System.out.println(productPost);
	}

}
