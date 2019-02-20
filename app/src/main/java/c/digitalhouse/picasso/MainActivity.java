package c.digitalhouse.picasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ListItem> textList;
    private Adapter adapter;
    private RecyclerView itemRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        itemRecycler = findViewById( R.id.itemRecycler );
        itemRecycler.setLayoutManager(new LinearLayoutManager(this));


        textList = new ArrayList<>(  );

        ListItem listItem = new ListItem(  );


        listItem.setImageUrl( "https://img.elo7.com.br/product/zoom/1ADE69C/flor-gigante-para-painel-de-vitrine-bianca-8-unidades-lembrancinha-brinde.jpg" );
        listItem.setTexto( "Flor" );


        textList.add( listItem );

        ListItem listItem1 = new ListItem(  );
        listItem1.setImageUrl( "https://static.significados.com.br/foto/girassol.jpg" );
        listItem1.setTexto( "Girassol" );
        textList.add( listItem );


        textList.add( listItem1 );
        textList.add( listItem );
        textList.add( listItem1 );
        textList.add( listItem );
        textList.add( listItem1 );
        textList.add( listItem );
        textList.add( listItem1 );


        adapter = new Adapter(textList,this  );
        itemRecycler.setAdapter( adapter );

    }
}
