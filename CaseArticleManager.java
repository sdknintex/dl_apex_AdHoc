public with sharing class CaseArticleManager implements Loop.AdHoc.IAttachmentManager {
    public List<Loop.AdHoc.Attachment> getAttachments(Id ddpId, Id eid, Set<Id> topLevelIds, Set<Id> parentIds) {
        List<Loop.AdHoc.Attachment> vaultAttachments = new List<Loop.AdHoc.Attachment>();
        
        if (topLevelIds == null)
            topLevelIds = new Set<Id>();
        if (parentIds != null)
            topLevelIds.addAll(parentIds);
        
        for (Case_Article__c caseArticle : [SELECT Id, Article_File_Name_Extension__c, Article_Title__c,
            Case__c, Download_Link__c, File_Id__c, File_Name__c, Type__c FROM Case_Article__c
            WHERE Case__c IN :topLevelIds]) {
          
            vaultAttachments.add(new Loop.AdHoc.VeevaVaultAttachment(
                caseArticle.Id,
                caseArticle.Case__c,
                caseArticle.File_Id__c,
                caseArticle.File_Name__c,
                caseArticle.Article_File_Name_Extension__c,
                caseArticle.Type__c,
                caseArticle.Article_Title__c,
                caseArticle.Download_Link__c
            ));
        }
        return vaultAttachments;
    }
}