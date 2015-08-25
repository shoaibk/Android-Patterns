#### Android-Patterns
This project contains a list of common Android programming patterns that arise frequently. 

It's not that there are not enough examples out there, but most of the time the referece implementations are not to the point, and try to do too many things at the same time.

The aim of this work is to have a set of reference implementations that someone can follow through as a list of steps. In order to do that, we will handle each pattern at a time, independent of the others, as much as possible. I realize that sometimes it won't be just possible. For example, in order to implement a Content Provider, one needs to implement a database first. But we will try to keep dependency to a minimum.
___

#### Project list
- [AppCompatTheme](https://github.com/shoaibk/Android-Patterns/tree/master/Projects/AppCompatTheme) Using Material Design theme in your app.
- [SearchContacts](https://github.com/shoaibk/Android-Patterns/tree/master/Projects/SearchContacts) Using a Search Widget, user can search for a contact. As the user types in, matching contacts appear as search suggestions.
- [SearchAndViewContact](https://github.com/shoaibk/Android-Patterns/tree/master/Projects/SearchAndViewContact) - User can pick a search suggestion and view the details of a particular contact.
- [LauncherIcon] (https://github.com/shoaibk/Android-Patterns/tree/master/Projects/LauncherIcon) - Importing a launcher icon into Android Studio.
- [BooksDB] (https://github.com/shoaibk/Android-Patterns/tree/master/Projects/BooksDB) - Create a simple SQLite database containing one table
- [BookArrayAdapter] (https://github.com/shoaibk/Android-Patterns/tree/master/Projects/BookArrayAdapter) - Create a custom ArrayAdapter and use in a ListView
- [SiteProvider] (https://github.com/shoaibk/Android-Patterns/tree/master/Projects/SiteProvider) - Create a Content Provider for a database of websites.

#### Todo
- BookCursorAdapter - custom CursorAdapter for Book model
- BookProvider
