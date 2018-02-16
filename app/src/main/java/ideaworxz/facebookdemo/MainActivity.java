package ideaworxz.facebookdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import ideaworxz.facebookdemo.Assymetric.AsymmetricRecyclerView;
import ideaworxz.facebookdemo.Assymetric.AsymmetricRecyclerViewAdapter;
import ideaworxz.facebookdemo.Assymetric.Utils;
import ideaworxz.facebookdemo.model.ItemImage;
import ideaworxz.facebookdemo.model.ItemList;
import ideaworxz.facebookdemo.model.SpacesItemDecoration;

public class MainActivity extends AppCompatActivity {

        private int mDisplay= 5;
        private int mTotal= 5;
        int ocount;
        ArrayList<ItemImage> Pathitems = new ArrayList<>();
        List<ItemList> mItemList = new ArrayList<>();
        int currentOffset = 0;

        //I have used same images
        public String Image1 = "http://p.imgci.com/db/PICTURES/CMS/263600/263697.20.jpg";
        public String Image2 = "http://p.imgci.com/db/PICTURES/CMS/263600/263697.20.jpg";
        public String Image3 = "http://p.imgci.com/db/PICTURES/CMS/263600/263697.20.jpg";
        public String Image4 = "http://p.imgci.com/db/PICTURES/CMS/263600/263697.20.jpg";
        AsymmetricRecyclerView recyclerView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            final EditText getvalue = findViewById(R.id.getvalue);
            Button done = findViewById(R.id.Done);

            done.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String count = getvalue.getText().toString().trim();
                    ocount = Integer.parseInt(count);
                    prepareMovieData(ocount);

