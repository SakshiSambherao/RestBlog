package RESTBLOG.RestBlog.Service;

import RESTBLOG.RestBlog.Entity.Post;

public interface PostService {
  Post createPost(Post post);
  
  Post getPost(long postId);

  String deletePost(long postId);

  Post updatePost(long id, Post post);
}
