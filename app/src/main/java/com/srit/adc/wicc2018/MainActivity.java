package com.srit.adc.wicc2018;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] mNavigationDrawerItemTitles;
    private DrawerLayout mDrawerLayout;
//    private FrameLayout frameLayout;
    private ListView mDrawerList;
    Toolbar toolbar;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    android.support.v7.app.ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        frameLayout=(FrameLayout)findViewById(R.id.content_frame);
        mTitle = mDrawerTitle = getTitle();
        mNavigationDrawerItemTitles= getResources().getStringArray(R.array.navigation_drawer_items_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        setupToolbar();

        DataModel[] drawerItem = new DataModel[11];

        drawerItem[0] = new DataModel(R.drawable.speaker, "Speakers");
        drawerItem[8] = new DataModel(R.drawable.advisory_committee, "advisory committee");
        drawerItem[1] = new DataModel(R.drawable.organization, "About Organization");
        drawerItem[4] = new DataModel(R.drawable.organization, "WiCC");
        drawerItem[3] = new DataModel(R.drawable.general_chair, "General Co-Chair");
        drawerItem[2] = new DataModel(R.drawable.guidlines, "General chair");
        drawerItem[5] = new DataModel(R.drawable.important_dates, "important_dates");
        drawerItem[9] = new DataModel(R.drawable.organization, "Organized by");
        drawerItem[7] = new DataModel(R.drawable.organization, "registration");
        drawerItem[10] = new DataModel(R.drawable.organization, "technical_committee");
        drawerItem[6] = new DataModel(R.drawable.themes, "themes");

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(true);

        DrawerItemCustomAdapter adapter = new DrawerItemCustomAdapter(this, R.layout.list_view_item_row, drawerItem);
        mDrawerList.setAdapter(adapter);
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        setupDrawerToggle();
//Set WICC as default frame
        Fragment fragment=new WICC();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

        mDrawerList.setItemChecked(4, true);
        mDrawerList.setSelection(4);
        setTitle(mNavigationDrawerItemTitles[4]);
        mDrawerLayout.closeDrawer(mDrawerList);

    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }

    }

    private void selectItem(int position) {

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new Speakers();
                break;
            case 8:
                fragment = new AdvisoryCommittee();
                break;
            case 1:
                fragment = new OrganizationFragment();
                break;
            case 10:
                fragment = new TechnicalCommitteeCommittee();
                break;
            case 7:
                fragment = new Registration();
                break;
            case 5:
                fragment = new ImportantDates();
                break;
            case 4:
                fragment = new WICC();
                break;
            case 3:
                fragment = new CoChair();
                break;
            case 2:
                fragment = new GeneralChair();
                break;
            case 9:
                fragment = new OrganizedBy();
                break;
            case 6:
                fragment = new Themes();
                break;
            default:
                fragment = new WICC();
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

            mDrawerList.setItemChecked(position, true);
            mDrawerList.setSelection(position);
            setTitle(mNavigationDrawerItemTitles[position]);
            mDrawerLayout.closeDrawer(mDrawerList);

        } else {
            Log.e("MainActivity", "Error in creating fragment");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getSupportActionBar().setTitle(mTitle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    void setupToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    void setupDrawerToggle(){
        mDrawerToggle = new android.support.v7.app.ActionBarDrawerToggle(this,mDrawerLayout,toolbar,R.string.app_name, R.string.app_name);
        //This is necessary to change the icon of the Drawer Toggle upon state change.
        mDrawerToggle.syncState();
    }

}