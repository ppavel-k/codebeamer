

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.Comment;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

/**
 * API tests for TrackerItemsCommentApi
 */
@Disabled
public class TrackerItemsCommentApiTest {

    private final TrackerItemsCommentApi api = new TrackerItemsCommentApi();

    
    /**
     * Comment on a tracker item
     *
     * 
     */
    @Test
    public void commentOnTrackerItemTest()  {
        Integer itemId = null;
        String comment = null;
        String commentFormat = null;
        File attachments = null;
        Comment response = api.commentOnTrackerItem(itemId, comment, commentFormat, attachments);

        // TODO: test validations
    }
    
    /**
     * Delete comment of tracker item by id
     *
     * 
     */
    @Test
    public void deleteTrackerItemCommentTest()  {
        Integer itemId = null;
        Integer commentId = null;
        Comment response = api.deleteTrackerItemComment(itemId, commentId);

        // TODO: test validations
    }
    
    /**
     * Delete comments of tracker item by item id
     *
     * 
     */
    @Test
    public void deleteTrackerItemCommentsTest()  {
        Integer itemId = null;
        api.deleteTrackerItemComments(itemId);

        // TODO: test validations
    }
    
    /**
     * Edit comment on a tracker item
     *
     * 
     */
    @Test
    public void editCommentOnTrackerItemTest()  {
        Integer itemId = null;
        Integer commentId = null;
        String comment = null;
        String commentFormat = null;
        File attachments = null;
        Comment response = api.editCommentOnTrackerItem(itemId, commentId, comment, commentFormat, attachments);

        // TODO: test validations
    }
    
    /**
     * Get comment of tracker item by id
     *
     * 
     */
    @Test
    public void getTrackerItemCommentTest()  {
        Integer itemId = null;
        Integer commentId = null;
        Comment response = api.getTrackerItemComment(itemId, commentId);

        // TODO: test validations
    }
    
    /**
     * Get comments of tracker item
     *
     * 
     */
    @Test
    public void getTrackerItemCommentsTest()  {
        Integer itemId = null;
        List<Comment> response = api.getTrackerItemComments(itemId);

        // TODO: test validations
    }
    
    /**
     * Reply on a comment of a tracker item
     *
     * 
     */
    @Test
    public void replyOnCommentOfTrackerItemTest()  {
        Integer itemId = null;
        Integer commentId = null;
        String comment = null;
        String commentFormat = null;
        File attachments = null;
        Comment response = api.replyOnCommentOfTrackerItem(itemId, commentId, comment, commentFormat, attachments);

        // TODO: test validations
    }
    
}
