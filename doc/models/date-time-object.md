
# Date Time Object

## Structure

`DateTimeObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FallbackValue` | `String` | Required | Default text. For Cloud API, we always use the fallback value, and we do not attempt to localize using other optional fields. | String getFallbackValue() | setFallbackValue(String fallbackValue) |
| `DayOfWeek` | `Integer` | Optional | - | Integer getDayOfWeek() | setDayOfWeek(Integer dayOfWeek) |
| `Year` | `Integer` | Optional | - | Integer getYear() | setYear(Integer year) |
| `Month` | `Integer` | Optional | - | Integer getMonth() | setMonth(Integer month) |
| `DayOfMonth` | `Integer` | Optional | - | Integer getDayOfMonth() | setDayOfMonth(Integer dayOfMonth) |
| `Hour` | `Integer` | Optional | - | Integer getHour() | setHour(Integer hour) |
| `Minute` | `Integer` | Optional | - | Integer getMinute() | setMinute(Integer minute) |
| `Calendar` | `String` | Optional | - | String getCalendar() | setCalendar(String calendar) |

## Example (as JSON)

```json
{
  "fallback_value": "February 25, 1977",
  "day_of_week": 5,
  "year": 1977,
  "month": 2,
  "day_of_month": 25,
  "hour": 15,
  "minute": 33,
  "calendar": "GREGORIAN"
}
```

