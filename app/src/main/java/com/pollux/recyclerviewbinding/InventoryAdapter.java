package com.pollux.recyclerviewbinding;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pollux.recyclerviewbinding.model.BaseModel;
import com.pollux.recyclerviewbinding.model.Collection;
import com.pollux.recyclerviewbinding.model.Product;
import com.pollux.recyclerviewbinding.model.Recipe;
import com.pollux.recyclerviewbinding.model.holder.BaseViewHolder;

import java.util.List;

import static com.pollux.recyclerviewbinding.model.Constants.ViewType;

/**
 * Created by sreekumar on 7/24/17.
 */

public class InventoryAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<? extends BaseModel> mList;
    private LayoutInflater mInflator;

    public InventoryAdapter(List<? extends BaseModel> list, Context context) {
        this.mList = list;
        this.mInflator = LayoutInflater.from(context);
    }

    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case ViewType.COLLECTION_TYPE:
                return new CollectionHolder(mInflator.inflate(R.layout.type_collection,parent,false));
            case ViewType.PRODUCT:
                return new ProductHolder(mInflator.inflate(R.layout.type_product,parent,false));
            case ViewType.RECIPE_TYPE:
                return new RecipeHolder(mInflator.inflate(R.layout.type_recipe,parent,false));
        }
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bind(mList.get(position));
    }


    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getViewType();
    }

    public int getItemCount() {
        return mList.size();
    }

    public static class CollectionHolder extends BaseViewHolder<Collection> {
        private TextView mItem;

        public CollectionHolder(View itemView) {
            super(itemView);
            mItem = (TextView) itemView.findViewById(R.id.item);
        }

        @Override
        public void bind(Collection object) {
            mItem.setText(object.getTitle());
        }
    }
    public static class RecipeHolder extends BaseViewHolder<Recipe> {
        private TextView mItem;

        public RecipeHolder(View itemView) {
            super(itemView);
            mItem = (TextView) itemView.findViewById(R.id.item);
        }

        @Override
        public void bind(Recipe object) {
            mItem.setText(object.getTitle());
        }
    }


    public static class ProductHolder extends BaseViewHolder<Product> {
        private TextView mItem;

        public ProductHolder(View itemView) {
            super(itemView);
            mItem = (TextView) itemView.findViewById(R.id.item);
        }

        @Override
        public void bind(Product object) {
            mItem.setText(object.getTitle());
        }
    }


}
