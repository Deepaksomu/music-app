package com.example.deepak.musicapp;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        // find view that shows the album activity
        Button Album = (Button)findViewById(R.id.Album);

        //set  click listener on the view
        Album.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                // creat new intent to open album activity
                Intent AlbumIntent = new Intent( AlbumActivity.this, AlbumActivity.class);

                // start the new activity

                startActivity(AlbumIntent);
            }

        });

        // find view that shows the artist activity
        Button Artist = (Button)findViewById(R.id.Artist);

        //set  click listener on the view
        Artist.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                // creat new intent to open album activity
                Intent ArtistIntent = new Intent( AlbumActivity.this, ArtistActivity.class);

                // start the new activity

                startActivity(ArtistIntent);
            }

        });


        // find view that shows the genere activity
        Button Genere = (Button)findViewById(R.id.Genere);

        //set  click listener on the view
        Genere.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                // creat new intent to open album activity
                Intent GenereIntent = new Intent( AlbumActivity.this, GenereActivity.class);

                // start the new activity

                startActivity(GenereIntent);
            }

        });


        // find view that shows the playlist activity
        Button Playlist = (Button)findViewById(R.id.Playlist);

        //set  click listener on the view
        Playlist.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                // creat new intent to open album activity
                Intent PlaylistIntent = new Intent( AlbumActivity.this, PlaylistActivity.class);

                // start the new activity

                startActivity(PlaylistIntent);
            }

        });
    }
}
