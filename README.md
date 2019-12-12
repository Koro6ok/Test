Depending on how the Validation should work:
- If Validation should work immediately.
- If Validation should work after pressing the “Confirm” button.


If Validation should work immediately.

#1
Validator for the “Email address” field is not work and hint is not shown when enter the incorrect data.
Chrome - Version 78.0.3904.108 
1.	Go to the site https://reverent-aryabhata-11cf33.netlify.com/;
2.	Enter the wrong Email into the “Email address” field.
AR: Validator for the “Email address” field is not work and hint (example “Enter a valid email address”) is not shown.
ER: Validator for the “Email address” field is work and hint (example “Enter a valid email address”) is shown.

#2
Validator for “Phone” field is not work correctly and hint is not shown when enter the incorrect data.
Chrome - Version 78.0.3904.108 
1.	Go to the site https://reverent-aryabhata-11cf33.netlify.com/;
2.	Enter the wrong Phone number (0639992211) into the “Phone” field.
AR: Validator for the “Phone” field is not work correctly and hint (example “Enter a valid phone +380” or “Enter a valid UA phone number”) is not shown.
ER: Validator for the “Phone” field is work and hint (example “Enter a valid phone +380” or “Enter a valid UA phone number”) is shown.

#3
Validator for the “Organization name” field is not work when enter the leave field blank.
Chrome - Version 78.0.3904.108
1.	Go to the site https://reverent-aryabhata-11cf33.netlify.com/;
2.	Leave the "Organization name" field blank;
3.	Fill in the other fields with the correct data;
4.	Click on the “Submit” button.
AR: Validator for the “Organization name” field is not work and “Welcome” page is opened.
ER: Validator for the “Organization name” field is work and hint “Field cannot be empty” is shown. “Welcome” page is not opened.

#4
Validators for the “First name”, “Last name”, “Organization name” fields are not work correctly and hints are not shown when enter the incorrect data.
Chrome - Version 78.0.3904.108 
1.	Go to the site https://reverent-aryabhata-11cf33.netlify.com/;
2.	Enter the wrong First name (~!@#) , Last (~!@#) name , Organization (~!@#) name into the “First name”, “Last name”, “Organization name” fields.
AR: Validators for the “First name”, “Last name”, “Organization name” fields are not work and hints (example “Enter a valid First name”, “Enter a valid Last name”, “Enter a valid Organization name”) are not shown.
ER: Validators for the “First name”, “Last name”, “Organization name” fields are work and hints (example “Enter a valid First name”, “Enter a valid Last name”, “Enter a valid Organization name”) are shown.

#5
Validator for the “Password” field is not working correctly and wrong hits are shown.
Chrome - Version 78.0.3904.108 
Case 1:
1.	Go to the site https://reverent-aryabhata-11cf33.netlify.com/;
2.	Enter the Normal (123456) Password into the “Password” field.
AR: Validator for the “Password” field is not working correctly and hint “Password strength: weak” is shown.
ER: Validator for the “Password” field is working correctly and hint “Password strength: normal” is shown.
Case 2:
1.	Go to the site https://reverent-aryabhata-11cf33.netlify.com/;
2.	Enter the Strong (1234567890) Password into the “Password” field.
AR: Validator for the “Password” field is not working correctly and hint “Password strength: weak” is shown.
ER: Validator for the “Password” field is working correctly and hint “Password strength: strong” is shown.

#6
Hint “The password and confirmation password do not match” is shown for the “Confirm Password” field when enter the Password into the “Password” field.
Chrome - Version 78.0.3904.108 
1.	Go to the site https://reverent-aryabhata-11cf33.netlify.com/;
2.	Enter the any Password into the “Password” field.
AR: Hint “The password and confirmation password do not match” is shown for the “Confirm Password” field.
ER: Hint “The password and confirmation password do not match” is not shown for the “Confirm Password” field.


If Validation should work after pressing the “Confirm” button.

#1
Validator for the “Email address” field is not work when enter the incorrect data.
Chrome - Version 78.0.3904.108 
1.	Go to the site https://reverent-aryabhata-11cf33.netlify.com/;
2.	Enter the wrong Email into the “Email address” field;
3.	Fill in the other fields with the correct data;
4.	Click on the “Submit” button.
AR: Validator for the “Email address” field is not work and “Welcome” page is opened.
ER: Validator for the “Email address” field is work and hint (example “Enter a valid email address”) is shown. “Welcome” page is not opened.

#2
Validator for the “Organization name” field is not work when enter the leave field blank.
Chrome - Version 78.0.3904.108
1.	Go to the site https://reverent-aryabhata-11cf33.netlify.com/;
2.	Leave the "Organization name" field blank;
3.	Fill in the other fields with the correct data;
4.	Click on the “Submit” button.
AR: Validator for the “Organization name” field is not work and “Welcome” page is opened.
ER: Validator for the “Organization name” field is work and hint “Field cannot be empty” is shown. “Welcome” page is not opened.

#3
Validator for “Phone” field is not work correctly and hint is not shown when enter the incorrect data.
Chrome - Version 78.0.3904.108 
1.	Go to the site https://reverent-aryabhata-11cf33.netlify.com/;
2.	Enter the wrong Phone number (0639992211) into the “Phone” field.
3.	Fill in the other fields with the correct data;
4.	Click on the “Submit” button.

AR: Validator for “Phone” field is not work and “Welcome” page is opened.
ER: Validator for “Phone” field is work and hint (example “Enter a valid phone +380” or “Enter a valid UA phone number”) is shown. “Welcome” page is not opened.

#4
Validators for “First name”, “Last name”, “Organization name” fields are not work correctly when enter the incorrect data.
Chrome - Version 78.0.3904.108 
1.	Go to the site https://reverent-aryabhata-11cf33.netlify.com/;
2.	Enter the wrong First name (~!@#) , Last (~!@#) name , Organization (~!@#) name into the “First name”, “Last name”, “Organization name” fields;
3.	Fill in the other fields with the correct data;
4.	Click on the “Submit” button.
AR: Validators for the “First name”, “Last name”, “Organization name” fields are not work and “Welcome” page is opened.
ER: Validators for the “First name”, “Last name”, “Organization name” fields are work and hints (example “Enter a valid First name”, “Enter a valid Last name”, “Enter a valid Organization name”) are shown. “Welcome” page is not opened.

