
# Row

## Structure

`Row`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | **Constraints**: *Maximum Length*: `200` | String getId() | setId(String id) |
| `Title` | `String` | Required | **Constraints**: *Maximum Length*: `24` | String getTitle() | setTitle(String title) |
| `Description` | `String` | Optional | **Constraints**: *Maximum Length*: `72` | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "id": "<Item ID>",
  "title": "<Item Title>",
  "description": "<Item Description>"
}
```

