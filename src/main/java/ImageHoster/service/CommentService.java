package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    //Call the addComment method in the ImageRepository class to persist the user record in the database
    public void addComment(Comment newComment) {
        commentRepository.addComment(newComment);
    }

    //Get all comments associated with an image
    public List<Comment> getCommentsByImageId(Integer imageId) {
        return commentRepository.getCommentsByImageId(imageId);
    }
}
