
# Interactive

## Structure

`Interactive`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | [`Action`](../../doc/models/action.md) | Required | Action you want the user to perform after reading the message. | Action getAction() | setAction(Action action) |
| `Body` | [`Body`](../../doc/models/body.md) | Required | The body of the message. Emojis and markdown are supported. | Body getBody() | setBody(Body body) |
| `Footer` | [`Footer`](../../doc/models/footer.md) | Optional | The footer of the message. Emojis and markdown are supported. | Footer getFooter() | setFooter(Footer footer) |
| `Header` | [`Header`](../../doc/models/header.md) | Optional | Header content displayed on top of a message. | Header getHeader() | setHeader(Header header) |
| `Type` | [`InteractiveTypeEnum`](../../doc/models/interactive-type-enum.md) | Required | The type of interactive message you want to send. | InteractiveTypeEnum getType() | setType(InteractiveTypeEnum type) |

## Example (as JSON)

```json
{
  "type": "list",
  "header": {
    "type": "text",
    "text": "<Header List Message>"
  },
  "body": {
    "text": "<List Body Message>"
  },
  "footer": {
    "text": "<Footer Message>"
  },
  "action": {
    "button": "Send",
    "sections": [
      {
        "title": "<List Category Item>",
        "rows": [
          {
            "id": "<Item ID>",
            "title": "<Item Title>",
            "description": "<Item Description>"
          },
          {
            "id": "<Item ID>",
            "title": "<Item Title>",
            "description": "<Item Description>"
          }
        ]
      },
      {
        "title": "<List Item>",
        "rows": [
          {
            "id": "<Item ID>",
            "title": "<Item Title>",
            "description": "<Item Description>"
          },
          {
            "id": "<Item ID>",
            "title": "<Item Title>",
            "description": "<Item Description>"
          }
        ]
      }
    ]
  }
}
```

