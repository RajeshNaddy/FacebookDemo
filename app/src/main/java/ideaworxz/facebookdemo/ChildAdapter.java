package ideaworxz.facebookdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import ideaworxz.facebookdemo.Assymetric.AGVRecyclerViewAdapter;
import ideaworxz.facebookdemo.Assymetric.AsymmetricItem;
import ideaworxz.facebookdemo.model.ItemImage;


class ChildAdapter extends AGVRecyclerViewAdapter<ViewHolder> {
    private final List<ItemImage> items;
    private int mDisplay = 0;
    private int mTotal = 0;
    Context context;

    public ChildAdapter(Context context, List<ItemImage> items, int mDisplay, int mTotal) {
        this.items = items;
        this.mDisplay = mDisplay;
        this.mTotal = mTotal;
        this.context = context;
        notifyDataSetChanged();

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("RecyclerViewActivity", "onCreateView");
        return new ViewHolder(parent, viewType, items);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d("RecyclerViewActivity", "onBindView position=" + position);

        Glide.with(context).load(String.valueOf(items.get(position).getImagePath()))
                .override(300, 300)
                .centerCrop()
                .into(holder.mImageView);
        // holder. mImageView.setImageResource(R.drawable.raina);
        holder.textView.setText("+" + (mTotal - mDisplay));
        if (mTotal > mDisplay) {
            if (position == mDisplay - 1) {
                holder.textView.setVisibility(View.VISIBLE);
                holder.mImageView.setAlpha(72);
            } else {
                holder.textView.setVisibility(View.INVISIBLE);
                holder.mImageView.setAlpha(255);
            }
        } else {
            holder.mImageView.setAlpha(255);
            holder.textView.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public AsymmetricItem getItem(int position) {
        return (AsymmetricItem) items.get(position);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}


class ViewHolder extends RecyclerView.ViewHolder {
    ImageView mImageView;
    TextView textView;

    public ViewHolder(ViewGroup parent, int viewType, List<ItemImage> items) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item, parent, false));

        mImageView = (ImageView) itemView.findViewById(R.id.mImageView);
        textView = (TextView) itemView.findViewById(R.id.tvCount);

    }
}
