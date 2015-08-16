### SearchContacts
Shows the usage of SearchView widget when it is connected to Contacts content provider of the phone.

#### Steps

##### Add searchable.xml
Create file res -> xml -> searchable.xml and set searchSuggestAuthority to com.android.contacts.

##### Initialize Searchview widget
In your activity containing the SearchView widget, initialize it with SearchableInfo parameter.

```java
SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
final SearchView searchView = (SearchView) findViewById(R.id.searchView);
SearchableInfo searchableInfo = searchManager.getSearchableInfo(getComponentName());
searchView.setSearchableInfo(searchableInfo);
```
