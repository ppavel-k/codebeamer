

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.ArtifactRevisionSearchResult;
import codebeamer.rampup.client.model.Association;
import codebeamer.rampup.client.model.AssociationType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for AssociationApi
 */
@Disabled
public class AssociationApiTest {

    private final AssociationApi api = new AssociationApi();

    
    /**
     * Create a new association
     *
     * 
     */
    @Test
    public void createAssociationTest()  {
        Association association = null;
        Association response = api.createAssociation(association);

        // TODO: test validations
    }
    
    /**
     * Delete association
     *
     * 
     */
    @Test
    public void deleteAssociationTest()  {
        Integer associationId = null;
        api.deleteAssociation(associationId);

        // TODO: test validations
    }
    
    /**
     * Get an association by id
     *
     * 
     */
    @Test
    public void getAssociationTest()  {
        Integer associationId = null;
        Association response = api.getAssociation(associationId);

        // TODO: test validations
    }
    
    /**
     * Returns the change history of the specified association
     *
     * 
     */
    @Test
    public void getAssociationHistoryTest()  {
        Integer associationId = null;
        Integer page = null;
        Integer pageSize = null;
        ArtifactRevisionSearchResult response = api.getAssociationHistory(associationId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get association type by id
     *
     * 
     */
    @Test
    public void getAssociationTypeTest()  {
        Integer associationTypeId = null;
        AssociationType response = api.getAssociationType(associationTypeId);

        // TODO: test validations
    }
    
    /**
     * Get available association types
     *
     * 
     */
    @Test
    public void getAvailableAssociationTypesTest()  {
        List<AssociationType> response = api.getAvailableAssociationTypes();

        // TODO: test validations
    }
    
    /**
     * Update association settings
     *
     * 
     */
    @Test
    public void updateAssociationTest()  {
        Integer associationId = null;
        Association association = null;
        Association response = api.updateAssociation(associationId, association);

        // TODO: test validations
    }
    
}
