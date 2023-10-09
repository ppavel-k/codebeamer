

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.Attachment;
import codebeamer.rampup.client.model.AttachmentReference;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

/**
 * API tests for WikisCommentApi
 */
@Disabled
public class WikisCommentApiTest {

    private final WikisCommentApi api = new WikisCommentApi();

    
    /**
     * Comment on a wiki page
     *
     * 
     */
    @Test
    public void commentOnWikiTest()  {
        Integer wikiId = null;
        String comment = null;
        String commentFormat = null;
        File attachments = null;
        List<AttachmentReference> response = api.commentOnWiki(wikiId, comment, commentFormat, attachments);

        // TODO: test validations
    }
    
    /**
     * Get attachment of wiki page by file name
     *
     * 
     */
    @Test
    public void getAttachmentByNameTest()  {
        Integer wikiId = null;
        String fileName = null;
        Attachment response = api.getAttachmentByName(wikiId, fileName);

        // TODO: test validations
    }
    
}
