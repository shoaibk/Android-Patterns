#### Android-Patterns
This project contains a list of common Android programming patterns that arise frequently. 

It's not that there are not enough examples out there, but most of the time the referece implementations are not to the point, and try to do too many things at the same time.

The aim of this work is to have a set of reference implementations that someone can follow through as a list of steps. In order to do that, we will handle each pattern at a time, independent of the others, as much as possible. I realize that sometimes it won't be just possible. For example, in order to implement a Content Provider, one needs to implement a database first. But we will try to keep dependency to a minimum.
___

#### Views
- [LauncherIcon] (https://github.com/shoaibk/Android-Patterns/tree/master/Projects/LauncherIcon) - Importing a launcher icon into Android Studio.
- [AppCompatTheme](https://github.com/shoaibk/Android-Patterns/tree/master/Projects/AppCompatTheme) Using Material Design theme in your app.

#### Layouts
- [LayoutDemo](https://github.com/shoaibk/Android-Patterns/tree/master/Projects/LayoutDemo) Shows how different layouts work

#### Fragments
- [FixedFragment](https://github.com/shoaibk/Android-Patterns/tree/master/Projects/FixedFragment) Using a fixed fragment inside an activity.
- [DynamicFragment](https://github.com/shoaibk/Android-Patterns/tree/master/Projects/DynamicFragment) Using a dynamic fragment inside an activity.

#### Adapters
- [BookArrayAdapter] (https://github.com/shoaibk/Android-Patterns/tree/master/Projects/BookArrayAdapter) - Create a custom ArrayAdapter and use in a ListView

#### Database, Content Provider, Loader
- [SearchContacts](https://github.com/shoaibk/Android-Patterns/tree/master/Projects/SearchContacts) Using a Search Widget, user can search for a contact. As the user types in, matching contacts appear as search suggestions.
- [SearchAndViewContact](https://github.com/shoaibk/Android-Patterns/tree/master/Projects/SearchAndViewContact) - User can pick a search suggestion and view the details of a particular contact.
- [BooksDB] (https://github.com/shoaibk/Android-Patterns/tree/master/Projects/BooksDB) - Create a simple SQLite database containing one table
- [SiteProvider] (https://github.com/shoaibk/Android-Patterns/tree/master/Projects/SiteProvider) - Create a Content Provider for a database of websites.

#### Notification
- [SimpleNotification] (https://github.com/shoaibk/Android-Patterns/tree/master/Projects/SimpleNotification)- Creates a simple notification. When clicked, the notification takes you to another Activity.

#### Service
- [PeriodicService] (https://github.com/shoaibk/Android-Patterns/tree/master/Projects/PeriodicService) - Peridically triggers a service.

#### Todo
- RecyclerView
- CardView
- GridView
- Using Picasso
- Using RetroFit
- Toolbar/Actionbar
- SharedPreference
- Settings
- CarCursorAdapter - custom CursorAdapter for Car. A Car has Make, Model, Year, HorsePower, Description, logoUrl and ImageUrl. It shows how to load data using cursor adapter into a list. It integrates concepts from SQLiteDatabase, ContentProvider, CursorAdapter and Loader
- PedometerService - create a background service to count steps
- StepNotification - create a notification to show how many steps the user has taken
- CreateCard
- UsingRetrofit
