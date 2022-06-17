
# Location

## Structure

`Location`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Latitude` | `String` | Required | Latitude of the location. | String getLatitude() | setLatitude(String latitude) |
| `Longitude` | `String` | Required | Longitude of the location. | String getLongitude() | setLongitude(String longitude) |
| `Name` | `String` | Optional | Name of the location. | String getName() | setName(String name) |
| `Address` | `String` | Optional | Address of the location. Only displayed if name is present. | String getAddress() | setAddress(String address) |

## Example (as JSON)

```json
{
  "latitude": "<LOCATION_LATITUDE>",
  "longitude": "<LOCATION_LONGITUDE>",
  "name": "<LOCATION_NAME>",
  "address": "<LOCATION_ADDRESS>"
}
```

