# World Wide Web Consortium validator printout

Before we take a look at my the validations let's talk about:

* Why it is better to use the same id to target the HTML elements tags by JavaScript and CSS rather than using different ids.&#x20;
* why it is ok to ignore warnings and info from the w3 validator and should focus more on the errors.&#x20;
* Why it is ok to nest HTML elements even though the validator does not recommend some specific nesting?&#x20;
* Why it is fine to have errors in the w3 validator in your code.

Well, using the same id to target HTML elements with JavaScript is better because ids are unique within a document, so using the same id will only target one specific element. This allows for more precise manipulation of the desired element and reduces the risk of accidentally targeting multiple elements. In the realm of CSS, when an HTML element has both a class and an id applied to it, the CSS of the id will take precedence. This is a deliberate choice and is done to ensure that the desired styling is applied to the element. However, the W3 validator may flag this as an error, as it does not take into account the overall structure and interaction of the page with JavaScript and CSS. It simply evaluates the code on a page-by-page basis. While this may technically be considered an error, it does not necessarily negatively impact the <mark style="color:red;">**functionality**</mark> or <mark style="color:red;">**design**</mark> of the website.

&#x20;

When using the W3 validator, it is generally acceptable to ignore warnings and focus on errors. This is because warnings are typically less critical and may not impact the functionality of the website, while errors indicate issues that may prevent the website from functioning properly.

Nesting elements in HTML is a common practice, it allows for a more structured and organized way of representing the content of a webpage. However, it can sometimes lead to errors when using the W3 validator, but these errors may not necessarily indicate a problem with the website, as the validator may not fully understand the structure and intent of the code. It's not always necessary to have a completely error-free code according to the W3 validator.

&#x20;

It is not always necessary to have a completely error-free code according to the W3 validator. Some errors may be caused by using non-standard or experimental features and may not impact the functionality of the website. Additionally, some errors may not be important for the current use case and can be safely ignored. However, it's always better to correct errors if they are critical and may affect the website’s functionality. Ok, enough talking, down below are the screenshots of the w3 validator.

<figure><img src=".gitbook/assets/image (1).png" alt=""><figcaption></figcaption></figure>

As predictable, it gave me errors and warning for the same ids that been used for the different elements.

However, this does not necessarily negatively impact the <mark style="color:red;">**functionality**</mark> or <mark style="color:red;">**design**</mark> of the website.



<figure><img src=".gitbook/assets/image.png" alt=""><figcaption></figcaption></figure>

