CaseArticleManager sample
=========================

Provides an Apex class that implements the IAttachmentManager interface to present Veeva Vault articles, represented by VeevaVaultAttachment instances, as ad hoc files to be attached from a DocGen Package run.

Overview
--------

The sample is a single file, named CaseArticleManager.java, that contains a single Apex class, named CaseArticleManager, which implements the IAttachmentManager interface. The class implements the getAttachments method from that interface, which retrieves records from a custom object, named Case_Article, and then creates and returns a list of corresponding VeevaVaultAttachment instances.

Implementing the sample
-----------------------

You need to first implement the Case_Article custom object, and then implement the CaseArticleManager Apex class in Salesforce by using the Developer Console.

To implement the sample

1. Log into your Salesforce instance, using a Developer Edition account.
1. In a text editor, open the sample file named CaseArticleManager.java.
1. From Setup, create a new custom object named Case_Article and, using the sample file as a guide, create the following custom fields:

   Field | Data Type
   --- | ---
   Case | Text
   File_Id | Text
   File_Name | Text
   Article\_File\_Name_Extension | Text
   Type | Text
   Article_Title | Text
   Downlaod_Link | URL

1. From your Salesforce instance, open the Developer Console.     For more information about the Developer Console in Salesforce, see [Developer Console](https://developer.salesforce.com/page/Developer_Console).
1. From the Developer Console, create a new Apex class named CaseArticleManager.
1. Paste the contents of the sample file into the Developer Console, overwriting the existing contents.
1. Save the new Apex class, and then close the Developer Console.

Using the sample
----------------

Once this interface is implemented, a DocGen Package admin can use it in a DocGen Package in order to append ad hoc files to the current list of ad hoc files for the user to select from. To do this, the DocGen Package admin would specify the class name in the "AdHoc Apex Class" field on the DocGen Package. They may need to add this field to the DocGen Package page layout if it is not already visible.

For more information

[Nintex Document Generation for Salesforce product assistance](https://help.nintex.com/en-US/docgen/docgen-portal.htm)

[Apex for Nintex DocGen for Salesforce](https://help.nintex.com/en-us/docgen/docservices/Default.htm#cshid=9032)