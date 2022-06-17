
# Verify Code Request

## Structure

`VerifyCodeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Required | The code you received after calling FROM_PHONE_NUMBER_ID/request_code. | String getCode() | setCode(String code) |

## Example (as JSON)

```json
{
  "code": "<your-requested-code>"
}
```

