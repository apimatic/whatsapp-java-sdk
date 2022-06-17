
# Set Two Step Verification Code Request

A 6-digit pin you wish to use for two-step authentication.

## Structure

`SetTwoStepVerificationCodeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Pin` | `String` | Required | - | String getPin() | setPin(String pin) |

## Example (as JSON)

```json
{
  "pin": "<6-digit-pin>"
}
```

