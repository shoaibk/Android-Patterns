#### Dynamic Fragment
Using Fragment dynamically inside an Activity by using FragmentManager.

![diagram](pic1.png)

##### 1. Create Fragment Layout
Create layout of the Fragment in res - layout - fragment_hello.xml.

##### 2. Create HelloFragment
Create a Fragment subclass and in its onCreateView, inflate the xml layout created in step 1.

```java
@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hello, container, false);
    }
```

##### 3. Create Activity Layout
The activity layout should have only a FrameLayout, which acts as the container of the fragment.

```xml
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/fragment_container"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

##### 4. Create Activity
Create Activity subclass and add the fragment into the activity's layout in runtime using FragmentManager.

```java
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new HelloFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
```