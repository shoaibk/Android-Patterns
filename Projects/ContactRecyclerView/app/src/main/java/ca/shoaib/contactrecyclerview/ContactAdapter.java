package ca.shoaib.contactrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactHolder> {

    private List<Contact> mContacts;
    public ContactAdapter(List<Contact> contacts) {
        mContacts = contacts;
    }

    @Override
    public ContactHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item_contact, parent, false);
        return new ContactHolder(parent.getContext(), view);
    }

    @Override
    public void onBindViewHolder(ContactHolder holder, int position) {
        Contact contact = mContacts.get(position);
        holder.bindContact(contact);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
