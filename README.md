# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS

A.  Create your subgroup and project by logging into GitLab using the web link provided and using the “GitLab How-To” web link, and do the following:

•  Clone the project to the IDE.

•  Commit with a message and push when you complete each of the tasks listed below (e.g., parts C to J).


Note: You may commit and push whenever you want to back up your changes, even if a task is not complete.


•  Submit a copy of the Git repository URL and a copy of the repository branch history retrieved from your repository, which must include the commit messages and dates.


Note: Wait until you have completed all the following prompts before you create your copy of the repository branch history.


B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.

1. README.md, all lines, modified entire README file 


C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

2. mainscreen.html, line 14, title change
3. mainscreen.html, line 19, changed H1
4. mainscreen.html, line 21, changed H2
4. mainscreen.html, line 52, changed H2

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

5. about.html, created about.html in templates directory, added lines 1-46
6. mainscreencontroller.java, added getmapping lines 55-57
7. mainscreen.html, added link to get from mainscreen.html to about.html, lines 22-24


E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

8. bootstrapdata.java, line 31 and 36, added inHousePartRepository implementation 
9. bootstrapdata.java, line 40-113, added four inhouse parts and one outsourced part
10. bootstrapdata.java, line 148-158, added five products to product repository


Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


J.  Remove the class files for any unused validators in order to clean your code.


K.  Demonstrate professional communication in the content and presentation of your submission.