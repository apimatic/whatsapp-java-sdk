
# Name

## Structure

`Name`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FormattedName` | `String` | Required | Full name, as it normally appears. | String getFormattedName() | setFormattedName(String formattedName) |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `MiddleName` | `String` | Optional | - | String getMiddleName() | setMiddleName(String middleName) |
| `Suffix` | `String` | Optional | - | String getSuffix() | setSuffix(String suffix) |
| `Prefix` | `String` | Optional | - | String getPrefix() | setPrefix(String prefix) |

## Example (as JSON)

```json
{
  "formatted_name": "<CONTACT_FORMATTED_NAME>",
  "first_name": "<CONTACT_FIRST_NAME>",
  "last_name": "<CONTACT_LAST_NAME>",
  "middle_name": "<CONTACT_MIDDLE_NAME>",
  "suffix": "<CONTACT_SUFFIX>",
  "prefix": "<CONTACT_PREFIX>"
}
```

