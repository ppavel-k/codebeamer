

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.ArtifactRevisionSearchResult;
import codebeamer.rampup.client.model.Attachment;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;




/**
 * API tests for AttachmentApi
 */
@Disabled
public class AttachmentApiTest {

    private final AttachmentApi api = new AttachmentApi();

    
    /**
     * Deletes an attachment
     *
     * 
     */
    @Test
    public void deleteAttachmentTest()  {
        Integer attachmentId = null;
        api.deleteAttachment(attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get attachment by id
     *
     * 
     */
    @Test
    public void getAttachmentTest()  {
        Integer attachmentId = null;
        Integer version = null;
        Attachment response = api.getAttachment(attachmentId, version);

        // TODO: test validations
    }
    
    /**
     * Get content of an attachment by id
     *
     * 
     */
    @Test
    public void getAttachmentContentTest()  {
        Integer attachmentId = null;
        Integer version = null;
        File response = api.getAttachmentContent(attachmentId, version);

        // TODO: test validations
    }
    
    /**
     * Returns the change history of the specified attachment
     *
     * 
     */
    @Test
    public void getAttachmentHistoryTest()  {
        Integer attachmentId = null;
        Integer page = null;
        Integer pageSize = null;
        ArtifactRevisionSearchResult response = api.getAttachmentHistory(attachmentId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Restore attachment to previous version
     *
     * 
     */
    @Test
    public void restoreAttachmentTest()  {
        Integer attachmentId = null;
        Integer version = null;
        Attachment response = api.restoreAttachment(attachmentId, version);

        // TODO: test validations
    }
    
    /**
     * Update attachment
     *
     * 
     */
    @Test
    public void updateAttachmentTest()  {
        Integer attachmentId = null;
        String description = null;
        String descriptionFormat = null;
        File content = null;
        Attachment response = api.updateAttachment(attachmentId, description, descriptionFormat, content);

        // TODO: test validations
    }
    
}
