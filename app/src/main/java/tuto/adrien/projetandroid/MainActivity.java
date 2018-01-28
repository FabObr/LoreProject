package tuto.adrien.projetandroid;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import tuto.adrien.projetandroid.BC.bc;
import tuto.adrien.projetandroid.Cata.Cata;
import tuto.adrien.projetandroid.Legion.Legion;
import tuto.adrien.projetandroid.Mop.Mop;
import tuto.adrien.projetandroid.Vanilla.Vanilla;
import tuto.adrien.projetandroid.Wod.Wod;
import tuto.adrien.projetandroid.Woltk.Wotlk;

public class MainActivity extends AppCompatActivity {


    //Permet de créer une notification
    public void createNotificationVanilla(View view) {

        Bitmap vanillaIcon = BitmapFactory.decodeResource(getResources(), R.drawable.vanilla_notif);

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

        Notification notification = new Notification.Builder(this)

                //Construit la notification
                .setLargeIcon(vanillaIcon)
                .setSmallIcon(R.drawable.vanilla_logo) //Small Icon en haut
                .setTicker("Notification Vanilla")
                .setWhen(System.currentTimeMillis())
                .setContentTitle("Notification Vanilla")
                .setContentText("Vous consultez l'extension Vanilla")
                .setContentIntent(pendingIntent)
                .build();

        //Construit la notification et l'envois
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        nm.notify(0, notification);
    }

    //Permet de créer une notification
    public void createNotificationBc(View view) {

        Bitmap vanillaIcon = BitmapFactory.decodeResource(getResources(), R.drawable.vanilla_notif);

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

        Notification notification = new Notification.Builder(this)

                //Construit la notification
                .setLargeIcon(vanillaIcon)
                .setSmallIcon(R.drawable.vanilla_logo) //Small Icon en haut
                .setTicker("Notification BC")
                .setWhen(System.currentTimeMillis())
                .setContentTitle("Notification BC")
                .setContentText("Vous consultez l'extension Burning Crusade")
                .setContentIntent(pendingIntent)
                .build();

        //Construit la notification et l'envois
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        nm.notify(0, notification);
    }

    //Permet de créer une notification
    public void createNotificationWotlk(View view) {

        Bitmap vanillaIcon = BitmapFactory.decodeResource(getResources(), R.drawable.vanilla_notif);

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

        Notification notification = new Notification.Builder(this)

                //Construit la notification
                .setLargeIcon(vanillaIcon)
                .setSmallIcon(R.drawable.vanilla_logo) //Small Icon en haut
                .setTicker("Notification Wotlk")
                .setWhen(System.currentTimeMillis())
                .setContentTitle("Notification Wotlk")
                .setContentText("Vous consultez l'extension Wrath of the Lich King")
                .setContentIntent(pendingIntent)
                .build();

        //Construit la notification et l'envois
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        nm.notify(0, notification);
    }

    //Permet de créer une notification
    public void createNotificationCata(View view) {

        Bitmap vanillaIcon = BitmapFactory.decodeResource(getResources(), R.drawable.vanilla_notif);

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

        Notification notification = new Notification.Builder(this)

                //Construit la notification
                .setLargeIcon(vanillaIcon)
                .setSmallIcon(R.drawable.vanilla_logo) //Small Icon en haut
                .setTicker("Notification Cataclysm")
                .setWhen(System.currentTimeMillis())
                .setContentTitle("Notification Cataclysm")
                .setContentText("Vous consultez l'extension Cataclysm")
                .setContentIntent(pendingIntent)
                .build();

        //Construit la notification et l'envois
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        nm.notify(0, notification);
    }

    //Permet de créer une notification
    public void createNotificationMop(View view) {

        Bitmap vanillaIcon = BitmapFactory.decodeResource(getResources(), R.drawable.vanilla_notif);

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

        Notification notification = new Notification.Builder(this)

                //Construit la notification
                .setLargeIcon(vanillaIcon)
                .setSmallIcon(R.drawable.vanilla_logo) //Small Icon en haut
                .setTicker("Notification Mop")
                .setWhen(System.currentTimeMillis())
                .setContentTitle("Notification Mop")
                .setContentText("Vous consultez l'extension Mist of Pandaria")
                .setContentIntent(pendingIntent)
                .build();

        //Construit la notification et l'envois
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        nm.notify(0, notification);
    }

    //Permet de créer une notification
    public void createNotificationWod(View view) {

        Bitmap vanillaIcon = BitmapFactory.decodeResource(getResources(), R.drawable.vanilla_notif);

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

        Notification notification = new Notification.Builder(this)

                //Construit la notification
                .setLargeIcon(vanillaIcon)
                .setSmallIcon(R.drawable.vanilla_logo) //Small Icon en haut
                .setTicker("Notification WoD")
                .setWhen(System.currentTimeMillis())
                .setContentTitle("Notification WoD")
                .setContentText("Vous consultez l'extension Warlords of Draenor")
                .setContentIntent(pendingIntent)
                .build();

        //Construit la notification et l'envois
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        nm.notify(0, notification);
    }

    //Permet de créer une notification
    public void createNotificationLegion(View view) {

        Bitmap vanillaIcon = BitmapFactory.decodeResource(getResources(), R.drawable.vanilla_notif);

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

        Notification notification = new Notification.Builder(this)

                //Construit la notification
                .setLargeIcon(vanillaIcon)
                .setSmallIcon(R.drawable.vanilla_logo) //Small Icon en haut
                .setTicker("Notification Legion")
                .setWhen(System.currentTimeMillis())
                .setContentTitle("Notification Legion")
                .setContentText("Vous consultez l'extension Legion")
                .setContentIntent(pendingIntent)
                .build();

        //Construit la notification et l'envois
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        nm.notify(0, notification);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final ImageButton vanillabutton = findViewById(R.id.vanillabutton);
        vanillabutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Vanilla.class);
                startActivity(intent);
                createNotificationVanilla(view);
            }
        });

        final ImageButton bcbutton = findViewById(R.id.bcbutton);
        bcbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, bc.class);
                startActivity(intent2);
                createNotificationBc(view);
            }
        });

        final ImageButton wotlkbutton = findViewById(R.id.wotlkbutton);
        wotlkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, Wotlk.class);
                startActivity(intent3);
                createNotificationWotlk(view);
            }
        });

        final ImageButton catabutton = findViewById(R.id.catabutton);
        catabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, Cata.class);
                startActivity(intent4);
                createNotificationCata(view);
            }
        });

        final ImageButton mopbutton = findViewById(R.id.mopbutton);
        mopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, Mop.class);
                startActivity(intent5);
                createNotificationMop(view);
            }
        });

        final ImageButton wodbutton = findViewById(R.id.wodbutton);
        wodbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(MainActivity.this, Wod.class);
                startActivity(intent6);
                createNotificationWod(view);
            }
        });

        final ImageButton legionbutton = findViewById(R.id.legionbutton);
        legionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(MainActivity.this, Legion.class);
                startActivity(intent7);
                createNotificationLegion(view);
            }
        });

    }
}
