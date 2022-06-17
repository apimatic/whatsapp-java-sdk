# Two-Step Verification

```java
TwoStepVerificationController twoStepVerificationController = client.getTwoStepVerificationController();
```

## Class Name

`TwoStepVerificationController`


# Set Two Step Verification Code

You are required to set up two-step verification for your phone number, as this provides an extra layer of security to the business accounts. You can use this endpoint to change two-step verification code associated with your account.
After you change the verification code, future requests like changing the name, must use the new code.

You set up two-factor verification and register a phone number in the same API call.

```java
CompletableFuture<SuccessResponse> setTwoStepVerificationCodeAsync(
    final String phoneNumberID,
    final SetTwoStepVerificationCodeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `phoneNumberID` | `String` | Template, Required | - |
| `body` | [`SetTwoStepVerificationCodeRequest`](../../doc/models/set-two-step-verification-code-request.md) | Body, Required | - |

## Response Type

[`SuccessResponse`](../../doc/models/success-response.md)

## Example Usage

```java
String phoneNumberID = "Phone-Number-ID6";
SetTwoStepVerificationCodeRequest body = new SetTwoStepVerificationCodeRequest();
body.setPin("<6-digit-pin>");

twoStepVerificationController.setTwoStepVerificationCodeAsync(phoneNumberID, body).thenAccept(result -> {
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

