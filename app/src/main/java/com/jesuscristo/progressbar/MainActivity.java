package com.jesuscristo.progressbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressVertical;
    private ProgressBar progressCircular;
    private int progresso = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instanciando os componentes
        progressVertical = findViewById(R.id.progressVetical);
        progressCircular = findViewById(R.id.progressCircular);

        // definindo a visibilidade do progressbar circula como Invisivel
        progressCircular.setVisibility( View.GONE );


    }

    public void carregar(View v ){
        // definindo pogressBar circula como visivel
        progressCircular.setVisibility( View.VISIBLE);

        // definindo a barra de progresso
        this.progresso = this.progresso + 1;
        progressVertical.setProgress( this.progresso );

        if(this.progresso == 10){
            progressCircular.setVisibility( View.GONE);

            //criando um imageView e pegando uma image
            /*ImageView image = new ImageView( getApplicationContext() );
            image.setImageResource(R.drawable.ic_launcher_background)                                                                                ;

            //criando toast
            Toast toast = new Toast( getApplicationContext() );
            toast.setView(image);
            toast.setDuration( Toast.LENGTH_LONG);
            toast.show();*/

           AlertDialog.Builder dialog = new AlertDialog.Builder( this);
           dialog.setIcon( R.drawable.ic_launcher_foreground);
           dialog.setTitle("Jesus Cristo é o SENHOR!");
           dialog.setMessage("Jesus Cristo é o Rei dos Reis");

           dialog.setPositiveButton("Aceito", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialogInterface, int i) {
                   Toast.makeText(getApplicationContext(),
                           "Jesus Cristo vive",
                           Toast.LENGTH_SHORT).show();
               }

           });

           dialog.setNegativeButton("Aceito", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialogInterface, int i) {
                   Toast.makeText(getApplicationContext(),
                           "Jesus é Bom!",
                           Toast.LENGTH_SHORT).show();
               }
           });

           dialog.create();
           dialog.show();

        }
    }
}