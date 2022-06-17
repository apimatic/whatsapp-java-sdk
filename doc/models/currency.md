
# Currency

## Structure

`Currency`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FallbackValue` | `String` | Required | Default text if localization fails. | String getFallbackValue() | setFallbackValue(String fallbackValue) |
| `Code` | `String` | Required | Currency code as defined in ISO 4217. | String getCode() | setCode(String code) |
| `Amount1000` | `int` | Required | Amount multiplied by 1000. | int getAmount1000() | setAmount1000(int amount1000) |

## Example (as JSON)

```json
{
  "fallback_value": "$100.99",
  "code": "USD",
  "amount_1000": 100990
}
```

