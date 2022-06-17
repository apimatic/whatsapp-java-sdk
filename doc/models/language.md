
# Language

## Structure

`Language`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Required | The code of the language or locale to use. Accepts both language and language_locale formats (e.g., en and en_US). | String getCode() | setCode(String code) |
| `Policy` | `String` | Optional | The language policy the message should follow.<br>**Default**: `"deterministic"` | String getPolicy() | setPolicy(String policy) |

## Example (as JSON)

```json
{
  "code": "en_US"
}
```

