# Phone Numbers

```java
PhoneNumbersController phoneNumbersController = client.getPhoneNumbersController();
```

## Class Name

`PhoneNumbersController`

## Methods

* [Verify Code](../../doc/controllers/phone-numbers.md#verify-code)
* [Get Phone Number by ID](../../doc/controllers/phone-numbers.md#get-phone-number-by-id)
* [Request Verification Code](../../doc/controllers/phone-numbers.md#request-verification-code)


# Verify Code

Used to verify a phone number's ownership. After you have received a SMS or Voice request code for verification, you need to verify the code that was sent to you.

```java
CompletableFuture<SuccessResponse> verifyCodeAsync(
    final String phoneNumberID,
    final String code)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `phoneNumberID` | `String` | Template, Required | - |
| `code` | `String` | Form, Required | The code you received after calling FROM_PHONE_NUMBER_ID/request_code. |

## Response Type

[`SuccessResponse`](../../doc/models/success-response.md)

## Example Usage

```java
String phoneNumberID = "Phone-Number-ID6";
String code = "<your-requested-code>";

phoneNumbersController.verifyCodeAsync(phoneNumberID, code).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "success": true
}
```


# Get Phone Number by ID

When you query all the phone numbers for a WhatsApp Business Account, each phone number has an id. You can directly query for a phone number using this id.

```java
CompletableFuture<GetPhoneNumberByIDResponse> getPhoneNumberByIDAsync(
    final String phoneNumberID)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `phoneNumberID` | `String` | Template, Required | - |

## Response Type

[`GetPhoneNumberByIDResponse`](../../doc/models/get-phone-number-by-id-response.md)

## Example Usage

```java
String phoneNumberID = "Phone-Number-ID6";

phoneNumbersController.getPhoneNumberByIDAsync(phoneNumberID).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "verified_name": "Jasper's Market",
  "display_phone_number": "+1 631-555-5555",
  "id": "1906385232743451",
  "quality_rating": "GREEN"
}
```


# Request Verification Code

Used to request a code to verify a phone number's ownership. You need to verify the phone number you want to use to send messages to your customers. Phone numbers must be verified through SMS/voice call. The verification process can be done through the Graph API calls specified below.

```java
CompletableFuture<SuccessResponse> requestVerificationCodeAsync(
    final String phoneNumberID,
    final RequestVerificationCodeMethodEnum codeMethod,
    final String locale)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `phoneNumberID` | `String` | Template, Required | - |
| `codeMethod` | [`RequestVerificationCodeMethodEnum`](../../doc/models/request-verification-code-method-enum.md) | Form, Required | Chosen method for verification. |
| `locale` | `String` | Form, Required | Your locale. For example: "en_US". |

## Response Type

[`SuccessResponse`](../../doc/models/success-response.md)

## Example Usage

```java
String phoneNumberID = "Phone-Number-ID6";
RequestVerificationCodeMethodEnum codeMethod = RequestVerificationCodeMethodEnum.SMS;
String locale = "en_US";

phoneNumbersController.requestVerificationCodeAsync(phoneNumberID, codeMethod, locale).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "success": true
}
```

