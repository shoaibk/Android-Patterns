#### AppCompatTheme
Shows how to customize AppComat Theme to add material design palette.

##### Step 0 - Choose AppCompat Theme
In res -> values -> styles.xml file, make sure the app is using AppCompat theme:

```xml
<resources>
    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
    </style>
</resources>
```

##### Step 1 - Create colors.xml
- Right click on res -> values folder
- Choose New -> Values resource file
- Enter file name colors.xml

##### Step 2 - Define colors
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="primary">#3f51b5</color>
    <color name="primary_dark">#1a237e</color>
    <color name="accent">#c5cae9</color>
</resources>
```

##### Step 3 - Update styles file
In styles.xml file, use the newly created colors.

```xml
<resources>
    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/primary</item>
        <item name="colorPrimaryDark">@color/primary_dark</item>
        <item name="colorAccent">@color/accent</item>
    </style>
</resources>
```

![App Screenshot](http://i.imgur.com/WeGcFSn.png =100x)
