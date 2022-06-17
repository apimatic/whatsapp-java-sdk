
# Contact

## Structure

`Contact`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Addresses` | [`List<Address>`](../../doc/models/address.md) | Optional | Full contact address(es) | List<Address> getAddresses() | setAddresses(List<Address> addresses) |
| `Birthday` | `String` | Optional | **Default**: `"YYYY-MM-DD formatted string."` | String getBirthday() | setBirthday(String birthday) |
| `Emails` | [`List<EmailObject>`](../../doc/models/email-object.md) | Optional | Contact email address(es) | List<EmailObject> getEmails() | setEmails(List<EmailObject> emails) |
| `Name` | [`Name`](../../doc/models/name.md) | Required | Full contact name | Name getName() | setName(Name name) |
| `Org` | [`Org`](../../doc/models/org.md) | Optional | Contact organization information | Org getOrg() | setOrg(Org org) |
| `Phones` | [`List<PhoneObject>`](../../doc/models/phone-object.md) | Optional | Contact phone number(s) | List<PhoneObject> getPhones() | setPhones(List<PhoneObject> phones) |
| `Urls` | [`List<UrlObject>`](../../doc/models/url-object.md) | Optional | Contact URL(s) | List<UrlObject> getUrls() | setUrls(List<UrlObject> urls) |

## Example (as JSON)

```json
{
  "addresses": [
    {
      "street": "<ADDRESS_STREET>",
      "city": "<ADDRESS_CITY>",
      "state": "<ADDRESS_STATE>",
      "zip": "<ADDRESS_ZIP>",
      "country": "<ADDRESS_COUNTRY>",
      "country_code": "<ADDRESS_COUNTRY_CODE>",
      "type": "WORK"
    }
  ],
  "birthday": "<CONTACT_BIRTHDAY>",
  "emails": [
    {
      "email": "<CONTACT_EMAIL>",
      "type": "HOME"
    }
  ],
  "name": {
    "formatted_name": "<CONTACT_FORMATTED_NAME>",
    "first_name": "<CONTACT_FIRST_NAME>",
    "last_name": "<CONTACT_LAST_NAME>",
    "middle_name": "<CONTACT_MIDDLE_NAME>",
    "suffix": "<CONTACT_SUFFIX>",
    "prefix": "<CONTACT_PREFIX>"
  },
  "org": {
    "company": "<CONTACT_ORG_COMPANY>",
    "department": "<CONTACT_ORG_DEPARTMENT>",
    "title": "<CONTACT_ORG_TITLE>"
  },
  "phones": [
    {
      "phone": "<CONTACT_PHONE>",
      "wa_id": "<CONTACT_WA_ID>",
      "type": "WORK"
    }
  ],
  "urls": [
    {
      "url": "<CONTACT_URL>",
      "type": "HOME"
    }
  ]
}
```

