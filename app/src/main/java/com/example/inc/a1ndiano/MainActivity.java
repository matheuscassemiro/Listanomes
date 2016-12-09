package com.example.inc.a1ndiano;




        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;

        import android.app.Activity;
        import android.os.Bundle;
        import android.widget.ExpandableListView;


public class MainActivity extends Activity {
    HashMap<String, List<String>> Filmes_Categoria;
    List<String> Filmes_Lista;
    ExpandableListView Exp_list;
    MoviesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Exp_list = (ExpandableListView) findViewById(R.id.exp_list);
        Filmes_Categoria = DataProvider.getInfo();
        Filmes_Lista = new ArrayList<String>(Filmes_Categoria.keySet());
        adapter = new MoviesAdapter(this, Filmes_Categoria, Filmes_Lista);
        Exp_list.setAdapter(adapter);
    }
}
