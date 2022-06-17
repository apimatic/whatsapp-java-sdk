
# Get Business Profile ID Response

## Structure

`GetBusinessProfileIDResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<BusinessProfile>`](../../doc/models/business-profile.md) | Required | - | List<BusinessProfile> getData() | setData(List<BusinessProfile> data) |

## Example (as JSON)

```json
{
  "data": [
    {
      "messaging_product": "whatsapp",
      "address": "ADDRESS",
      "description": "DESCRIPTION",
      "vertical": "UNDEFINED",
      "email": "EMAIL",
      "websites": [
        "https://WEBSITE-1",
        "https://WEBSITE-2"
      ],
      "profile_picture_url": "https://URL",
      "id": "BUSINESS_PROFILE_ID"
    }
  ]
}
```

