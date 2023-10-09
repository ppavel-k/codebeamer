

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.AccessPermission;
import codebeamer.rampup.client.model.AccessPermissionsRequest;
import codebeamer.rampup.client.model.ArtifactRevisionSearchResult;
import codebeamer.rampup.client.model.LockInfo;
import codebeamer.rampup.client.model.LockRequest;
import codebeamer.rampup.client.model.WikiPage;
import codebeamer.rampup.client.model.WikiRenderRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for WikiApi
 */
@Disabled
public class WikiApiTest {

    private final WikiApi api = new WikiApi();

    
    /**
     * Check whether a wiki page is locked, and if it is, retrieve the details of the lock
     *
     * 
     */
    @Test
    public void checkWikiPageLockTest()  {
        Integer wikiId = null;
        LockInfo response = api.checkWikiPageLock(wikiId);

        // TODO: test validations
    }
    
    /**
     * Create a new wiki page
     *
     * 
     */
    @Test
    public void createWikiPageTest()  {
        WikiPage wikiPage = null;
        WikiPage response = api.createWikiPage(wikiPage);

        // TODO: test validations
    }
    
    /**
     * Delete a wiki page by its ID
     *
     * 
     */
    @Test
    public void deleteWikiPageTest()  {
        Integer wikiId = null;
        api.deleteWikiPage(wikiId);

        // TODO: test validations
    }
    
    /**
     * Get wiki page
     *
     * 
     */
    @Test
    public void getWikiPageTest()  {
        Integer wikiId = null;
        Integer version = null;
        WikiPage response = api.getWikiPage(wikiId, version);

        // TODO: test validations
    }
    
    /**
     * Returns the change history of the specified wiki page
     *
     * 
     */
    @Test
    public void getWikiPageHistoryTest()  {
        Integer wikiId = null;
        Integer page = null;
        Integer pageSize = null;
        ArtifactRevisionSearchResult response = api.getWikiPageHistory(wikiId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get permissions of a wiki page
     *
     * 
     */
    @Test
    public void getWikiPermissionsTest()  {
        Integer wikiId = null;
        List<AccessPermission> response = api.getWikiPermissions(wikiId);

        // TODO: test validations
    }
    
    /**
     * Lock a wiki page
     *
     * 
     */
    @Test
    public void lockWikiPageTest()  {
        Integer wikiId = null;
        LockRequest lockRequest = null;
        api.lockWikiPage(wikiId, lockRequest);

        // TODO: test validations
    }
    
    /**
     * Render a wiki page as HTML in a specific context
     *
     * 
     */
    @Test
    public void renderWikiMarkupTest()  {
        Integer projectId = null;
        WikiRenderRequest wikiRenderRequest = null;
        String response = api.renderWikiMarkup(projectId, wikiRenderRequest);

        // TODO: test validations
    }
    
    /**
     * Render a wiki page as HTML
     *
     * 
     */
    @Test
    public void renderWikiPageTest()  {
        Integer wikiId = null;
        Integer version = null;
        String response = api.renderWikiPage(wikiId, version);

        // TODO: test validations
    }
    
    /**
     * Restores the content from a previous version of a wiki page
     *
     * 
     */
    @Test
    public void restoreWikiPageContentTest()  {
        Integer wikiId = null;
        Integer version = null;
        WikiPage response = api.restoreWikiPageContent(wikiId, version);

        // TODO: test validations
    }
    
    /**
     * Set permissions of a wiki page
     *
     * 
     */
    @Test
    public void setWikiPermissionsTest()  {
        Integer wikiId = null;
        Boolean recursive = null;
        AccessPermissionsRequest accessPermissionsRequest = null;
        List<AccessPermission> response = api.setWikiPermissions(wikiId, recursive, accessPermissionsRequest);

        // TODO: test validations
    }
    
    /**
     * Unlock a wiki page
     *
     * 
     */
    @Test
    public void unlockWikiPageTest()  {
        Integer wikiId = null;
        api.unlockWikiPage(wikiId);

        // TODO: test validations
    }
    
    /**
     * Update and/or move a wiki page
     *
     * 
     */
    @Test
    public void updateWikiPageTest()  {
        Integer itemId = null;
        WikiPage wikiPage = null;
        WikiPage response = api.updateWikiPage(itemId, wikiPage);

        // TODO: test validations
    }
    
}
