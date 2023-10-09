

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.Attachment;
import codebeamer.rampup.client.model.AttachmentSearchResult;
import codebeamer.rampup.client.model.TrackerItemAttachmentRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

/**
 * API tests for TrackerItemsAttachmentApi
 */
@Disabled
public class TrackerItemsAttachmentApiTest {

    private final TrackerItemsAttachmentApi api = new TrackerItemsAttachmentApi();

    
    /**
     * Delete attachment of tracker item by id
     *
     * 
     */
    @Test
    public void deleteTrackerItemAttachmentTest()  {
        Integer itemId = null;
        Integer attachmentId = null;
        Attachment response = api.deleteTrackerItemAttachment(itemId, attachmentId);

        // TODO: test validations
    }
    
    /**
     * Delete attachments of tracker item
     *
     * 
     */
    @Test
    public void deleteTrackerItemAttachmentsTest()  {
        Integer itemId = null;
        api.deleteTrackerItemAttachments(itemId);

        // TODO: test validations
    }
    
    /**
     * Get attachment of tracker item by id
     *
     * 
     */
    @Test
    public void getTrackerItemAttachmentTest()  {
        Integer itemId = null;
        Integer attachmentId = null;
        Attachment response = api.getTrackerItemAttachment(itemId, attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get content of an attachment of tracker item by id
     *
     * 
     */
    @Test
    public void getTrackerItemAttachmentContentTest()  {
        Integer itemId = null;
        Integer attachmentId = null;
        File response = api.getTrackerItemAttachmentContent(itemId, attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get attachments of a tracker item
     *
     * 
     */
    @Test
    public void getTrackerItemAttachmentContentsTest()  {
        Integer itemId = null;
        File response = api.getTrackerItemAttachmentContents(itemId);

        // TODO: test validations
    }
    
    /**
     * Get attachments of tracker item
     *
     * 
     */
    @Test
    public void getTrackerItemAttachmentsTest()  {
        Integer itemId = null;
        String fileName = null;
        AttachmentSearchResult response = api.getTrackerItemAttachments(itemId, fileName);

        // TODO: test validations
    }
    
    /**
     * Get attachments of tracker items matching the extension or mime type filters
     *
     * 
     */
    @Test
    public void getTrackerItemsAttachmentContentsTest()  {
        TrackerItemAttachmentRequest trackerItemAttachmentRequest = null;
        File response = api.getTrackerItemsAttachmentContents(trackerItemAttachmentRequest);

        // TODO: test validations
    }
    
    /**
     * Update content of attachment of tracker item
     *
     * 
     */
    @Test
    public void updateAttachmentOfTrackerItemTest()  {
        Integer itemId = null;
        Integer attachmentId = null;
        String description = null;
        String descriptionFormat = null;
        File content = null;
        Attachment response = api.updateAttachmentOfTrackerItem(itemId, attachmentId, description, descriptionFormat, content);

        // TODO: test validations
    }
    
    /**
     * Upload an attachment to a tracker item
     *
     * 
     */
    @Test
    public void updloadTrackerItemAttachmentTest()  {
        Integer itemId = null;
        File attachments = null;
        List<Attachment> response = api.updloadTrackerItemAttachment(itemId, attachments);

        // TODO: test validations
    }
    
}
