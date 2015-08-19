#### Search and View Contact
This project starts where [SearchContacts](https://github.com/shoaibk/Android-Patterns/tree/master/Projects/SearchContacts) project ended.
User can search for a contact on the Search Widget, and pick one of the search suggestions. The name of the contact will then appear in a TextView of the activity.

##### Step 0 - Update Manifest
Add the following line in the activity tag
```xml
android:launchMode="singleTop"
```

##### Step 1 - Update searchable.xml file
Add searchSuggestIntentAction and searchSuggestIntentData properties in the searchable tag.
```xml
android:searchSuggestIntentAction="android.provider.Contacts.SEARCH_SUGGESTION_CLICKED"
android:searchSuggestIntentData="content://com.android.contacts/contacts/lookup"
```
##### Step 2 - Add a TextView in Activity layout to show chosen contact's name
```xml
<TextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:id="@+id/contact_name"
    android:text="----"/>
```

##### Step 3 - Update Activity java file
Finally, inside onNewIntent(), handle the suggestion clicked intent:
```java
if (ContactsContract.Intents.SEARCH_SUGGESTION_CLICKED.equals(intent.getAction())) {
    String displayName = getContactName(intent);
    contactName.setText(displayName);
}
```
where getContactName(Intent) returns the name of the contact using the Uri attached to the intent:
```java
private String getContactName(Intent intent) {
    Cursor phoneCursor = getContentResolver().query(intent.getData(), null, null, null, null);
    phoneCursor.moveToFirst();
    int colNameIndex = phoneCursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);
    String contactName = phoneCursor.getString(colNameIndex);
    phoneCursor.close();
    return contactName;
}
```
