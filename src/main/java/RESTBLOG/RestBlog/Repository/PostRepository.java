package RESTBLOG.RestBlog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import RESTBLOG.RestBlog.Entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

  
} 