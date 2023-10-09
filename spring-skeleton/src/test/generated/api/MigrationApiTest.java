

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.AttachmentMigrationRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * API tests for MigrationApi
 */
@Disabled
public class MigrationApiTest {

    private final MigrationApi api = new MigrationApi();

    
    /**
     * Migrate attachments
     *
     * An endpoint for migrating attachments from a preconfigured source directory.
     */
    @Test
    public void migrateAttachmentsTest()  {
        AttachmentMigrationRequest attachmentMigrationRequest = null;
        api.migrateAttachments(attachmentMigrationRequest);

        // TODO: test validations
    }
    
}
