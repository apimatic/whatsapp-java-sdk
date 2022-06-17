
# Address

## Structure

`Address`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `String` | Optional | Street number and name | String getStreet() | setStreet(String street) |
| `City` | `String` | Optional | City name. | String getCity() | setCity(String city) |
| `State` | `String` | Optional | State abbreviation. | String getState() | setState(String state) |
| `Zip` | `String` | Optional | ZIP code. | String getZip() | setZip(String zip) |
| `Country` | `String` | Optional | Full country name. | String getCountry() | setCountry(String country) |
| `CountryCode` | `String` | Optional | Two-letter country abbreviation. | String getCountryCode() | setCountryCode(String countryCode) |
| `Type` | [`PersonalInformationTypeEnum`](../../doc/models/personal-information-type-enum.md) | Optional | - | PersonalInformationTypeEnum getType() | setType(PersonalInformationTypeEnum type) |

## Example (as JSON)

```json
{
  "street": "<ADDRESS_STREET>",
  "city": "<ADDRESS_CITY>",
  "state": "<ADDRESS_STATE>",
  "zip": "<ADDRESS_ZIP>",
  "country": "<ADDRESS_COUNTRY>",
  "country_code": "<ADDRESS_COUNTRY_CODE>",
  "type": "HOME"
}
```

