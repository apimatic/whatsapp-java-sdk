
# Template

## Structure

`Template`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Name of the template. | String getName() | setName(String name) |
| `Language` | [`Language`](../../doc/models/language.md) | Required | Specifies the language the template may be rendered in. Only the deterministic language policy works with media template messages. | Language getLanguage() | setLanguage(Language language) |
| `Components` | [`List<Component>`](../../doc/models/component.md) | Optional | Array of components objects containing the parameters of the message. | List<Component> getComponents() | setComponents(List<Component> components) |

## Example (as JSON)

```json
{
  "name": "hello_world",
  "language": {
    "code": "en_US"
  }
}
```

