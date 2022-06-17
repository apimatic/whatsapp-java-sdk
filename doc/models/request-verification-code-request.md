
# Request Verification Code Request

## Structure

`RequestVerificationCodeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CodeMethod` | [`RequestVerificationCodeMethodEnum`](../../doc/models/request-verification-code-method-enum.md) | Required | Chosen method for verification. | RequestVerificationCodeMethodEnum getCodeMethod() | setCodeMethod(RequestVerificationCodeMethodEnum codeMethod) |
| `Locale` | `String` | Required | Your locale. For example: "en_US". | String getLocale() | setLocale(String locale) |

## Example (as JSON)

```json
{
  "code_method": "SMS",
  "locale": "en_US"
}
```

