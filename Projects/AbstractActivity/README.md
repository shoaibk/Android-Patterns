#### Abstract Activity

##### 1. Create Activity Layout
Create layout of the activity that will host the fragment in ```activity_fragment.xml```. It will have only a FrameLayout element, which will act as the container of the fragment.

```xml
<?xml version="1.0" encoding="utf-8" ?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/fragment_container"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

##### 2. Create an Abstract Activity Class
Create abstract class SingleFragmentActivity which has an abstract method ```createFragment()``` that returns a fragment.
In its onCreate() method, add an instance of the fragment to the container (FrameLayout).

```java
public abstract class SingleFragmentActivity extends AppCompatActivity {
    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
```

3. Create Fragment
Define a new Fragment class HelloFragment by extending Fragment. It will need it's own layout, fragment_hello.xml.
```
public class HelloFragment extends Fragment {

    public HelloFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hello, container, false);
    }
}
```

4. Create an Activity by Extending the Abstract Activity
```java
public class MainActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new HelloFragment();
    }
}
```
