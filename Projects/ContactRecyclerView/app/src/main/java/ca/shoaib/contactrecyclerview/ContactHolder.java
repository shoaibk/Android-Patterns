package ca.shoaib.contactrecyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ContactHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private Contact mContact;
    private Toast toast;
    private Context mContext;

    private TextView mNameTextView;
    private TextView mEmailTextView;

    @SuppressLint("ShowToast")
    public ContactHolder(Context context, View itemView) {
        super(itemView);
        mContext = context;
        itemView.setOnClickListener(this);
        toast = Toast.makeText(mContext, "", Toast.LENGTH_SHORT);

        mNameTextView = (TextView) itemView.findViewById(R.id.list_item_contact_name);
        mEmailTextView = (TextView) itemView.findViewById(R.id.list_item_contact_email);

    }

    public void bindContact(Contact contact) {
        mContact = contact;
        mNameTextView.setText(mContact.getName());
        mEmailTextView.setText(mContact.getEmail());
    }

    @Override
    public void onClick(View v) {
        toast = Toast.makeText(mContext, mContact.getName() + " clicked!", Toast.LENGTH_SHORT);
        toast.setText(mContact.getName() + " clicked!");
        toast.show();
    }
}
