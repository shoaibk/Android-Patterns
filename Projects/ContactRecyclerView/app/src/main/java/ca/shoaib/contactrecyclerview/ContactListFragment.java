package ca.shoaib.contactrecyclerview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ContactListFragment extends Fragment {
    public static final String TAG = ContactListFragment.class.getSimpleName();

    private RecyclerView mRecyclerView;
    private ContactAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact_list, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.crime_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        RecyclerView.ItemDecoration itemDecoration = new
                DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST);
        mRecyclerView.addItemDecoration(itemDecoration);

        updateUI();
        return view;
    }

    private void updateUI() {
        List<Contact> contacts = Contact.getContacts();

        /*for (Crime crime : crimes) {
            Log.d(TAG, crime.toString());
        }*/

        mAdapter = new ContactAdapter(contacts);
        mRecyclerView.setAdapter(mAdapter);
    }

}
