#### SearchContacts
Shows the usage of SearchView widget when it is connected to Contacts content provider of the phone. As the user starts typing into the SearchView, contacts saved on the device will show up as search suggestions.

##### Step 0 - Add SearchView widget into your activity's layout
```xml
<SearchView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/searchView">
</SearchView>
```


##### Step 1 - Add searchable.xml
Create file res -> xml -> searchable.xml and set searchSuggestAuthority to com.android.contacts.

```xml
<?xml version="1.0" encoding="utf-8"?>
<searchable xmlns:android="http://schemas.android.com/apk/res/android"
    android:label="@string/contact"
    android:hint="@string/contact"
    android:searchSuggestAuthority="com.android.contacts"/>
```

##### Step 2 - Initialize Searchview widget
In your activity containing the SearchView widget, initialize it with SearchableInfo parameter.

```java
SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
final SearchView searchView = (SearchView) findViewById(R.id.searchView);
SearchableInfo searchableInfo = searchManager.getSearchableInfo(getComponentName());
searchView.setSearchableInfo(searchableInfo);
```
##### Step 3 - Update manifest file
###### Add permission for reading contacts
```xml
<uses-permission android:name="android.permission.READ_CONTACTS" />
```

###### Add intent-filter for SEARCH
```xml
<action android:name="android.intent.action.SEARCH" />
```

###### Add meta-data tag
```xml
<meta-data
     android:name="android.app.searchable"
     android:resource="@xml/searchable" />
```