                    for(int i =0;i<mItemList.size();i++)
                    {

                        ItemList item = mItemList.get(i);
                        ChildAdapter adapter = new ChildAdapter(MainActivity.this,item.getImages(),mDisplay,ocount);
                        recyclerView.setAdapter(new AsymmetricRecyclerViewAdapter<>(MainActivity.this,recyclerView, adapter));
                    }
                }
            });

            recyclerView = findViewById(R.id.recyclerView);


            recyclerView.setRequestedColumnCount(6);
            recyclerView.setDebugging(true);
            recyclerView.setRequestedHorizontalSpacing(Utils.dpToPx(this, 3));
            recyclerView.addItemDecoration(new SpacesItemDecoration(getResources().getDimensionPixelSize(R.dimen.recycler_padding)));

        }
    private void prepareMovieData(int k) {
        currentOffset = 0;
        if(k == 1)
        {
            ArrayList<ItemImage> mPathitems = new ArrayList<>();

            ItemImage i1 = new ItemImage(1,Image1,Image1);
            i1.setColumnSpan(6);
            i1.setRowSpan(6);
            //i1.setPosition( currentOffset + 0);

            Pathitems.clear();
            mItemList.clear();
            Pathitems.add(i1);

            mPathitems.add(Pathitems.get(0));

            ItemList itemList = new ItemList(k,"User "+(k+1),mPathitems);
            mItemList.add(itemList);
            currentOffset += mPathitems.size();


        }else if(k == 2)
        {
            ArrayList<ItemImage> mPathitems = new ArrayList<>();

            ItemImage i1 = new ItemImage(1,Image1,Image1);
            i1.setColumnSpan(3);
            i1.setRowSpan(3);

            ItemImage i2 = new ItemImage(2,Image2,Image2);
            i2.setColumnSpan(3);
            i2.setRowSpan(3);

            Pathitems.clear();

            Pathitems.add(i1);
            Pathitems.add(i2);

            mItemList.clear();
            for(int i = 0; i < Pathitems.size();i++)
            {

                mPathitems.add(Pathitems.get(i));
                ItemList itemList = new ItemList(k,"User "+(k+1),mPathitems);
                mItemList.add(itemList);
                currentOffset += mPathitems.size();
            }


        }else if(k == 3)
        {
            ArrayList<ItemImage> mPathitems = new ArrayList<>();

            ItemImage i1 = new ItemImage(1,Image1,Image1);
            i1.setColumnSpan(6);
            i1.setRowSpan(3);

            ItemImage i2 = new ItemImage(2,Image2,Image2);
            i2.setColumnSpan(3);
            i2.setRowSpan(3);


            ItemImage i3 = new ItemImage(3,Image3,Image3);
            i3.setColumnSpan(3);
            i3.setRowSpan(3);

            Pathitems.clear();

            Pathitems.add(i1);
            Pathitems.add(i2);
            Pathitems.add(i3);
            mItemList.clear();
            for(int i = 0; i < Pathitems.size();i++)
            {

                mPathitems.add(Pathitems.get(i));
                ItemList itemList = new ItemList(k,"User "+(k+1),mPathitems);
                mItemList.add(itemList);
            }
        }
        else if(k == 4)
        {
            ArrayList<ItemImage> mPathitems = new ArrayList<>();

            ItemImage i1 = new ItemImage(1,Image1,Image1);
            i1.setColumnSpan(3);
            i1.setRowSpan(3);

            ItemImage i2 = new ItemImage(2,Image2,Image2);
            i2.setColumnSpan(3);
            i2.setRowSpan(3);


            ItemImage i3 = new ItemImage(3,Image3,Image3);
            i3.setColumnSpan(3);
            i3.setRowSpan(3);


            ItemImage i4 = new ItemImage(4,Image4,Image4);
            i4.setColumnSpan(3);
            i4.setRowSpan(3);

            Pathitems.clear();

            Pathitems.add(i1);
            Pathitems.add(i2);
            Pathitems.add(i3);
            Pathitems.add(i4);
            mItemList.clear();
            for(int i = 0; i < Pathitems.size();i++)
            {

                mPathitems.add(Pathitems.get(i));
                ItemList itemList = new ItemList(k,"User "+(k+1),mPathitems);
                mItemList.add(itemList);
            }

        }else if(k == 5)
        {
            ArrayList<ItemImage> mPathitems = new ArrayList<>();

            ItemImage i1 = new ItemImage(1,Image1,Image1);
            i1.setColumnSpan(3);
            i1.setRowSpan(3);

            ItemImage i2 = new ItemImage(2,Image2,Image2);
            i2.setColumnSpan(3);
            i2.setRowSpan(3);


            ItemImage i3 = new ItemImage(3,Image3,Image3);
            i3.setColumnSpan(2);
            i3.setRowSpan(3);


            ItemImage i4 = new ItemImage(4,Image4,Image4);
            i4.setColumnSpan(2);
            i4.setRowSpan(3);

            ItemImage i5 = new ItemImage(4,Image4,Image4);
            i5.setColumnSpan(2);
            i5.setRowSpan(3);
            Pathitems.clear();

            Pathitems.add(i1);
            Pathitems.add(i2);
            Pathitems.add(i3);
            Pathitems.add(i4);
            Pathitems.add(i5);
            mItemList.clear();
            for(int i = 0; i < Pathitems.size();i++)
            {

                mPathitems.add(Pathitems.get(i));
                ItemList itemList = new ItemList(k,"User "+(k+1),mPathitems);
                mItemList.add(itemList);
            }

        }
        else
        {
            ArrayList<ItemImage> mPathitems = new ArrayList<>();

            ItemImage i1 = new ItemImage(1,Image1,Image1);
            i1.setColumnSpan(3);
            i1.setRowSpan(3);

            ItemImage i2 = new ItemImage(2,Image2,Image2);
            i2.setColumnSpan(3);
            i2.setRowSpan(3);


            ItemImage i3 = new ItemImage(3,Image3,Image3);
            i3.setColumnSpan(2);
            i3.setRowSpan(3);


            ItemImage i4 = new ItemImage(4,Image4,Image4);
            i4.setColumnSpan(2);
            i4.setRowSpan(3);

            ItemImage i5 = new ItemImage(5,Image4,Image4);
            i5.setColumnSpan(2);
            i5.setRowSpan(3);

            ItemImage i6 = new ItemImage(6,Image4,Image4);
            i6.setColumnSpan(2);
            i6.setRowSpan(3);

            Pathitems.clear();

            Pathitems.add(i1);
            Pathitems.add(i2);
            Pathitems.add(i3);
            Pathitems.add(i4);
            Pathitems.add(i5);
            Pathitems.add(i6);
            mItemList.clear();
            for(int i = 0; i < mDisplay;i++)
            {

                mPathitems.add(Pathitems.get(i));
                ItemList itemList = new ItemList(k,"User "+(i+1),mPathitems);
                mItemList.add(itemList);
            }

        }
        /*ArrayList<ItemImage> mPathitems = new ArrayList<>();
        boolean isCol2Avail = false;

        ItemImage i1 = new ItemImage(1,Image1,Image1);
        int colSpan1 = Math.random() < 0.2f ? 2 : 1;
        int rowSpan1 = colSpan1;
        if(colSpan1 == 2 && !isCol2Avail)
            isCol2Avail = true;
        else if(colSpan1 == 2 && isCol2Avail)
            colSpan1 = 1;

        i1.setColumnSpan(2);
        i1.setRowSpan(2);
        i1.setPosition( currentOffset + 0);

        ItemImage i2 = new ItemImage(2,Image2,Image2);
        int colSpan2 = Math.random() < 0.2f ? 2 : 1;
        if(colSpan2 == 2 && !isCol2Avail)
            isCol2Avail = true;
        else if(colSpan2 == 2 && isCol2Avail)
            colSpan2 = 1;

        int rowSpan2 = colSpan2;
        i2.setColumnSpan(2);
        i2.setRowSpan(2);
        i2.setPosition( currentOffset + 1);


        ItemImage i3 = new ItemImage(3,Image3,Image3);
        int colSpan3 = Math.random() < 0.2f ? 2 : 1;
        if(colSpan3 == 2 && !isCol2Avail)
            isCol2Avail = true;
        else if(colSpan3 == 2 && isCol2Avail)
            colSpan3 = 1;

        int rowSpan3 = colSpan3;
        i3.setColumnSpan(2);
        i3.setRowSpan(2);
        i3.setPosition( currentOffset + 2);

        ItemImage i4 = new ItemImage(4,Image4,Image4);
        int colSpan4 = Math.random() < 0.2f ? 2 : 1;
        if(colSpan4 == 2 && !isCol2Avail)
            isCol2Avail = true;
        else if(colSpan4 == 2 && isCol2Avail)
            colSpan4 = 1;

        int rowSpan4 = colSpan4;
        i4.setColumnSpan(2);
        i4.setRowSpan(2);
        i4.setPosition( currentOffset + 3);*/

       /* ItemImage i5 = new ItemImage(5,Image1,Image1);
        int colSpan5 = Math.random() < 0.2f ? 2 : 1;
        if(colSpan5 == 2 && !isCol2Avail)
            isCol2Avail = true;
        else if(colSpan5 == 2 && isCol2Avail)
            colSpan5 = 1;

        int rowSpan5 = colSpan5;
        i5.setColumnSpan(colSpan5);
        i5.setRowSpan(rowSpan5);
        i5.setPosition( currentOffset + 4);

        ItemImage i6 = new ItemImage(6,Image2,Image2);
        int colSpan6 = Math.random() < 0.2f ? 2 : 1;

        if(colSpan6 == 2 && !isCol2Avail)
            isCol2Avail = true;
        else if(colSpan6 == 2 && isCol2Avail)
            colSpan6 = 1;

        int rowSpan6 = colSpan6;
        i6.setColumnSpan(colSpan6);
        i6.setRowSpan(rowSpan6);
        i6.setPosition( currentOffset + 5);

        ItemImage i7 = new ItemImage(7,Image3,Image3);
        int colSpan7 = Math.random() < 0.2f ? 2 : 1;
        if(colSpan7 == 2 && !isCol2Avail)
            isCol2Avail = true;
        else if(colSpan7 == 2 && isCol2Avail)
            colSpan7 = 1;

        int rowSpan7 = colSpan7;
        i7.setColumnSpan(colSpan7);
        i7.setRowSpan(rowSpan7);
        i7.setPosition( currentOffset + 6);

        ItemImage i8 = new ItemImage(8,Image4,Image4);
        int colSpan8 = Math.random() < 0.2f ? 2 : 1;
        if(colSpan8 == 2 && !isCol2Avail)
            isCol2Avail = true;
        else if(colSpan8 == 2 && isCol2Avail)
            colSpan8 = 1;

        int rowSpan8 = colSpan8;
        i8.setColumnSpan(colSpan8);
        i8.setRowSpan(rowSpan8);
        i8.setPosition( currentOffset + 7);

        ItemImage i9 = new ItemImage(9,Image2,Image2);
        int colSpan9 = Math.random() < 0.2f ? 2 : 1;
        if(colSpan9 == 2 && !isCol2Avail)
            isCol2Avail = true;
        else if(colSpan9 == 2 && isCol2Avail)
            colSpan9 = 1;

        int rowSpan9 = colSpan9;
        i9.setColumnSpan(colSpan9);
        i9.setRowSpan(rowSpan9);
        i9.setPosition( currentOffset + 8);*/

       /* Pathitems.clear();

        Pathitems.add(i1);
        Pathitems.add(i2);
        Pathitems.add(i3);
        Pathitems.add(i4);
        Pathitems.add(i5);
        Pathitems.add(i6);
        Pathitems.add(i7);
        Pathitems.add(i8);
        Pathitems.add(i9);

        for(int i = 0; i < mMaxDisplay_Size;i++)
        {

            mPathitems.add(Pathitems.get(i));
        }

        ItemList itemList = new ItemList(k,"User "+(k+1),mPathitems);
        mItemList.add(itemList);
        currentOffset += mPathitems.size();*/

    }
}
